package io.invertase.firebase.messaging;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;

import com.facebook.react.HeadlessJsTaskService;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.jstasks.HeadlessJsTaskConfig;
import com.google.firebase.messaging.RemoteMessage;

import javax.annotation.Nullable;

public class RNFirebaseBackgroundMessagingService extends HeadlessJsTaskService {

//  @Override
//  public int onStartCommand(Intent intent, int flags, int startId) {
//    super.onStartCommand(intent, flags,startId);
//    return START_STICKY;
//  }


  @Override
  protected @Nullable
  HeadlessJsTaskConfig getTaskConfig(Intent intent) {
    Bundle extras = intent.getExtras();
    if (extras != null) {
      RemoteMessage message = intent.getParcelableExtra("message");
      WritableMap messageMap = MessagingSerializer.parseRemoteMessage(message);
      return new HeadlessJsTaskConfig(
        "RNFirebaseBackgroundMessage",
        messageMap,
        60000,
        true
      );
    }
    return null;
  }
}
