package com.tmgateway.message.model;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.core.json.JsonObject;

import java.util.List;

@DataObject(generateConverter = true, publicConverter = false)
public class IncomingMessageResponse {

    private int fetchSize;

    private long total;

    private List<IncomingMessage> messages;

    public static IncomingMessageResponse from(List<IncomingMessage> list, long total, int fetchSize) {
        IncomingMessageResponse response = new IncomingMessageResponse();
        response.setTotal(total);
        response.setFetchSize(fetchSize);
        response.setMessages(list);

        return response;
    }

    private IncomingMessageResponse() {
    }

    public IncomingMessageResponse(JsonObject json) {
        IncomingMessageResponseConverter.fromJson(json, this);
    }

    public JsonObject toJson() {
        JsonObject jsonObject = new JsonObject();
        IncomingMessageResponseConverter.toJson(this, jsonObject);
        return jsonObject;
    }

    public int getFetchSize() {
        return fetchSize;
    }

    public void setFetchSize(int fetchSize) {
        this.fetchSize = fetchSize;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<IncomingMessage> getMessages() {
        return messages;
    }

    public void setMessages(List<IncomingMessage> messages) {
        this.messages = messages;
    }

}
