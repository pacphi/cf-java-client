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

package org.cloudfoundry.uaa.authorizations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

final class AuthorizeByOpenIdWithImplicitGrantRequestTest {

    @Test
    void noClientId() {
        assertThrows(IllegalStateException.class, () -> {
            AuthorizeByOpenIdWithImplicitGrantRequest.builder()
                .redirectUri("http://redirect.to/app")
                .scope("test-scope")
                .build();
        });
    }

    @Test
    void validMax() {
        AuthorizeByOpenIdWithImplicitGrantRequest.builder()
            .clientId("test-client-id")
            .redirectUri("http://redirect.to/app")
            .scope("test-scope")
            .build();
    }

    @Test
    void validMin() {
        AuthorizeByOpenIdWithImplicitGrantRequest.builder()
            .clientId("test-client-id")
            .build();
    }

}
