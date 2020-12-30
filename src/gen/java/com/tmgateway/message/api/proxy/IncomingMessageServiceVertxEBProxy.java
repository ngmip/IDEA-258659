/*
* Copyright 2014 Red Hat, Inc.
*
* Red Hat licenses this file to you under the Apache License, version 2.0
* (the "License"); you may not use this file except in compliance with the
* License. You may obtain a copy of the License at:
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
* WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
* License for the specific language governing permissions and limitations
* under the License.
*/

package com.tmgateway.message.api.proxy;

import com.tmgateway.message.api.proxy.IncomingMessageService;
import io.vertx.core.eventbus.DeliveryOptions;
import io.vertx.core.Vertx;
import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.function.Function;
import io.vertx.serviceproxy.ProxyHelper;
import io.vertx.serviceproxy.ServiceException;
import io.vertx.serviceproxy.ServiceExceptionMessageCodec;
import com.tmgateway.message.model.SaveIncomingMessageData;
import com.tmgateway.message.model.IncomingUuidMessageResponse;
import com.tmgateway.message.model.DecodedMessageQueryParameter;
import io.vertx.core.Vertx;
import com.tmgateway.message.model.IncomingMessageResponse;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import com.tmgateway.message.model.DecodedMessageResponse;
import com.tmgateway.message.api.proxy.IncomingMessageService;
import com.tmgateway.message.model.IncomingMessageQueryParameter;

/*
  Generated Proxy code - DO NOT EDIT
  @author Roger the Robot
*/
@SuppressWarnings({"unchecked", "rawtypes"})
public class IncomingMessageServiceVertxEBProxy implements IncomingMessageService {

  private Vertx _vertx;
  private String _address;
  private DeliveryOptions _options;
  private boolean closed;

  public IncomingMessageServiceVertxEBProxy(Vertx vertx, String address) {
    this(vertx, address, null);
  }

  public IncomingMessageServiceVertxEBProxy(Vertx vertx, String address, DeliveryOptions options) {
    this._vertx = vertx;
    this._address = address;
    this._options = options;
    try {
      this._vertx.eventBus().registerDefaultCodec(ServiceException.class,
          new ServiceExceptionMessageCodec());
    } catch (IllegalStateException ex) {}
  }

  @Override
  public void saveIncoming(SaveIncomingMessageData incoming) {
    if (closed) {
    throw new IllegalStateException("Proxy is closed");
  }
    JsonObject _json = new JsonObject();
    _json.put("incoming", incoming == null ? null : incoming.toJson());
    DeliveryOptions _deliveryOptions = (_options != null) ? new DeliveryOptions(_options) : new DeliveryOptions();
    _deliveryOptions.addHeader("action", "saveIncoming");
    _vertx.eventBus().send(_address, _json, _deliveryOptions);
  }

  @Override
  public void retrieveIncomingMessageByUUID(IncomingMessageQueryParameter queryParameters, Handler<AsyncResult<IncomingUuidMessageResponse>> resultHandler) {
    if (closed) {
    resultHandler.handle(Future.failedFuture(new IllegalStateException("Proxy is closed")));
      return;
    }
    JsonObject _json = new JsonObject();
    _json.put("queryParameters", queryParameters == null ? null : queryParameters.toJson());
    DeliveryOptions _deliveryOptions = (_options != null) ? new DeliveryOptions(_options) : new DeliveryOptions();
    _deliveryOptions.addHeader("action", "retrieveIncomingMessageByUUID");
    _vertx.eventBus().<JsonObject>send(_address, _json, _deliveryOptions, res -> {
      if (res.failed()) {
        resultHandler.handle(Future.failedFuture(res.cause()));
      } else {
        resultHandler.handle(Future.succeededFuture(res.result().body() == null ? null : new IncomingUuidMessageResponse(res.result().body())));
                      }
    });
  }

  @Override
  public void retrieveIncomingMessages(IncomingMessageQueryParameter queryParameters, Handler<AsyncResult<IncomingMessageResponse>> resultHandler) {
    if (closed) {
    resultHandler.handle(Future.failedFuture(new IllegalStateException("Proxy is closed")));
      return;
    }
    JsonObject _json = new JsonObject();
    _json.put("queryParameters", queryParameters == null ? null : queryParameters.toJson());
    DeliveryOptions _deliveryOptions = (_options != null) ? new DeliveryOptions(_options) : new DeliveryOptions();
    _deliveryOptions.addHeader("action", "retrieveIncomingMessages");
    _vertx.eventBus().<JsonObject>send(_address, _json, _deliveryOptions, res -> {
      if (res.failed()) {
        resultHandler.handle(Future.failedFuture(res.cause()));
      } else {
        resultHandler.handle(Future.succeededFuture(res.result().body() == null ? null : new IncomingMessageResponse(res.result().body())));
                      }
    });
  }

  @Override
  public void retrieveDecodedMessages(DecodedMessageQueryParameter queryParameters, Handler<AsyncResult<DecodedMessageResponse>> resultHandler) {
    if (closed) {
    resultHandler.handle(Future.failedFuture(new IllegalStateException("Proxy is closed")));
      return;
    }
    JsonObject _json = new JsonObject();
    _json.put("queryParameters", queryParameters == null ? null : queryParameters.toJson());
    DeliveryOptions _deliveryOptions = (_options != null) ? new DeliveryOptions(_options) : new DeliveryOptions();
    _deliveryOptions.addHeader("action", "retrieveDecodedMessages");
    _vertx.eventBus().<JsonObject>send(_address, _json, _deliveryOptions, res -> {
      if (res.failed()) {
        resultHandler.handle(Future.failedFuture(res.cause()));
      } else {
        resultHandler.handle(Future.succeededFuture(res.result().body() == null ? null : new DecodedMessageResponse(res.result().body())));
                      }
    });
  }


  private List<Character> convertToListChar(JsonArray arr) {
    List<Character> list = new ArrayList<>();
    for (Object obj: arr) {
      Integer jobj = (Integer)obj;
      list.add((char)(int)jobj);
    }
    return list;
  }

  private Set<Character> convertToSetChar(JsonArray arr) {
    Set<Character> set = new HashSet<>();
    for (Object obj: arr) {
      Integer jobj = (Integer)obj;
      set.add((char)(int)jobj);
    }
    return set;
  }

  private <T> Map<String, T> convertMap(Map map) {
    if (map.isEmpty()) { 
      return (Map<String, T>) map; 
    } 
     
    Object elem = map.values().stream().findFirst().get(); 
    if (!(elem instanceof Map) && !(elem instanceof List)) { 
      return (Map<String, T>) map; 
    } else { 
      Function<Object, T> converter; 
      if (elem instanceof List) { 
        converter = object -> (T) new JsonArray((List) object); 
      } else { 
        converter = object -> (T) new JsonObject((Map) object); 
      } 
      return ((Map<String, T>) map).entrySet() 
       .stream() 
       .collect(Collectors.toMap(Map.Entry::getKey, converter::apply)); 
    } 
  }
  private <T> List<T> convertList(List list) {
    if (list.isEmpty()) { 
          return (List<T>) list; 
        } 
     
    Object elem = list.get(0); 
    if (!(elem instanceof Map) && !(elem instanceof List)) { 
      return (List<T>) list; 
    } else { 
      Function<Object, T> converter; 
      if (elem instanceof List) { 
        converter = object -> (T) new JsonArray((List) object); 
      } else { 
        converter = object -> (T) new JsonObject((Map) object); 
      } 
      return (List<T>) list.stream().map(converter).collect(Collectors.toList()); 
    } 
  }
  private <T> Set<T> convertSet(List list) {
    return new HashSet<T>(convertList(list));
  }
}