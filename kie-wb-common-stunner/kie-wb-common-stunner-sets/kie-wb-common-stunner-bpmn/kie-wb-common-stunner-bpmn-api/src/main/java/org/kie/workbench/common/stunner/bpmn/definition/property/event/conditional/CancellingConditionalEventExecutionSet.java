/*
 * Copyright 2018 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.kie.workbench.common.stunner.bpmn.definition.property.event.conditional;

import java.util.Objects;

import javax.validation.Valid;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;
import org.jboss.errai.databinding.client.api.Bindable;
import org.kie.workbench.common.forms.adf.definitions.annotations.FieldParam;
import org.kie.workbench.common.forms.adf.definitions.annotations.FormDefinition;
import org.kie.workbench.common.forms.adf.definitions.annotations.FormField;
import org.kie.workbench.common.stunner.bpmn.definition.property.common.ConditionExpression;
import org.kie.workbench.common.stunner.bpmn.definition.property.event.CancelActivity;
import org.kie.workbench.common.stunner.bpmn.definition.property.task.ScriptTypeValue;
import org.kie.workbench.common.stunner.core.definition.annotation.Property;
import org.kie.workbench.common.stunner.core.definition.annotation.PropertySet;
import org.kie.workbench.common.stunner.core.util.HashUtil;

@Portable
@Bindable
@PropertySet
@FormDefinition(startElement = "cancelActivity")
public class CancellingConditionalEventExecutionSet {

    @Property
    @FormField
    @Valid
    private CancelActivity cancelActivity;

    @Property
    @FormField(afterElement = "cancelActivity",
            settings = {@FieldParam(name = "mode", value = "DROOLS_CONDITION")})
    @Valid
    private ConditionExpression conditionExpression;

    public CancellingConditionalEventExecutionSet() {
        this(new CancelActivity(true),
             new ConditionExpression(new ScriptTypeValue("drools",
                                                         "")));
    }

    public CancellingConditionalEventExecutionSet(final @MapsTo("cancelActivity") CancelActivity cancelActivity,
                                                  final @MapsTo("conditionExpression") ConditionExpression conditionExpression) {
        this.cancelActivity = cancelActivity;
        this.conditionExpression = conditionExpression;
    }

    public CancelActivity getCancelActivity() {
        return cancelActivity;
    }

    public void setCancelActivity(CancelActivity cancelActivity) {
        this.cancelActivity = cancelActivity;
    }

    public ConditionExpression getConditionExpression() {
        return conditionExpression;
    }

    public void setConditionExpression(ConditionExpression conditionExpression) {
        this.conditionExpression = conditionExpression;
    }

    @Override
    public int hashCode() {
        return HashUtil.combineHashCodes(Objects.hashCode(cancelActivity),
                                         Objects.hashCode(conditionExpression));
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof CancellingConditionalEventExecutionSet) {
            CancellingConditionalEventExecutionSet other = (CancellingConditionalEventExecutionSet) o;
            return Objects.equals(cancelActivity,
                                  other.cancelActivity) &&
                    Objects.equals(conditionExpression,
                                   other.conditionExpression);
        }
        return false;
    }
}
