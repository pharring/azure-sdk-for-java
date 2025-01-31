// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.networkcloud.models.BmcKeySetDetailedStatus;
import com.azure.resourcemanager.networkcloud.models.BmcKeySetPrivilegeLevel;
import com.azure.resourcemanager.networkcloud.models.BmcKeySetProvisioningState;
import com.azure.resourcemanager.networkcloud.models.ExtendedLocation;
import com.azure.resourcemanager.networkcloud.models.KeySetUser;
import com.azure.resourcemanager.networkcloud.models.KeySetUserStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** BmcKeySet represents the baseboard management controller key set. */
@Fluent
public final class BmcKeySetInner extends Resource {
    /*
     * ExtendedLocation represents the Azure custom location where the resource will be created.
     *
     * The extended location of the cluster associated with the resource.
     */
    @JsonProperty(value = "extendedLocation", required = true)
    private ExtendedLocation extendedLocation;

    /*
     * BmcKeySetProperties represents the properties of baseboard management controller key set.
     *
     * The list of the resource properties.
     */
    @JsonProperty(value = "properties", required = true)
    private BmcKeySetProperties innerProperties = new BmcKeySetProperties();

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of BmcKeySetInner class. */
    public BmcKeySetInner() {
    }

    /**
     * Get the extendedLocation property: ExtendedLocation represents the Azure custom location where the resource will
     * be created.
     *
     * <p>The extended location of the cluster associated with the resource.
     *
     * @return the extendedLocation value.
     */
    public ExtendedLocation extendedLocation() {
        return this.extendedLocation;
    }

    /**
     * Set the extendedLocation property: ExtendedLocation represents the Azure custom location where the resource will
     * be created.
     *
     * <p>The extended location of the cluster associated with the resource.
     *
     * @param extendedLocation the extendedLocation value to set.
     * @return the BmcKeySetInner object itself.
     */
    public BmcKeySetInner withExtendedLocation(ExtendedLocation extendedLocation) {
        this.extendedLocation = extendedLocation;
        return this;
    }

    /**
     * Get the innerProperties property: BmcKeySetProperties represents the properties of baseboard management
     * controller key set.
     *
     * <p>The list of the resource properties.
     *
     * @return the innerProperties value.
     */
    private BmcKeySetProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /** {@inheritDoc} */
    @Override
    public BmcKeySetInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public BmcKeySetInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the azureGroupId property: The object ID of Azure Active Directory group that all users in the list must be
     * in for access to be granted. Users that are not in the group will not have access.
     *
     * @return the azureGroupId value.
     */
    public String azureGroupId() {
        return this.innerProperties() == null ? null : this.innerProperties().azureGroupId();
    }

    /**
     * Set the azureGroupId property: The object ID of Azure Active Directory group that all users in the list must be
     * in for access to be granted. Users that are not in the group will not have access.
     *
     * @param azureGroupId the azureGroupId value to set.
     * @return the BmcKeySetInner object itself.
     */
    public BmcKeySetInner withAzureGroupId(String azureGroupId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BmcKeySetProperties();
        }
        this.innerProperties().withAzureGroupId(azureGroupId);
        return this;
    }

    /**
     * Get the detailedStatus property: The more detailed status of the key set.
     *
     * @return the detailedStatus value.
     */
    public BmcKeySetDetailedStatus detailedStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().detailedStatus();
    }

    /**
     * Get the detailedStatusMessage property: The descriptive message about the current detailed status.
     *
     * @return the detailedStatusMessage value.
     */
    public String detailedStatusMessage() {
        return this.innerProperties() == null ? null : this.innerProperties().detailedStatusMessage();
    }

    /**
     * Get the expiration property: The date and time after which the users in this key set will be removed from the
     * baseboard management controllers.
     *
     * @return the expiration value.
     */
    public OffsetDateTime expiration() {
        return this.innerProperties() == null ? null : this.innerProperties().expiration();
    }

    /**
     * Set the expiration property: The date and time after which the users in this key set will be removed from the
     * baseboard management controllers.
     *
     * @param expiration the expiration value to set.
     * @return the BmcKeySetInner object itself.
     */
    public BmcKeySetInner withExpiration(OffsetDateTime expiration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BmcKeySetProperties();
        }
        this.innerProperties().withExpiration(expiration);
        return this;
    }

    /**
     * Get the lastValidation property: The last time this key set was validated.
     *
     * @return the lastValidation value.
     */
    public OffsetDateTime lastValidation() {
        return this.innerProperties() == null ? null : this.innerProperties().lastValidation();
    }

    /**
     * Get the privilegeLevel property: The access level allowed for the users in this key set.
     *
     * @return the privilegeLevel value.
     */
    public BmcKeySetPrivilegeLevel privilegeLevel() {
        return this.innerProperties() == null ? null : this.innerProperties().privilegeLevel();
    }

    /**
     * Set the privilegeLevel property: The access level allowed for the users in this key set.
     *
     * @param privilegeLevel the privilegeLevel value to set.
     * @return the BmcKeySetInner object itself.
     */
    public BmcKeySetInner withPrivilegeLevel(BmcKeySetPrivilegeLevel privilegeLevel) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BmcKeySetProperties();
        }
        this.innerProperties().withPrivilegeLevel(privilegeLevel);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the baseboard management controller key set.
     *
     * @return the provisioningState value.
     */
    public BmcKeySetProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the userList property: The unique list of permitted users.
     *
     * @return the userList value.
     */
    public List<KeySetUser> userList() {
        return this.innerProperties() == null ? null : this.innerProperties().userList();
    }

    /**
     * Set the userList property: The unique list of permitted users.
     *
     * @param userList the userList value to set.
     * @return the BmcKeySetInner object itself.
     */
    public BmcKeySetInner withUserList(List<KeySetUser> userList) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BmcKeySetProperties();
        }
        this.innerProperties().withUserList(userList);
        return this;
    }

    /**
     * Get the userListStatus property: The status evaluation of each user.
     *
     * @return the userListStatus value.
     */
    public List<KeySetUserStatus> userListStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().userListStatus();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (extendedLocation() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property extendedLocation in model BmcKeySetInner"));
        } else {
            extendedLocation().validate();
        }
        if (innerProperties() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property innerProperties in model BmcKeySetInner"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(BmcKeySetInner.class);
}
