package com.frontend.streampack;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.util.Map;
import java.util.HashMap;
import android.util.Log;

public class LiveModule extends ReactContextBaseJavaModule {
    private static ReactApplicationContext reactContext;
   LiveModule(ReactApplicationContext context) {
       super(context);
       reactContext = context;
   }

   @Override
   public String getName(){
       return "LiveModule";
   }

   @ReactMethod
   public String getDa() {
       return "haha";
   }
}