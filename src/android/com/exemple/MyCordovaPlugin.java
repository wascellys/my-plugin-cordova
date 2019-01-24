
package android.com.exemple;

import java.util.TimeZone;

import org.apache.cordova.CordovaWebView;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaInterface;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.provider.Settings;

public class MyCordovaPlugin extends CordovaPlugin {
    public static final String TAG = "MyCordovaPlugin";

    public void initialize(CordovaInterface cordova, CordovaWebView webView) {
        super.initialize(cordova, webView);

        Log.d(TAG, "Inicializando PluginCordova");
    }

    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("echo")) {
            String phrase = args.getString(0);
            Log.d(TAG, phrase);
        } else if (action.equals("getDate")) {
            final PluginResult result = new PluginResult(PluginResult.Status.OK, (new Date()).toString());
            callbackContext.sendPluginResult(result);    
        }
        return true;        
    }

}
