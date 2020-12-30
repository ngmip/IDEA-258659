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
 * Converter for {@link com.tmgateway.message.model.IncomingMessageQueryParameter}.
 *
 * NOTE: This class has been automatically generated from the {@link com.tmgateway.message.model.IncomingMessageQueryParameter} original class using Vert.x codegen.
 */
 class IncomingMessageQueryParameterConverter {

   static void fromJson(JsonObject json, IncomingMessageQueryParameter obj) {
    if (json.getValue("deviceId") instanceof String) {
      obj.setDeviceId((String)json.getValue("deviceId"));
    }
    if (json.getValue("fromDate") instanceof String) {
      obj.setFromDate((String)json.getValue("fromDate"));
    }
    if (json.getValue("limit") instanceof Number) {
      obj.setLimit(((Number)json.getValue("limit")).intValue());
    }
    if (json.getValue("sortOrder") instanceof String) {
      obj.setSortOrder((String)json.getValue("sortOrder"));
    }
    if (json.getValue("start") instanceof Number) {
      obj.setStart(((Number)json.getValue("start")).intValue());
    }
    if (json.getValue("toDate") instanceof String) {
      obj.setToDate((String)json.getValue("toDate"));
    }
    if (json.getValue("uuid") instanceof String) {
      obj.setUuid((String)json.getValue("uuid"));
    }
  }

   static void toJson(IncomingMessageQueryParameter obj, JsonObject json) {
    if (obj.getDeviceId() != null) {
      json.put("deviceId", obj.getDeviceId());
    }
    if (obj.getFromDate() != null) {
      json.put("fromDate", obj.getFromDate());
    }
    if (obj.getLimit() != null) {
      json.put("limit", obj.getLimit());
    }
    if (obj.getSortOrder() != null) {
      json.put("sortOrder", obj.getSortOrder());
    }
    if (obj.getStart() != null) {
      json.put("start", obj.getStart());
    }
    if (obj.getToDate() != null) {
      json.put("toDate", obj.getToDate());
    }
    if (obj.getUuid() != null) {
      json.put("uuid", obj.getUuid());
    }
  }
}