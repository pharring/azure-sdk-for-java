// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * A description of the scaling capacities of the SKU.
 */
@Fluent
public final class AvailableServiceSkuCapacity implements JsonSerializable<AvailableServiceSkuCapacity> {
    /*
     * The minimum capacity, usually 0 or 1.
     */
    private Integer minimum;

    /*
     * The maximum capacity
     */
    private Integer maximum;

    /*
     * The default capacity
     */
    private Integer defaultProperty;

    /*
     * The scalability approach
     */
    private ServiceScalability scaleType;

    /**
     * Creates an instance of AvailableServiceSkuCapacity class.
     */
    public AvailableServiceSkuCapacity() {
    }

    /**
     * Get the minimum property: The minimum capacity, usually 0 or 1.
     * 
     * @return the minimum value.
     */
    public Integer minimum() {
        return this.minimum;
    }

    /**
     * Set the minimum property: The minimum capacity, usually 0 or 1.
     * 
     * @param minimum the minimum value to set.
     * @return the AvailableServiceSkuCapacity object itself.
     */
    public AvailableServiceSkuCapacity withMinimum(Integer minimum) {
        this.minimum = minimum;
        return this;
    }

    /**
     * Get the maximum property: The maximum capacity.
     * 
     * @return the maximum value.
     */
    public Integer maximum() {
        return this.maximum;
    }

    /**
     * Set the maximum property: The maximum capacity.
     * 
     * @param maximum the maximum value to set.
     * @return the AvailableServiceSkuCapacity object itself.
     */
    public AvailableServiceSkuCapacity withMaximum(Integer maximum) {
        this.maximum = maximum;
        return this;
    }

    /**
     * Get the defaultProperty property: The default capacity.
     * 
     * @return the defaultProperty value.
     */
    public Integer defaultProperty() {
        return this.defaultProperty;
    }

    /**
     * Set the defaultProperty property: The default capacity.
     * 
     * @param defaultProperty the defaultProperty value to set.
     * @return the AvailableServiceSkuCapacity object itself.
     */
    public AvailableServiceSkuCapacity withDefaultProperty(Integer defaultProperty) {
        this.defaultProperty = defaultProperty;
        return this;
    }

    /**
     * Get the scaleType property: The scalability approach.
     * 
     * @return the scaleType value.
     */
    public ServiceScalability scaleType() {
        return this.scaleType;
    }

    /**
     * Set the scaleType property: The scalability approach.
     * 
     * @param scaleType the scaleType value to set.
     * @return the AvailableServiceSkuCapacity object itself.
     */
    public AvailableServiceSkuCapacity withScaleType(ServiceScalability scaleType) {
        this.scaleType = scaleType;
        return this;
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
        jsonWriter.writeNumberField("minimum", this.minimum);
        jsonWriter.writeNumberField("maximum", this.maximum);
        jsonWriter.writeNumberField("default", this.defaultProperty);
        jsonWriter.writeStringField("scaleType", this.scaleType == null ? null : this.scaleType.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AvailableServiceSkuCapacity from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AvailableServiceSkuCapacity if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AvailableServiceSkuCapacity.
     */
    public static AvailableServiceSkuCapacity fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AvailableServiceSkuCapacity deserializedAvailableServiceSkuCapacity = new AvailableServiceSkuCapacity();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("minimum".equals(fieldName)) {
                    deserializedAvailableServiceSkuCapacity.minimum = reader.getNullable(JsonReader::getInt);
                } else if ("maximum".equals(fieldName)) {
                    deserializedAvailableServiceSkuCapacity.maximum = reader.getNullable(JsonReader::getInt);
                } else if ("default".equals(fieldName)) {
                    deserializedAvailableServiceSkuCapacity.defaultProperty = reader.getNullable(JsonReader::getInt);
                } else if ("scaleType".equals(fieldName)) {
                    deserializedAvailableServiceSkuCapacity.scaleType
                        = ServiceScalability.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAvailableServiceSkuCapacity;
        });
    }
}
