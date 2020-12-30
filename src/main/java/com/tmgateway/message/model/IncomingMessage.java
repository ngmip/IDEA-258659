package com.tmgateway.message.model;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.core.json.JsonObject;

import java.util.UUID;

@DataObject(generateConverter = true, publicConverter = false)
public class IncomingMessage {

    private String deviceId;

    private String message;

    private String timestamp;

    private String type;

    private UUID uuid;

    private String source;

    public IncomingMessage() {
    }

    public IncomingMessage(JsonObject json) {
        IncomingMessageConverter.fromJson(json, this);
    }

    public JsonObject toJson() {
        JsonObject jsonObject = new JsonObject();
        IncomingMessageConverter.toJson(this, jsonObject);
        return jsonObject;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("IncomingMessage [timestamp=");
        builder.append(timestamp);
        builder.append(", uuid=");
        builder.append(uuid);
        builder.append(", type=");
        builder.append(type);
        builder.append(", message=");
        builder.append(message);
        builder.append("]");
        return builder.toString();
    }
}
