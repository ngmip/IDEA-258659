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
 * Converter for {@link com.tmgateway.message.model.IncomingMessageResponse}.
 *
 * NOTE: This class has been automatically generated from the {@link com.tmgateway.message.model.IncomingMessageResponse} original class using Vert.x codegen.
 */
 class IncomingMessageResponseConverter {

   static void fromJson(JsonObject json, IncomingMessageResponse obj) {
    if (json.getValue("fetchSize") instanceof Number) {
      obj.setFetchSize(((Number)json.getValue("fetchSize")).intValue());
    }
    if (json.getValue("messages") instanceof JsonArray) {
      java.util.ArrayList<com.tmgateway.message.model.IncomingMessage> list = new java.util.ArrayList<>();
      json.getJsonArray("messages").forEach( item -> {
        if (item instanceof JsonObject)
          list.add(new com.tmgateway.message.model.IncomingMessage((JsonObject)item));
      });
      obj.setMessages(list);
    }
    if (json.getValue("total") instanceof Number) {
      obj.setTotal(((Number)json.getValue("total")).longValue());
    }
  }

   static void toJson(IncomingMessageResponse obj, JsonObject json) {
    json.put("fetchSize", obj.getFetchSize());
    if (obj.getMessages() != null) {
      JsonArray array = new JsonArray();
      obj.getMessages().forEach(item -> array.add(item.toJson()));
      json.put("messages", array);
    }
    json.put("total", obj.getTotal());
  }
}