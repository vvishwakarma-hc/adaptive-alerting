/*
 * Copyright 2018-2019 Expedia Group, Inc.
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
package com.expedia.adaptivealerting.anomdetect.detect;

import com.expedia.metrics.MetricData;

import java.util.UUID;

/**
 * Anomaly detector interface. Anomalies can be outliers (point-in-time) or breakouts (distributional shifts in the
 * recent past).
 */
public interface Detector {

    /**
     * Returns the anomaly detector UUID.
     *
     * @return Anomaly detector UUID.
     */
    UUID getUuid();

    /**
     * Processes a given metric point.
     *
     * @param metricData Metric data point.
     * @return Anomaly result.
     */
    DetectorResult detect(MetricData metricData);
}
