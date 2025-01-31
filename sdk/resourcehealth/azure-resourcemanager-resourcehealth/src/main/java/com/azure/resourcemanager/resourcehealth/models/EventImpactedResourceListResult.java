// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcehealth.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.resourcehealth.fluent.models.EventImpactedResourceInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The List of eventImpactedResources operation response. */
@Fluent
public final class EventImpactedResourceListResult {
    /*
     * The list of eventImpactedResources.
     */
    @JsonProperty(value = "value", required = true)
    private List<EventImpactedResourceInner> value;

    /*
     * The URI to fetch the next page of events. Call ListNext() with this URI to fetch the next page of impacted
     * resource.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /** Creates an instance of EventImpactedResourceListResult class. */
    public EventImpactedResourceListResult() {
    }

    /**
     * Get the value property: The list of eventImpactedResources.
     *
     * @return the value value.
     */
    public List<EventImpactedResourceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of eventImpactedResources.
     *
     * @param value the value value to set.
     * @return the EventImpactedResourceListResult object itself.
     */
    public EventImpactedResourceListResult withValue(List<EventImpactedResourceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URI to fetch the next page of events. Call ListNext() with this URI to fetch the
     * next page of impacted resource.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URI to fetch the next page of events. Call ListNext() with this URI to fetch the
     * next page of impacted resource.
     *
     * @param nextLink the nextLink value to set.
     * @return the EventImpactedResourceListResult object itself.
     */
    public EventImpactedResourceListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property value in model EventImpactedResourceListResult"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(EventImpactedResourceListResult.class);
}
