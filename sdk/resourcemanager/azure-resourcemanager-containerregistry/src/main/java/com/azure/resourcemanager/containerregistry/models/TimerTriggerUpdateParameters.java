// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The properties for updating a timer trigger. */
@Fluent
public final class TimerTriggerUpdateParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(TimerTriggerUpdateParameters.class);

    /*
     * The CRON expression for the task schedule
     */
    @JsonProperty(value = "schedule")
    private String schedule;

    /*
     * The current status of trigger.
     */
    @JsonProperty(value = "status")
    private TriggerStatus status;

    /*
     * The name of the trigger.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * Get the schedule property: The CRON expression for the task schedule.
     *
     * @return the schedule value.
     */
    public String schedule() {
        return this.schedule;
    }

    /**
     * Set the schedule property: The CRON expression for the task schedule.
     *
     * @param schedule the schedule value to set.
     * @return the TimerTriggerUpdateParameters object itself.
     */
    public TimerTriggerUpdateParameters withSchedule(String schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     * Get the status property: The current status of trigger.
     *
     * @return the status value.
     */
    public TriggerStatus status() {
        return this.status;
    }

    /**
     * Set the status property: The current status of trigger.
     *
     * @param status the status value to set.
     * @return the TimerTriggerUpdateParameters object itself.
     */
    public TimerTriggerUpdateParameters withStatus(TriggerStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the name property: The name of the trigger.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the trigger.
     *
     * @param name the name value to set.
     * @return the TimerTriggerUpdateParameters object itself.
     */
    public TimerTriggerUpdateParameters withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property name in model TimerTriggerUpdateParameters"));
        }
    }
}
