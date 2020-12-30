/*
 * Copyright 2014 Red Hat, Inc.
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

package com.tmgateway.message.api.proxy.rxjava;

import java.util.Map;
import rx.Observable;
import rx.Single;
import com.tmgateway.message.model.SaveIncomingMessageData;
import io.vertx.rxjava.core.Vertx;


@io.vertx.lang.rxjava.RxGen(com.tmgateway.message.api.proxy.IncomingMessageService.class)
public class IncomingMessageService {

  @Override
  public String toString() {
    return delegate.toString();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    IncomingMessageService that = (IncomingMessageService) o;
    return delegate.equals(that.delegate);
  }
  
  @Override
  public int hashCode() {
    return delegate.hashCode();
  }

  public static final io.vertx.lang.rxjava.TypeArg<IncomingMessageService> __TYPE_ARG = new io.vertx.lang.rxjava.TypeArg<>(
    obj -> new IncomingMessageService((com.tmgateway.message.api.proxy.IncomingMessageService) obj),
    IncomingMessageService::getDelegate
  );

  private final com.tmgateway.message.api.proxy.IncomingMessageService delegate;
  
  public IncomingMessageService(com.tmgateway.message.api.proxy.IncomingMessageService delegate) {
    this.delegate = delegate;
  }

  public com.tmgateway.message.api.proxy.IncomingMessageService getDelegate() {
    return delegate;
  }

  public static IncomingMessageService createProxy(Vertx vertx) { 
    IncomingMessageService ret = IncomingMessageService.newInstance(com.tmgateway.message.api.proxy.IncomingMessageService.createProxy(vertx.getDelegate()));
    return ret;
  }

  public void saveIncoming(SaveIncomingMessageData incoming) { 
    delegate.saveIncoming(incoming);
  }


  public static  IncomingMessageService newInstance(com.tmgateway.message.api.proxy.IncomingMessageService arg) {
    return arg != null ? new IncomingMessageService(arg) : null;
  }
}
