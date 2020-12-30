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
 * Converter for {@link com.tmgateway.message.model.IncomingMessage}.
 *
 * NOTE: This class has been automatically generated from the {@link com.tmgateway.message.model.IncomingMessage} original class using Vert.x codegen.
 */
 class IncomingMessageConverter {

   static void fromJson(JsonObject json, IncomingMessage obj) {
    if (json.getValue("deviceId") instanceof String) {
      obj.setDeviceId((String)json.getValue("deviceId"));
    }
    if (json.getValue("message") instanceof String) {
      obj.setMessage((String)json.getValue("message"));
    }
    if (json.getValue("source") instanceof String) {
      obj.setSource((String)json.getValue("source"));
    }
    if (json.getValue("timestamp") instanceof String) {
      obj.setTimestamp((String)json.getValue("timestamp"));
    }
    if (json.getValue("type") instanceof String) {
      obj.setType((String)json.getValue("type"));
    }
  }

   static void toJson(IncomingMessage obj, JsonObject json) {
    if (obj.getDeviceId() != null) {
      json.put("deviceId", obj.getDeviceId());
    }
    if (obj.getMessage() != null) {
      json.put("message", obj.getMessage());
    }
    if (obj.getSource() != null) {
      json.put("source", obj.getSource());
    }
    if (obj.getTimestamp() != null) {
      json.put("timestamp", obj.getTimestamp());
    }
    if (obj.getType() != null) {
      json.put("type", obj.getType());
    }
  }
}