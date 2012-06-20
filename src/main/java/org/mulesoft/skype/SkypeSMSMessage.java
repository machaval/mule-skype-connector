/**
 *
 * (c) 2012 MuleSoft, Inc. This software is protected under international copyright
 * law. All use of this software is subject to MuleSoft's Master Subscription Agreement
 * (or other master license agreement) separately entered into in writing between you and
 * MuleSoft. If such an agreement is not in place, you may not use the software.
 */
package org.mulesoft.skype;

public class SkypeSMSMessage {
    /**
     * Enumeration of SMS Status.
     */
    public enum Status {
        /**
         * RECEIVED	- SMS is received.
         * READ - SMS is read.
         * COMPOSING - SMS is being written (in Skype client).
         * SENDING_TO_SERVER - Sending the SMS to the SMS server.
         * SENT_TO_SERVER - SMS has been sent to the SMS server.
         * DELIVERED - SMS has been delivered to other party.
         * SOME_TARGETS_FAILED - SMS has not been deliverd to all parties.
         * FAILED - SMS could not be sent.
         * UNKNOWN - Status unknown.
         */
        RECEIVED, READ, COMPOSING, SENDING_TO_SERVER, SENT_TO_SERVER, DELIVERED, SOME_TARGETS_FAILED, FAILED, UNKNOWN;
    }

    private String message;
    private String phoneNumber;

    public SkypeSMSMessage(String message, String phoneNumber) {
        this.message = message;
        this.phoneNumber = phoneNumber;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
