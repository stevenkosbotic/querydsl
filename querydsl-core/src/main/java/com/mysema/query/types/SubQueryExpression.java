/*
 * Copyright 2011, Mysema Ltd
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.mysema.query.types;

import com.mysema.query.Detachable;
import com.mysema.query.QueryMetadata;

/**
 *
 * SubQueryExpression represents a sub query. The actual construction of a subquery
 * is done via an {@link Detachable} instance.
 *
 * @author tiwe
 *
 * @param <T> return type of subquery
 */
public interface SubQueryExpression<T> extends Expression<T> {

    /**
     * Get the query metadata for the subquery
     *
     * @return
     */
    QueryMetadata getMetadata();

}
