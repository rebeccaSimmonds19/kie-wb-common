/*
 * Copyright 2016 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.kie.workbench.common.stunner.core.definition.adapter.bootstrap;

import org.kie.workbench.common.stunner.core.registry.definition.AdapterRegistry;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class BootstrapAdapterFactory {

    public BootstrapDefinitionSetAdapter newDefinitionSetAdapter( final AdapterRegistry registry ) {
        return new BootstrapDefinitionSetAdapter( registry );
    }

    public BootstrapDefinitionSetRuleAdapter newDefinitionSetRuleAdapter( final AdapterRegistry registry ) {
        return new BootstrapDefinitionSetRuleAdapter( registry );
    }

    public BootstrapDefinitionAdapter newDefinitionAdapter( final AdapterRegistry registry ) {
        return new BootstrapDefinitionAdapter( registry );
    }

    public BootstrapPropertySetAdapter newPropertySetAdapter( final AdapterRegistry registry ) {
        return new BootstrapPropertySetAdapter( registry );
    }

    public BootstrapPropertyAdapter newPropertyAdapter( final AdapterRegistry registry ) {
        return new BootstrapPropertyAdapter( registry );
    }

}