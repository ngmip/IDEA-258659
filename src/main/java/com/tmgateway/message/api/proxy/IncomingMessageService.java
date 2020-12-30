/**
 *
 */
package com.tmgateway.message.api.proxy;

import com.tmgateway.message.model.*;
import io.vertx.codegen.annotations.ProxyGen;
import io.vertx.codegen.annotations.VertxGen;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
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

    void retrieveIncomingMessageByUUID(IncomingMessageQueryParameter queryParameters, Handler<AsyncResult<IncomingUuidMessageResponse>> resultHandler);

    void retrieveIncomingMessages(IncomingMessageQueryParameter queryParameters, Handler<AsyncResult<IncomingMessageResponse>> resultHandler);

    void retrieveDecodedMessages(DecodedMessageQueryParameter queryParameters, Handler<AsyncResult<DecodedMessageResponse>> resultHandler);
}
