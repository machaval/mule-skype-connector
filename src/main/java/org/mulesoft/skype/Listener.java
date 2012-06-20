/**
 *
 * (c) 2012 MuleSoft, Inc. This software is protected under international copyright
 * law. All use of this software is subject to MuleSoft's Master Subscription Agreement
 * (or other master license agreement) separately entered into in writing between you and
 * MuleSoft. If such an agreement is not in place, you may not use the software.
 */
package org.mulesoft.skype;

import com.skype.ChatMessage;
import com.skype.ChatMessageListener;
import com.skype.Skype;
import com.skype.SkypeException;

import java.util.logging.Level;

public class Listener {
    public static void main(String[] args) throws SkypeException {
        Skype.setDaemon(false);
        Skype.addChatMessageListener(new ChatMessageListener() {
            public void chatMessageReceived(ChatMessage receivedChatMessage) throws SkypeException {
                System.out.println("Listener.chatMessageReceived");
                try {
                    if (receivedChatMessage.getType().equals(ChatMessage.Type.SAID)) {
                        System.out.println("Listener.chatMessageReceived");
                    }
                } catch (Exception e) {

                }
            }

            public void chatMessageSent(ChatMessage sentChatMessage) throws SkypeException {

            }
        });
    }
}
