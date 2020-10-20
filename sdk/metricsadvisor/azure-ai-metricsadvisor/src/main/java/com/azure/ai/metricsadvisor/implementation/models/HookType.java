// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for HookType. */
public final class HookType extends ExpandableStringEnum<HookType> {
    /** Static value Webhook for HookType. */
    public static final HookType WEBHOOK = fromString("Webhook");

    /** Static value Email for HookType. */
    public static final HookType EMAIL = fromString("Email");

    /**
     * Creates or finds a HookType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding HookType.
     */
    @JsonCreator
    public static HookType fromString(String name) {
        return fromString(name, HookType.class);
    }

    /** @return known HookType values. */
    public static Collection<HookType> values() {
        return values(HookType.class);
    }
}
