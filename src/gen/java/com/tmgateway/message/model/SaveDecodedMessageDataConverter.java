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
 * Converter for {@link com.tmgateway.message.model.SaveDecodedMessageData}.
 *
 * NOTE: This class has been automatically generated from the {@link com.tmgateway.message.model.SaveDecodedMessageData} original class using Vert.x codegen.
 */
 class SaveDecodedMessageDataConverter {

   static void fromJson(JsonObject json, SaveDecodedMessageData obj) {
    if (json.getValue("decoded") instanceof String) {
      obj.setDecoded((String)json.getValue("decoded"));
    }
    if (json.getValue("deviceId") instanceof String) {
      obj.setDeviceId((String)json.getValue("deviceId"));
    }
    if (json.getValue("profiles") instanceof JsonArray) {
      java.util.LinkedHashSet<java.lang.String> list = new java.util.LinkedHashSet<>();
      json.getJsonArray("profiles").forEach( item -> {
        if (item instanceof String)
          list.add((String)item);
      });
      obj.setProfiles(list);
    }
    if (json.getValue("sequence") instanceof Number) {
      obj.setSequence(((Number)json.getValue("sequence")).intValue());
    }
    if (json.getValue("timeuuid") instanceof String) {
      obj.setTimeuuid((String)json.getValue("timeuuid"));
    }
    if (json.getValue("type") instanceof String) {
      obj.setType((String)json.getValue("type"));
    }
  }

   static void toJson(SaveDecodedMessageData obj, JsonObject json) {
    if (obj.getDecoded() != null) {
      json.put("decoded", obj.getDecoded());
    }
    if (obj.getDeviceId() != null) {
      json.put("deviceId", obj.getDeviceId());
    }
    if (obj.getProfiles() != null) {
      JsonArray array = new JsonArray();
      obj.getProfiles().forEach(item -> array.add(item));
      json.put("profiles", array);
    }
    if (obj.getSequence() != null) {
      json.put("sequence", obj.getSequence());
    }
    if (obj.getTimeuuid() != null) {
      json.put("timeuuid", obj.getTimeuuid());
    }
    if (obj.getType() != null) {
      json.put("type", obj.getType());
    }
  }
}