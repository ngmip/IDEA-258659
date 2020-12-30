package com.tmgateway.message.model;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.core.json.JsonObject;

@DataObject(generateConverter = true, publicConverter = false)
public class DecodedMessage {

    private String message;

    private String timestamp;

    private int sequence;

    public DecodedMessage() {
    }

    public DecodedMessage(JsonObject json) {
        DecodedMessageConverter.fromJson(json, this);
    }

    public JsonObject toJson() {
        JsonObject jsonObject = new JsonObject();
        DecodedMessageConverter.toJson(this, jsonObject);
        return jsonObject;
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * @return the timestamp
     */
    public String getTimestamp() {
        return timestamp;
    }

    /**
     * @param timestamp the timestamp to set
     */
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * @return the sequence
     */
    public int getSequence() {
        return sequence;
    }

    /**
     * @param sequence the sequence to set
     */
    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("DecodedMessage [message=");
        builder.append(message);
        builder.append(", timestamp=");
        builder.append(timestamp);
        builder.append(", sequence=");
        builder.append(sequence);
        builder.append("]");
        return builder.toString();
    }

}
