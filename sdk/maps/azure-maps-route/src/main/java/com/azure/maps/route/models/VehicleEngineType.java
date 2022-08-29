// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.route.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for VehicleEngineType. */
public final class VehicleEngineType extends ExpandableStringEnum<VehicleEngineType> {
    /** Static value combustion for VehicleEngineType. */
    public static final VehicleEngineType COMBUSTION = fromString("combustion");

    /** Static value electric for VehicleEngineType. */
    public static final VehicleEngineType ELECTRIC = fromString("electric");

    /**
     * Creates or finds a VehicleEngineType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding VehicleEngineType.
     */
    @JsonCreator
    public static VehicleEngineType fromString(String name) {
        return fromString(name, VehicleEngineType.class);
    }

    /**
     * Gets known VehicleEngineType values.
     *
     * @return known VehicleEngineType values.
     */
    public static Collection<VehicleEngineType> values() {
        return values(VehicleEngineType.class);
    }
}