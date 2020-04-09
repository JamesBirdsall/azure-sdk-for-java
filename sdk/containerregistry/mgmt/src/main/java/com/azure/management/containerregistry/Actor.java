// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.containerregistry;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Actor model. */
@Fluent
public final class Actor {
    /*
     * The subject or username associated with the request context that
     * generated the event.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Get the name property: The subject or username associated with the request context that generated the event.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The subject or username associated with the request context that generated the event.
     *
     * @param name the name value to set.
     * @return the Actor object itself.
     */
    public Actor withName(String name) {
        this.name = name;
        return this;
    }
}
