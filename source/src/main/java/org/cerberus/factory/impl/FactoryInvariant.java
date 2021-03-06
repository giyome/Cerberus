/*
 * Cerberus  Copyright (C) 2013  vertigo17
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This file is part of Cerberus.
 *
 * Cerberus is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Cerberus is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Cerberus.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.cerberus.factory.impl;

import org.cerberus.entity.Invariant;
import org.cerberus.factory.IFactoryInvariant;
import org.springframework.stereotype.Service;

/**
 * @author bcivel
 */
@Service
public class FactoryInvariant implements IFactoryInvariant {

    @Override
    public Invariant create(String idName, String value, int sort, int id, String description, String gp1, String gp2, String gp3) {
        Invariant invariant = new Invariant();
        invariant.setIdName(idName);
        invariant.setSort(sort);
        invariant.setValue(value);
        invariant.setId(id);
        invariant.setDescription(description);
        invariant.setGp1(gp1);
        invariant.setGp2(gp2);
        invariant.setGp3(gp3);
        return invariant;
    }

}
