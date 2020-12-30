package com.tmgateway.message.model;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.core.json.JsonObject;

import java.util.Set;

import static java.util.Collections.emptySet;

@DataObject(generateConverter = true, publicConverter = false)
public class SaveDecodedMessageData {

    private String deviceId = "000000000000000";
    private String type = "UNKNOWN";
    private Set<String> profiles = emptySet();
    private Integer sequence = 0;
    private String timeuuid;
    private String decoded;

    public SaveDecodedMessageData() {
    }

    public SaveDecodedMessageData(JsonObject json) {
        SaveDecodedMessageDataConverter.fromJson(json, this);
    }

    public JsonObject toJson() {
        JsonObject jsonObject = new JsonObject();
        SaveDecodedMessageDataConverter.toJson(this, jsonObject);
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

    public Set<String> getProfiles() {
        return profiles;
    }

    public void setProfiles(Set<String> profiles) {
        this.profiles = profiles;
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public String getTimeuuid() {
        return timeuuid;
    }

    public void setTimeuuid(String timeuuid) {
        this.timeuuid = timeuuid;
    }

    public String getDecoded() {
        return decoded;
    }

    public void setDecoded(String decoded) {
        this.decoded = decoded;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder
                .append("SaveDecodedMessageData [deviceId=").append(deviceId)
                .append(", type=").append(type)
                .append(", profiles=").append(profiles)
                .append(", sequence=").append(sequence).append(", timeuuid=").append(timeuuid)
                .append(", decoded=").append(decoded).append("]");
        return builder.toString();
    }

}
