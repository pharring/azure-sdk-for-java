// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.communication.callautomation.models.events;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;

import java.io.IOException;

/**
 * The MediaStreamingStarted model.
 */
@Fluent
public final class MediaStreamingStarted extends CallAutomationEventBase {
    /*
     * Contains the resulting SIP code/sub-code and message from NGC services.
     */
    private ResultInformation resultInformation;

    /*
     * Defines the result for MediaStreamingUpdate with the current status and the details about the status
     */
    private MediaStreamingUpdate mediaStreamingUpdateResult;

    /**
     * Creates an instance of MediaStreamingStarted class.
     */
    public MediaStreamingStarted() {
        resultInformation = null;
        mediaStreamingUpdateResult = null;
    }

    /**
     * Get the resultInformation property: Contains the resulting SIP code/sub-code and message from NGC services.
     *
     * @return the resultInformation value.
     */
    public ResultInformation getResultInformation() {
        return this.resultInformation;
    }

    /**
    * Get the mediaStreamingUpdateResult property: Defines the result for audio streaming update with the current status
    * and the details about the status.
    *
    * @return the mediaStreamingUpdateResult value.
    */
    public MediaStreamingUpdate getMediaStreamingUpdateResult() {
        return this.mediaStreamingUpdateResult;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("resultInformation", resultInformation);
        jsonWriter.writeJsonField("mediaStreamingUpdate", mediaStreamingUpdateResult);
        super.writeFields(jsonWriter);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MediaStreamingStarted from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of MediaStreamingStarted if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MediaStreamingStarted.
     */
    public static MediaStreamingStarted fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            final MediaStreamingStarted event = new MediaStreamingStarted();
            while (jsonReader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("resultInformation".equals(fieldName)) {
                    event.resultInformation = ResultInformation.fromJson(reader);
                } else if ("mediaStreamingUpdate".equals(fieldName)) {
                    event.mediaStreamingUpdateResult = MediaStreamingUpdate.fromJson(reader);
                } else {
                    if (!event.readField(fieldName, reader)) {
                        reader.skipChildren();
                    }
                }
            }
            return event;
        });
    }
}
