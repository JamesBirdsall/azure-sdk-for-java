/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databox.v2019_09_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Notification preference for a job stage.
 */
public class NotificationPreference {
    /**
     * Name of the stage. Possible values include: 'DevicePrepared',
     * 'Dispatched', 'Delivered', 'PickedUp', 'AtAzureDC', 'DataCopy'.
     */
    @JsonProperty(value = "stageName", required = true)
    private NotificationStageName stageName;

    /**
     * Notification is required or not.
     */
    @JsonProperty(value = "sendNotification", required = true)
    private boolean sendNotification;

    /**
     * Get name of the stage. Possible values include: 'DevicePrepared', 'Dispatched', 'Delivered', 'PickedUp', 'AtAzureDC', 'DataCopy'.
     *
     * @return the stageName value
     */
    public NotificationStageName stageName() {
        return this.stageName;
    }

    /**
     * Set name of the stage. Possible values include: 'DevicePrepared', 'Dispatched', 'Delivered', 'PickedUp', 'AtAzureDC', 'DataCopy'.
     *
     * @param stageName the stageName value to set
     * @return the NotificationPreference object itself.
     */
    public NotificationPreference withStageName(NotificationStageName stageName) {
        this.stageName = stageName;
        return this;
    }

    /**
     * Get notification is required or not.
     *
     * @return the sendNotification value
     */
    public boolean sendNotification() {
        return this.sendNotification;
    }

    /**
     * Set notification is required or not.
     *
     * @param sendNotification the sendNotification value to set
     * @return the NotificationPreference object itself.
     */
    public NotificationPreference withSendNotification(boolean sendNotification) {
        this.sendNotification = sendNotification;
        return this;
    }

}
