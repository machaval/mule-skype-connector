/**
 *
 * (c) 2012 MuleSoft, Inc. This software is protected under international copyright
 * law. All use of this software is subject to MuleSoft's Master Subscription Agreement
 * (or other master license agreement) separately entered into in writing between you and
 * MuleSoft. If such an agreement is not in place, you may not use the software.
 */
package org.mulesoft.skype;

public class SkypeChatMessage
{
    private String userId;
    private String message;

    /**
     * Enumeration for STATUS of CHATMESSAGE.
     */
    public enum Status {
        /**
         * SENDING - message is being sent.
         * SENT - message was sent.
         * RECEIVED - message has been received.
         * READ - message has been read.
         */
        SENDING, SENT, RECEIVED, READ;
    }


    public SkypeChatMessage(String userId, String message) {
        this.userId = userId;
        this.message = message;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
