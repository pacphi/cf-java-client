/*
 * Copyright 2013-2021 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.cloudfoundry.client.v2.securitygroups;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

final class AssociateSecurityGroupSpaceRequestTest {

    @Test
    void noSecurityGroupId() {
        assertThrows(IllegalStateException.class, () -> {
            AssociateSecurityGroupSpaceRequest.builder()
                .spaceId("test-space-id")
                .build();
        });
    }

    @Test
    void noSpaceId() {
        assertThrows(IllegalStateException.class, () -> {
            AssociateSecurityGroupSpaceRequest.builder()
                .securityGroupId("test-security-group-id")
                .build();
        });
    }

    @Test
    void valid() {
        AssociateSecurityGroupSpaceRequest.builder()
            .securityGroupId("test-security-group-id")
            .spaceId("test-space-id")
            .build();
    }

}
