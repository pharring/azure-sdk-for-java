// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakestore.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The trusted identity provider properties.
 */
@Immutable
public final class TrustedIdProviderProperties implements JsonSerializable<TrustedIdProviderProperties> {
    /*
     * The URL of this trusted identity provider.
     */
    private String idProvider;

    /**
     * Creates an instance of TrustedIdProviderProperties class.
     */
    public TrustedIdProviderProperties() {
    }

    /**
     * Get the idProvider property: The URL of this trusted identity provider.
     * 
     * @return the idProvider value.
     */
    public String idProvider() {
        return this.idProvider;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
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
     * Reads an instance of TrustedIdProviderProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of TrustedIdProviderProperties if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the TrustedIdProviderProperties.
     */
    public static TrustedIdProviderProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            TrustedIdProviderProperties deserializedTrustedIdProviderProperties = new TrustedIdProviderProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("idProvider".equals(fieldName)) {
                    deserializedTrustedIdProviderProperties.idProvider = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedTrustedIdProviderProperties;
        });
    }
}
