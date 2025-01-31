// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.synapse.SynapseManager;
import com.azure.resourcemanager.synapse.models.SelfHostedIntegrationRuntimeNode;
import com.azure.resourcemanager.synapse.models.UpdateIntegrationRuntimeNodeRequest;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class IntegrationRuntimeNodesUpdateWithResponseMockTests {
    @Test
    public void testUpdateWithResponse() throws Exception {
        String responseStr
            = "{\"nodeName\":\"znw\",\"machineName\":\"qufmjxcyoseq\",\"hostServiceUri\":\"zisvbrqgcyjpgaw\",\"status\":\"Online\",\"capabilities\":{\"lxb\":\"nrzpghlrdtbg\"},\"versionStatus\":\"brvjztaflv\",\"version\":\"fjihvfjcqrttjfuq\",\"registerTime\":\"2021-03-30T00:40:58Z\",\"lastConnectTime\":\"2021-03-17T20:01:27Z\",\"expiryTime\":\"2021-11-03T08:38Z\",\"lastStartTime\":\"2021-12-06T19:10:56Z\",\"lastStopTime\":\"2021-07-24T16:42:51Z\",\"lastUpdateResult\":\"None\",\"lastStartUpdateTime\":\"2021-03-12T06:12:08Z\",\"lastEndUpdateTime\":\"2021-09-04T12:28:31Z\",\"isActiveDispatcher\":false,\"concurrentJobsLimit\":304491865,\"maxConcurrentJobs\":549678037,\"\":{\"kwdtlcj\":\"datavxgwz\",\"cqzvzrbvgwxhlxr\":\"datap\"}}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        SynapseManager manager = SynapseManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        SelfHostedIntegrationRuntimeNode response = manager.integrationRuntimeNodes()
            .updateWithResponse("jrxgunnq", "ypu", "tnylqu", "vqmvyumgmmu",
                new UpdateIntegrationRuntimeNodeRequest().withConcurrentJobsLimit(1590139202),
                com.azure.core.util.Context.NONE)
            .getValue();

    }
}
