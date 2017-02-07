/*
 * Copyright 2016 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.kie.workbench.common.stunner.shapes.def;

import org.kie.workbench.common.stunner.core.definition.shape.AbstractShapeDef;
import org.kie.workbench.common.stunner.core.definition.shape.MutableShapeDef;

public abstract class AbstractMutableShapeDef<W>
        extends AbstractShapeDef<W>
        implements MutableShapeDef<W> {

    protected final MutableShapeDef<W> parent;

    public AbstractMutableShapeDef(final MutableShapeDef<W> parent) {
        this.parent = parent;
    }

    @Override
    public String getFontFamily(final W element) {
        return parent.getFontFamily(element);
    }

    @Override
    public String getFontColor(final W element) {
        return parent.getFontColor(element);
    }

    @Override
    public double getFontSize(final W element) {
        return parent.getFontSize(element);
    }

    @Override
    public double getFontBorderSize(final W element) {
        return parent.getFontBorderSize(element);
    }

    @Override
    public String getBackgroundColor(final W element) {
        return parent.getBackgroundColor(element);
    }

    @Override
    public double getBackgroundAlpha(final W element) {
        return parent.getBackgroundAlpha(element);
    }

    @Override
    public String getBorderColor(final W element) {
        return parent.getBorderColor(element);
    }

    @Override
    public double getBorderSize(final W element) {
        return parent.getBorderSize(element);
    }

    @Override
    public double getBorderAlpha(final W element) {
        return parent.getBorderAlpha(element);
    }
}