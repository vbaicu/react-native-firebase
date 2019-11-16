package io.invertase.firebase.messaging;

import java.util.Map;

public interface IRNNotifDisplayHandler {
    public void display(Map<String, String> remoteMessage);
}
