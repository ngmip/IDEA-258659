package com.tmgateway.message.api.proxy;

import com.tmgateway.message.model.SaveIncomingMessageData;
import io.vertx.codegen.annotations.ProxyGen;
import io.vertx.codegen.annotations.VertxGen;
import io.vertx.core.Vertx;
import io.vertx.serviceproxy.ServiceProxyBuilder;

@VertxGen
@ProxyGen
public interface IncomingMessageService {

    String CASSANDRA_INCOMING = "gateway.cassandra.incoming";

    static IncomingMessageService createProxy(Vertx vertx) {
        ServiceProxyBuilder builder = new ServiceProxyBuilder(vertx).setAddress(CASSANDRA_INCOMING);
        return builder.build(IncomingMessageService.class);
    }

    void saveIncoming(SaveIncomingMessageData incoming);
}
