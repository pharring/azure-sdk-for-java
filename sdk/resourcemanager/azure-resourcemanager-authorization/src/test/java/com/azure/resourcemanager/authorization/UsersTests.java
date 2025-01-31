// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.resourcemanager.authorization;

import com.azure.resourcemanager.authorization.models.ActiveDirectoryUser;
import com.azure.resourcemanager.resources.fluentcore.arm.CountryIsoCode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class UsersTests extends GraphRbacManagementTest {
    @Test
    @Disabled("Need a specific domain")
    public void canGetUserByEmail() throws Exception {
        ActiveDirectoryUser user = authorizationManager.users().getByName("admin@azuresdkteam.onmicrosoft.com");
        Assertions.assertEquals("Admin", user.name());
    }

    @Test
    @Disabled("Need a specific domain")
    public void canGetUserByForeignEmail() throws Exception {
        ActiveDirectoryUser user = authorizationManager.users().getByName("jianghlu@microsoft.com");
        Assertions.assertEquals("Jianghao Lu", user.name());
    }

    @Test
    @Disabled("Need a specific domain")
    public void canGetUserByDisplayName() throws Exception {
        ActiveDirectoryUser user = authorizationManager.users().getByName("Reader zero");
        Assertions.assertEquals("Reader zero", user.name());
    }

    @Test
    public void canCreateUser() throws Exception {
        String name = generateRandomResourceName("user", 16);
        ActiveDirectoryUser user = authorizationManager.users()
            .define("Automatic " + name)
            .withEmailAlias(name)
            .withPassword(password())
            .withPromptToChangePasswordOnLogin(true)
            .create();

        try {
            Assertions.assertNotNull(user);
            Assertions.assertNotNull(user.id());
            Assertions.assertNotNull(authorizationManager.users().getById(user.id()));
        } finally {
            authorizationManager.users().deleteById(user.id());
        }
    }

    @Test
    public void canUpdateUser() throws Exception {
        String name = generateRandomResourceName("user", 16);
        ActiveDirectoryUser user = authorizationManager.users()
            .define("Test " + name)
            .withEmailAlias(name)
            .withPassword(password())
            .create();

        try {
            user = user.update().withUsageLocation(CountryIsoCode.AUSTRALIA).apply();

            Assertions.assertEquals(CountryIsoCode.AUSTRALIA, user.usageLocation());

            ActiveDirectoryUser finalUser = user;
            Assertions
                .assertTrue(authorizationManager.users().list().stream().anyMatch(x -> x.id().equals(finalUser.id())));
        } finally {
            authorizationManager.users().deleteById(user.id());
        }
    }
}
