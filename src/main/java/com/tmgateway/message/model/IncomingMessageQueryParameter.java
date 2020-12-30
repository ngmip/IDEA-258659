package com.tmgateway.message.model;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.core.json.JsonObject;

@DataObject(generateConverter = true, publicConverter = false)
public class IncomingMessageQueryParameter {
    private String deviceId;

    private String uuid;

    private String fromDate;

    private String toDate;

    private Integer limit = 25;

    private Integer start = 0;

    private String sortOrder = "DESC";

    public IncomingMessageQueryParameter() {
    }

    public IncomingMessageQueryParameter(JsonObject json) {
        IncomingMessageQueryParameterConverter.fromJson(json, this);
    }

    public JsonObject toJson() {
        JsonObject jsonObject = new JsonObject();
        IncomingMessageQueryParameterConverter.toJson(this, jsonObject);
        return jsonObject;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public String getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("IncomingMessageQueryParameter [deviceId=").append(deviceId)
                .append(", uuid=").append(uuid)
                .append(", fromDate=").append(fromDate)
                .append(", toDate=").append(toDate)
                .append(", limit=").append(limit)
                .append(", start=").append(start)
                .append(", sortOrder=").append(sortOrder).append("]");
        return builder.toString();
    }

}
