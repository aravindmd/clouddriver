/*
 * Copyright 2015 Pivotal Inc.
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

package com.netflix.spinnaker.clouddriver.cf.config

import com.netflix.spinnaker.clouddriver.cf.security.CloudFoundryAccountCredentials
import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties('cf')
class CloudFoundryConfigurationProperties {

  public static final int POLLING_INTERVAL_SECONDS_DEFAULT = 300

  public static final int ASYNC_OPERATION_TIMEOUT_SECONDS_DEFAULT = POLLING_INTERVAL_SECONDS_DEFAULT * 1.5
  public static final int ASYNC_OPERATION_MAX_POLLING_INTERVAL_SECONDS = 8

  int pollingIntervalSeconds = POLLING_INTERVAL_SECONDS_DEFAULT

  int asyncOperationTimeoutSecondsDefault = ASYNC_OPERATION_TIMEOUT_SECONDS_DEFAULT
  int asyncOperationMaxPollingIntervalSeconds = ASYNC_OPERATION_MAX_POLLING_INTERVAL_SECONDS

  List<CloudFoundryAccountCredentials> accounts = []

}