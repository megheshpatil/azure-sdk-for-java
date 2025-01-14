// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.chaos.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.chaos.fluent.models.ExperimentExecutionInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Model that represents a list of Experiment executions and a link for pagination. */
@Immutable
public final class ExperimentExecutionListResult {
    /*
     * List of Experiment executions.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<ExperimentExecutionInner> value;

    /*
     * URL to retrieve the next page of Experiment executions.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /** Creates an instance of ExperimentExecutionListResult class. */
    public ExperimentExecutionListResult() {
    }

    /**
     * Get the value property: List of Experiment executions.
     *
     * @return the value value.
     */
    public List<ExperimentExecutionInner> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: URL to retrieve the next page of Experiment executions.
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
}
