// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated;

/** Samples for AfdOrigins ListByOriginGroup. */
public final class AfdOriginsListByOriginGroupSamples {
    /*
     * x-ms-original-file: specification/cdn/resource-manager/Microsoft.Cdn/stable/2023-05-01/examples/AFDOrigins_ListByOriginGroup.json
     */
    /**
     * Sample code: AFDOrigins_ListByOriginGroup.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void aFDOriginsListByOriginGroup(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .cdnProfiles()
            .manager()
            .serviceClient()
            .getAfdOrigins()
            .listByOriginGroup("RG", "profile1", "origingroup1", com.azure.core.util.Context.NONE);
    }
}
