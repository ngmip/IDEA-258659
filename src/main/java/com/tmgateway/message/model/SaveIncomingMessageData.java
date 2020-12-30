package com.tmgateway.message.model;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.core.json.JsonObject;

@DataObject(generateConverter = true, publicConverter = false)
public class SaveIncomingMessageData {

    private String deviceId = "000000000000000";
    private String type = "UNKNOWN";
    private String timeuuid;
    private String message;
    private String source;

    public SaveIncomingMessageData(String deviceId, String type, String timeuuid, String message, String source) {
        this.deviceId = deviceId;
        this.type = type;
        this.timeuuid = timeuuid;
        this.message = message;
        this.source = source;
    }

    public SaveIncomingMessageData(JsonObject json) {
        SaveIncomingMessageDataConverter.fromJson(json, this);
    }

    public JsonObject toJson() {
        JsonObject jsonObject = new JsonObject();
        SaveIncomingMessageDataConverter.toJson(this, jsonObject);
        return jsonObject;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTimeuuid() {
        return timeuuid;
    }

    public void setTimeuuid(String timeuuid) {
        this.timeuuid = timeuuid;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
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
        builder
                .append("SaveIncomingMessageData [deviceId=").append(deviceId)
                .append(", type=").append(type)
                .append(", timeuuid=").append(timeuuid)
                .append(", source=").append(source)
                .append(", message=").append(message).append("]");
        return builder.toString();
    }
}
