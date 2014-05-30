/*
 * Copyright 2014 Netflix, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.netflix.spinnaker.kato.deploy
/**
 * A registry of {@link com.netflix.spinnaker.kato.deploy.DeployHandler} instances.
 *
 * @author Dan Woods
 */
public interface DeployHandlerRegistry {
  /**
   * This method is used to locate a handler most appropriate for the provided description object.
   *
   * @param description
   * @return a deploy handler instance
   * @throws DeployHandlerNotFoundException
   */
  DeployHandler findHandler(DeployDescription description) throws DeployHandlerNotFoundException
}
