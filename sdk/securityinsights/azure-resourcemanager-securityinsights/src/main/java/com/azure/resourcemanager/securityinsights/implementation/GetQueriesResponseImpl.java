// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.implementation;

import com.azure.resourcemanager.securityinsights.fluent.models.GetQueriesResponseInner;
import com.azure.resourcemanager.securityinsights.models.EntityQueryItem;
import com.azure.resourcemanager.securityinsights.models.GetQueriesResponse;
import java.util.Collections;
import java.util.List;

public final class GetQueriesResponseImpl implements GetQueriesResponse {
    private GetQueriesResponseInner innerObject;

    private final com.azure.resourcemanager.securityinsights.SecurityInsightsManager serviceManager;

    GetQueriesResponseImpl(GetQueriesResponseInner innerObject,
        com.azure.resourcemanager.securityinsights.SecurityInsightsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<EntityQueryItem> value() {
        List<EntityQueryItem> inner = this.innerModel().value();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public GetQueriesResponseInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.securityinsights.SecurityInsightsManager manager() {
        return this.serviceManager;
    }
}
