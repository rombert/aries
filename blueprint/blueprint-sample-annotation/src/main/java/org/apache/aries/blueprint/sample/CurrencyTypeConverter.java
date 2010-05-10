/**
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.apache.aries.blueprint.sample;

import java.util.Currency;

import org.apache.aries.blueprint.annotation.Bean;
import org.osgi.service.blueprint.container.Converter;
import org.osgi.service.blueprint.container.ReifiedType;

@Bean(id="converter2")
public class CurrencyTypeConverter implements Converter {

    public boolean canConvert(Object fromValue, ReifiedType toType) {
        return Currency.class.isAssignableFrom(toType.getRawClass());
    }

    public Object convert(Object source, ReifiedType toType) throws Exception {
        return Currency.getInstance(source.toString());
    }

}
