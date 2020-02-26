/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.timeseriesinsights.v2017_11_15;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.timeseriesinsights.v2017_11_15.implementation.TimeSeriesInsightsManager;
import com.microsoft.azure.management.timeseriesinsights.v2017_11_15.implementation.ReferenceDataSetListResponseInner;
import com.microsoft.azure.management.timeseriesinsights.v2017_11_15.implementation.ReferenceDataSetResourceInner;
import java.util.List;

/**
 * Type representing ReferenceDataSetListResponse.
 */
public interface ReferenceDataSetListResponse extends HasInner<ReferenceDataSetListResponseInner>, HasManager<TimeSeriesInsightsManager> {
    /**
     * @return the value value.
     */
    List<ReferenceDataSetResourceInner> value();

}
