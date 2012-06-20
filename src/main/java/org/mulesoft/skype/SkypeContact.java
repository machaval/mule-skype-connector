/**
 *
 * (c) 2012 MuleSoft, Inc. This software is protected under international copyright
 * law. All use of this software is subject to MuleSoft's Master Subscription Agreement
 * (or other master license agreement) separately entered into in writing between you and
 * MuleSoft. If such an agreement is not in place, you may not use the software.
 */
package org.mulesoft.skype;

public class SkypeContact {
    /**
     * The <code>Status</code> enum contains the online status constants of the skype user.
     *
     */
    public enum Status {
        /**
         * The <code>UNKNOWN</code> constant indicates the skype user status is unknown.
         */
        UNKNOWN,
        /**
         * The <code>OFFLINE</code> constant indicates the skype user is offline.
         */
        OFFLINE,
        /**
         * The <code>ONLINE</code> constant indicates the skype user is online.
         */
        ONLINE,
        /**
         * The <code>AWAY</code> constant indicates the skype user is away.
         */
        AWAY,
        /**
         * The <code>NA</code> constant indicates the skype user is not available.
         */
        NA,
        /**
         * The <code>DND</code> constant indicates the skype user is in do not disturb mode.
         */
        DND,
        /**
         * The <code>SKYPEOUT</code> constant indicates the skype user is in SkypeOut mode.
         */
        SKYPEOUT,
        /**
         * The <code>SKYPEME</code> constant indicates the skype user is in SkypeMe mode.
         */
        SKYPEME,
    }

    private Status status;
    private String id;
    public SkypeContact(String id, Status status) {
        this.id = id;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
