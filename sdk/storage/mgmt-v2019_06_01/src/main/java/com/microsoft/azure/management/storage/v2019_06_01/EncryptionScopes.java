/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2019_06_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Observable;
import com.microsoft.azure.management.storage.v2019_06_01.implementation.EncryptionScopesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing EncryptionScopes.
 */
public interface EncryptionScopes extends SupportsCreating<EncryptionScope.DefinitionStages.Blank>, HasInner<EncryptionScopesInner> {
    /**
     * Returns the properties for the specified encryption scope.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param encryptionScopeName The name of the encryption scope within the specified storage account. Encryption scope names must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every dash (-) character must be immediately preceded and followed by a letter or number.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<EncryptionScope> getAsync(String resourceGroupName, String accountName, String encryptionScopeName);

    /**
     * Lists all the encryption scopes available under the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<EncryptionScope> listAsync(final String resourceGroupName, final String accountName);

}
