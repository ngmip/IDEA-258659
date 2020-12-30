/**
 *
 */
package com.tmgateway.message.model;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.core.json.JsonObject;

@DataObject(generateConverter = true, publicConverter = false)
public class DecodedMessageQueryParameter extends IncomingMessageQueryParameter {

    private String profile;

    public DecodedMessageQueryParameter() {
    }

    public DecodedMessageQueryParameter(JsonObject json) {
        super(json);
        DecodedMessageQueryParameterConverter.fromJson(json, this);
    }

    @Override
    public JsonObject toJson() {
        JsonObject jsonObject = super.toJson();
        DecodedMessageQueryParameterConverter.toJson(this, jsonObject);
        return jsonObject;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder
                .append("DecodedMessageQueryParameter [profile=").append(profile)
                .append(", deviceId=").append(getDeviceId())
                .append(", fromDate=").append(getFromDate())
                .append(", toDate=").append(getToDate())
                .append(", limit=").append(getLimit())
                .append(", start=").append(getStart())
                .append(", sortOrder=").append(getSortOrder()).append("]");
        return builder.toString();
    }

}
