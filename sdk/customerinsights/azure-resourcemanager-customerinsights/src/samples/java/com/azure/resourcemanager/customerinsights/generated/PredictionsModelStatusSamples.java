// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.generated;

import com.azure.resourcemanager.customerinsights.fluent.models.PredictionModelStatusInner;
import com.azure.resourcemanager.customerinsights.models.PredictionModelLifeCycle;

/**
 * Samples for Predictions ModelStatus.
 */
public final class PredictionsModelStatusSamples {
    /*
     * x-ms-original-file:
     * specification/customer-insights/resource-manager/Microsoft.CustomerInsights/stable/2017-04-26/examples/
     * PredictionsModelStatus.json
     */
    /**
     * Sample code: Predictions_ModelStatus.
     * 
     * @param manager Entry point to CustomerInsightsManager.
     */
    public static void
        predictionsModelStatus(com.azure.resourcemanager.customerinsights.CustomerInsightsManager manager) {
        manager.predictions()
            .modelStatusWithResponse("TestHubRG", "sdkTestHub", "sdktest",
                new PredictionModelStatusInner().withStatus(PredictionModelLifeCycle.TRAINING),
                com.azure.core.util.Context.NONE);
    }
}
