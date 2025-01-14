// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.assistants.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The detailed information associated with a message creation run step.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("message_creation")
@Immutable
public final class RunStepMessageCreationDetails extends RunStepDetails {

    /*
     * Information about the message creation associated with this run step.
     */
    @Generated
    @JsonProperty(value = "message_creation")
    private RunStepMessageCreationReference messageCreation;

    /**
     * Creates an instance of RunStepMessageCreationDetails class.
     *
     * @param messageCreation the messageCreation value to set.
     */
    @Generated
    @JsonCreator
    private RunStepMessageCreationDetails(
        @JsonProperty(value = "message_creation") RunStepMessageCreationReference messageCreation) {
        this.messageCreation = messageCreation;
    }

    /**
     * Get the messageCreation property: Information about the message creation associated with this run step.
     *
     * @return the messageCreation value.
     */
    @Generated
    public RunStepMessageCreationReference getMessageCreation() {
        return this.messageCreation;
    }
}
