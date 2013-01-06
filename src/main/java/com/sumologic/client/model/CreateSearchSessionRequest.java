package com.sumologic.client.model;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author Christian Beedgen (christian@sumologic.com)
 * @version 1.0
 */
public final class CreateSearchSessionRequest {

    // Instance fields.

    private String query;
    private String fromExpression;
    private String toExpression;
    private String timeZone;

    // Implementation.

    /**
     * @param query          The query.
     * @param fromExpression The from expression.
     * @param toExpression   The toExpression.
     * @param timeZone       The time zone.
     */
    public CreateSearchSessionRequest(String query,
                                      String fromExpression,
                                      String toExpression,
                                      String timeZone) {
        this.query = query;
        this.fromExpression = fromExpression;
        this.toExpression = toExpression;
        this.timeZone = timeZone;
    }

    /**
     * Returns the query.
     *
     * @return The query.
     */
    public String getQuery() {
        return query;
    }

    /**
     * Sets the query.
     */
    public void setQuery(String query) {
        this.query = query;
    }

    /**
     * Sets the query.
     *
     * @return This object.
     */
    public CreateSearchSessionRequest withQuery(String query) {
        setQuery(query);
        return this;
    }

    /**
     * Returns the from expression.
     *
     * @return The from expression.
     */
    public String getFromExpression() {
        return fromExpression;
    }

    /**
     * Sets the from expression.
     */
    public void setFromExpression(String fromExpression) {
        this.fromExpression = fromExpression;
    }

    /**
     * Sets the from expression.
     *
     * @return This object.
     */
    public CreateSearchSessionRequest withFromExpresssion(String fromExpression) {
        setFromExpression(fromExpression);
        return this;
    }

    /**
     * Returns the to expression.
     *
     * @return The to expression.
     */
    public String getToExpression() {
        return toExpression;
    }

    /**
     * Sets the to expression.
     */
    public void setToExpression(String toExpression) {
        this.toExpression = toExpression;
    }

    /**
     * Sets the to expression.
     *
     * @return This object.
     */
    public CreateSearchSessionRequest withToTime(String toExpression) {
        setToExpression(toExpression);
        return this;
    }

    /**
     * Returns the time zone.
     *
     * @return The time zone.
     */
    public String getTimezone() {
        return timeZone;
    }

    /**
     * Sets the time zone.
     */
    public void setTimezone(String timeZone) {
        this.timeZone = timeZone;
    }

    /**
     * Sets the time zone.
     *
     * @return This object.
     */
    public CreateSearchSessionRequest withTimezone(String timeZone) {
        setTimezone(timeZone);
        return this;
    }

    public String toJson() {
        Map<String, Object> map = new TreeMap<String, Object>();
        map.put("q", query);
        map.put("from", fromExpression);
        map.put("to", toExpression);
        map.put("tz", timeZone);

        ObjectMapper objectMapper = new ObjectMapper();
        String result;
        try {
            result = objectMapper.writeValueAsString(map);
        } catch (IOException ioe) {
            throw new RuntimeException(ioe);
        }
        return result;
    }
}
