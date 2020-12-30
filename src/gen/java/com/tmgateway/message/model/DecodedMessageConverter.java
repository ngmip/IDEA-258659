/*
 * Copyright (c) 2014 Red Hat, Inc. and others
 *
 * Red Hat licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.tmgateway.message.model;

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;

/**
 * Converter for {@link com.tmgateway.message.model.DecodedMessage}.
 *
 * NOTE: This class has been automatically generated from the {@link com.tmgateway.message.model.DecodedMessage} original class using Vert.x codegen.
 */
 class DecodedMessageConverter {

   static void fromJson(JsonObject json, DecodedMessage obj) {
    if (json.getValue("message") instanceof String) {
      obj.setMessage((String)json.getValue("message"));
    }
    if (json.getValue("sequence") instanceof Number) {
      obj.setSequence(((Number)json.getValue("sequence")).intValue());
    }
    if (json.getValue("timestamp") instanceof String) {
      obj.setTimestamp((String)json.getValue("timestamp"));
    }
  }

   static void toJson(DecodedMessage obj, JsonObject json) {
    if (obj.getMessage() != null) {
      json.put("message", obj.getMessage());
    }
    json.put("sequence", obj.getSequence());
    if (obj.getTimestamp() != null) {
      json.put("timestamp", obj.getTimestamp());
    }
  }
}