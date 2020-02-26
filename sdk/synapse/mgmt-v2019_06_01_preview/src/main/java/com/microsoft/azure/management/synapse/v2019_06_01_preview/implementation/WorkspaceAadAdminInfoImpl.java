/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2019_06_01_preview.implementation;

import com.microsoft.azure.management.synapse.v2019_06_01_preview.WorkspaceAadAdminInfo;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class WorkspaceAadAdminInfoImpl extends WrapperImpl<WorkspaceAadAdminInfoInner> implements WorkspaceAadAdminInfo {
    private final SynapseManager manager;
    WorkspaceAadAdminInfoImpl(WorkspaceAadAdminInfoInner inner, SynapseManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public SynapseManager manager() {
        return this.manager;
    }

    @Override
    public String administratorType() {
        return this.inner().administratorType();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String login() {
        return this.inner().login();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String sid() {
        return this.inner().sid();
    }

    @Override
    public String tenantId() {
        return this.inner().tenantId();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
