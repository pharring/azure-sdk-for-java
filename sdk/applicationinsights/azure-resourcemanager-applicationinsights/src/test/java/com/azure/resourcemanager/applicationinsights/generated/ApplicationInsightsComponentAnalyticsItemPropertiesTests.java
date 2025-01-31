// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.applicationinsights.models.ApplicationInsightsComponentAnalyticsItemProperties;
import org.junit.jupiter.api.Assertions;

public final class ApplicationInsightsComponentAnalyticsItemPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ApplicationInsightsComponentAnalyticsItemProperties model
            = BinaryData.fromString("{\"functionAlias\":\"csonpclhoco\"}")
                .toObject(ApplicationInsightsComponentAnalyticsItemProperties.class);
        Assertions.assertEquals("csonpclhoco", model.functionAlias());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ApplicationInsightsComponentAnalyticsItemProperties model
            = new ApplicationInsightsComponentAnalyticsItemProperties().withFunctionAlias("csonpclhoco");
        model = BinaryData.fromObject(model).toObject(ApplicationInsightsComponentAnalyticsItemProperties.class);
        Assertions.assertEquals("csonpclhoco", model.functionAlias());
    }
}
