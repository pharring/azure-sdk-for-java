// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager;
import com.azure.resourcemanager.cognitiveservices.models.CommitmentPlan;
import com.azure.resourcemanager.cognitiveservices.models.HostingModel;
import com.azure.resourcemanager.cognitiveservices.models.SkuTier;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class CommitmentPlansGetByResourceGroupWithResponseMockTests {
    @Test
    public void testGetByResourceGroupWithResponse() throws Exception {
        String responseStr
            = "{\"etag\":\"hl\",\"kind\":\"dhbemzqkzszu\",\"sku\":{\"name\":\"wtglxx\",\"tier\":\"Premium\",\"size\":\"pg\",\"family\":\"crmnzhrgmqgjs\",\"capacity\":1587486803},\"tags\":{\"bakclacjfrnxous\":\"bfrmbodthsqqgvri\",\"lwvsgm\":\"au\"},\"location\":\"hqf\",\"properties\":{\"provisioningState\":\"Creating\",\"commitmentPlanGuid\":\"xmmkjs\",\"hostingModel\":\"ConnectedContainer\",\"planType\":\"wpztekovmribia\",\"current\":{\"tier\":\"plucfotangcfhnyk\",\"count\":1495139625,\"quota\":{\"quantity\":4429427229457258180,\"unit\":\"wlmzqwmvtxnjmxmc\"},\"startDate\":\"udtc\",\"endDate\":\"lxynpdkvgf\"},\"autoRenew\":false,\"next\":{\"tier\":\"jibuzphdug\",\"count\":1030584057,\"quota\":{\"quantity\":7849665071857923107,\"unit\":\"xgjiuqh\"},\"startDate\":\"tozipqwj\",\"endDate\":\"mur\"},\"last\":{\"tier\":\"g\",\"count\":783540465,\"quota\":{\"quantity\":5181301429444209355,\"unit\":\"lkm\"},\"startDate\":\"zoyhlfbcgwg\",\"endDate\":\"oxoebqi\"},\"provisioningIssues\":[\"pnwjfujq\",\"afcba\"]},\"id\":\"hpzpo\",\"name\":\"o\",\"type\":\"yjwpfilkmkkh\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        CognitiveServicesManager manager = CognitiveServicesManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        CommitmentPlan response = manager.commitmentPlans()
            .getByResourceGroupWithResponse("kfvxcnq", "xqpswok", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("dhbemzqkzszu", response.kind());
        Assertions.assertEquals("wtglxx", response.sku().name());
        Assertions.assertEquals(SkuTier.PREMIUM, response.sku().tier());
        Assertions.assertEquals("pg", response.sku().size());
        Assertions.assertEquals("crmnzhrgmqgjs", response.sku().family());
        Assertions.assertEquals(1587486803, response.sku().capacity());
        Assertions.assertEquals("bfrmbodthsqqgvri", response.tags().get("bakclacjfrnxous"));
        Assertions.assertEquals("hqf", response.location());
        Assertions.assertEquals("xmmkjs", response.properties().commitmentPlanGuid());
        Assertions.assertEquals(HostingModel.CONNECTED_CONTAINER, response.properties().hostingModel());
        Assertions.assertEquals("wpztekovmribia", response.properties().planType());
        Assertions.assertEquals("plucfotangcfhnyk", response.properties().current().tier());
        Assertions.assertEquals(1495139625, response.properties().current().count());
        Assertions.assertEquals(false, response.properties().autoRenew());
        Assertions.assertEquals("jibuzphdug", response.properties().next().tier());
        Assertions.assertEquals(1030584057, response.properties().next().count());
    }
}
