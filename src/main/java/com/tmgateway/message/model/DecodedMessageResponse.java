package com.tmgateway.message.model;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.core.json.JsonObject;

import java.util.List;

@DataObject(generateConverter = true, publicConverter = false)
public class DecodedMessageResponse {

    private int fetchSize;

    private long total;

    private List<DecodedMessage> messages;

    public static DecodedMessageResponse from(List<DecodedMessage> decodedMessages, long total, int fetchSize) {
        DecodedMessageResponse response = new DecodedMessageResponse();
        response.setTotal(total);
        response.setFetchSize(fetchSize);
        response.setMessages(decodedMessages);

        return response;
    }

    private DecodedMessageResponse() {
    }

    public DecodedMessageResponse(JsonObject json) {
        DecodedMessageResponseConverter.fromJson(json, this);
    }

    public JsonObject toJson() {
        JsonObject jsonObject = new JsonObject();
        DecodedMessageResponseConverter.toJson(this, jsonObject);
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

    public List<DecodedMessage> getMessages() {
        return messages;
    }

    public void setMessages(List<DecodedMessage> messages) {
        this.messages = messages;
    }

}
