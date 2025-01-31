// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.costmanagement.fluent.models.BenefitUtilizationSummaryInner;
import java.io.IOException;
import java.util.List;

/**
 * List of benefit utilization summaries.
 */
@Immutable
public final class BenefitUtilizationSummariesListResult
    implements JsonSerializable<BenefitUtilizationSummariesListResult> {
    /*
     * The list of benefit utilization summaries.
     */
    private List<BenefitUtilizationSummaryInner> value;

    /*
     * The link (URL) to the next page of results.
     */
    private String nextLink;

    /**
     * Creates an instance of BenefitUtilizationSummariesListResult class.
     */
    public BenefitUtilizationSummariesListResult() {
    }

    /**
     * Get the value property: The list of benefit utilization summaries.
     * 
     * @return the value value.
     */
    public List<BenefitUtilizationSummaryInner> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: The link (URL) to the next page of results.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of BenefitUtilizationSummariesListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of BenefitUtilizationSummariesListResult if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the BenefitUtilizationSummariesListResult.
     */
    public static BenefitUtilizationSummariesListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            BenefitUtilizationSummariesListResult deserializedBenefitUtilizationSummariesListResult
                = new BenefitUtilizationSummariesListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<BenefitUtilizationSummaryInner> value
                        = reader.readArray(reader1 -> BenefitUtilizationSummaryInner.fromJson(reader1));
                    deserializedBenefitUtilizationSummariesListResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedBenefitUtilizationSummariesListResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedBenefitUtilizationSummariesListResult;
        });
    }
}
