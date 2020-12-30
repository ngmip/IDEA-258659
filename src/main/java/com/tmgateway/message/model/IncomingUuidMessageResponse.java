/**
 *
 */
package com.tmgateway.message.model;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.core.json.JsonObject;

import java.util.UUID;

/**
 * @author philippe.suray
 *
 */
@DataObject(generateConverter = true, publicConverter = false)
public class IncomingUuidMessageResponse {

    private String message;

    private String timestamp;

    private String type;

    private UUID uuid;

    public static IncomingUuidMessageResponse from(IncomingMessage incoming, UUID uuid) {
        IncomingUuidMessageResponse response = new IncomingUuidMessageResponse();

        response.setMessage(incoming.getMessage());
        response.setTimestamp(incoming.getTimestamp());
        response.setType(incoming.getType());
        response.setUuid(uuid);

        return response;
    }

    private IncomingUuidMessageResponse() {
    }

    public IncomingUuidMessageResponse(JsonObject json) {
        IncomingUuidMessageResponseConverter.fromJson(json, this);
    }

    public JsonObject toJson() {
        JsonObject jsonObject = new JsonObject();
        IncomingUuidMessageResponseConverter.toJson(this, jsonObject);
        return jsonObject;
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

}
