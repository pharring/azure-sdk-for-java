// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.chaos.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.chaos.ChaosManager;
import com.azure.resourcemanager.chaos.models.ChaosExperimentBranch;
import com.azure.resourcemanager.chaos.models.ChaosExperimentStep;
import com.azure.resourcemanager.chaos.models.ChaosTargetFilter;
import com.azure.resourcemanager.chaos.models.ChaosTargetSelector;
import com.azure.resourcemanager.chaos.models.Experiment;
import com.azure.resourcemanager.chaos.models.ResourceIdentity;
import com.azure.resourcemanager.chaos.models.ResourceIdentityType;
import com.azure.resourcemanager.chaos.models.UserAssignedIdentity;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class ExperimentsCreateOrUpdateMockTests {
    @Test
    public void testCreateOrUpdate() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"identity\":{\"type\":\"UserAssigned\",\"userAssignedIdentities\":{\"ev\":{\"principalId\":\"6900a581-a089-4451-b294-0dccce9a7181\",\"clientId\":\"c0aab7de-0ad5-4a09-ad58-31e9defd8dd4\"},\"b\":{\"principalId\":\"25a877c7-39ff-46be-8058-0c1f8c6955e9\",\"clientId\":\"2986140d-b1b7-4329-a3f5-cb5f12d81712\"}},\"principalId\":\"rilbywdx\",\"tenantId\":\"icc\"},\"properties\":{\"provisioningState\":\"Succeeded\",\"steps\":[{\"name\":\"scjfnyns\",\"branches\":[{\"name\":\"ujiz\",\"actions\":[]},{\"name\":\"voqyt\",\"actions\":[]}]},{\"name\":\"byowbblgyavutp\",\"branches\":[{\"name\":\"joxoism\",\"actions\":[]},{\"name\":\"ksbpimlqoljx\",\"actions\":[]}]},{\"name\":\"cgxxlxs\",\"branches\":[{\"name\":\"gcvizqzdwlvwlyou\",\"actions\":[]},{\"name\":\"fgfb\",\"actions\":[]}]},{\"name\":\"jub\",\"branches\":[{\"name\":\"hgkfmin\",\"actions\":[]}]}],\"selectors\":[{\"type\":\"ChaosTargetSelector\",\"id\":\"owzfttsttkt\",\"filter\":{\"type\":\"ChaosTargetFilter\"},\"\":{\"gqqqxh\":\"dataqactxtgzukxitmmq\",\"rxcpjuisavo\":\"datan\",\"ajlkatnw\":\"dataqdzfvazivjlfrqtt\"}}]},\"location\":\"yiopi\",\"tags\":{\"ovibrxkp\":\"qfkuvscxkdmli\",\"bteoybf\":\"loazuruocbgoo\"},\"id\":\"jxakv\",\"name\":\"jgslordilmyww\",\"type\":\"kgkxn\"}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito.when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito.when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito.when(httpClient.send(httpRequest.capture(), Mockito.any())).thenReturn(Mono.defer(() -> {
            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
            return Mono.just(httpResponse);
        }));

        ChaosManager manager = ChaosManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        Experiment response
            = manager.experiments()
                .define("yjkqabqgzslesjcb")
                .withRegion("axconfozauo")
                .withExistingResourceGroup("aryeu")
                .withSteps(Arrays.asList(new ChaosExperimentStep().withName("ebjvewzcjzn")
                    .withBranches(Arrays.asList(
                        new ChaosExperimentBranch().withName("cpmguaadraufact").withActions(Arrays.asList()),
                        new ChaosExperimentBranch().withName("ahzovajjziuxxp").withActions(Arrays.asList()),
                        new ChaosExperimentBranch().withName("hneekul").withActions(Arrays.asList()),
                        new ChaosExperimentBranch().withName("gs").withActions(Arrays.asList())))))
                .withSelectors(Arrays.asList(
                    new ChaosTargetSelector().withId("ubkwdle")
                        .withFilter(new ChaosTargetFilter())
                        .withAdditionalProperties(mapOf("type", "ChaosTargetSelector")),
                    new ChaosTargetSelector().withId("ygdxpgpqchis")
                        .withFilter(new ChaosTargetFilter())
                        .withAdditionalProperties(mapOf("type", "ChaosTargetSelector"))))
                .withTags(mapOf("epzl", "kokwbqplhlvnu", "vmnnrw", "phwzsoldweyuqdu", "wjhhgdnhxmsivf", "biorktal",
                    "zaofjchvcyy", "miloxggdufiqndie"))
                .withIdentity(new ResourceIdentity().withType(ResourceIdentityType.USER_ASSIGNED)
                    .withUserAssignedIdentities(
                        mapOf("w", new UserAssignedIdentity(), "vbquwr", new UserAssignedIdentity())))
                .create();

        Assertions.assertEquals("yiopi", response.location());
        Assertions.assertEquals("qfkuvscxkdmli", response.tags().get("ovibrxkp"));
        Assertions.assertEquals(ResourceIdentityType.USER_ASSIGNED, response.identity().type());
        Assertions.assertEquals("scjfnyns", response.steps().get(0).name());
        Assertions.assertEquals("ujiz", response.steps().get(0).branches().get(0).name());
        Assertions.assertEquals("owzfttsttkt", response.selectors().get(0).id());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
