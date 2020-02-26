/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_11_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for PcProtocol.
 */
public final class PcProtocol extends ExpandableStringEnum<PcProtocol> {
    /** Static value TCP for PcProtocol. */
    public static final PcProtocol TCP = fromString("TCP");

    /** Static value UDP for PcProtocol. */
    public static final PcProtocol UDP = fromString("UDP");

    /** Static value Any for PcProtocol. */
    public static final PcProtocol ANY = fromString("Any");

    /**
     * Creates or finds a PcProtocol from its string representation.
     * @param name a name to look for
     * @return the corresponding PcProtocol
     */
    @JsonCreator
    public static PcProtocol fromString(String name) {
        return fromString(name, PcProtocol.class);
    }

    /**
     * @return known PcProtocol values
     */
    public static Collection<PcProtocol> values() {
        return values(PcProtocol.class);
    }
}
