// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.synapse.fluent.models.DataConnectionInner;
import org.junit.jupiter.api.Assertions;

public final class DataConnectionInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DataConnectionInner model = BinaryData.fromString(
            "{\"kind\":\"DataConnection\",\"location\":\"uazjcgmxitpfinz\",\"id\":\"dltkrlg\",\"name\":\"mtbdrvcqgu\",\"type\":\"fzhompheq\"}")
            .toObject(DataConnectionInner.class);
        Assertions.assertEquals("uazjcgmxitpfinz", model.location());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DataConnectionInner model = new DataConnectionInner().withLocation("uazjcgmxitpfinz");
        model = BinaryData.fromObject(model).toObject(DataConnectionInner.class);
        Assertions.assertEquals("uazjcgmxitpfinz", model.location());
    }
}
