package gms.adx.monetize;

import static android.app.Application.getProcessName;

import android.content.Context;
import android.os.Build;
import android.webkit.WebView;

import com.facebook.ads.AudienceNetworkAds;
import com.google.android.gms.ads.MobileAds;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.StartAppSDK;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.UnityAds;


public class MyApplicationclass {


    public static void initialize_ads(Context app_context, String unity_app_id, String start_app_id) {


        try {

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
                String process = getProcessName();
                if (!app_context.getPackageName().equals(process))
                    WebView.setDataDirectorySuffix(process);
            }

        } catch (Exception e) {

        }

        MobileAds.initialize(app_context);
        AudienceNetworkAds.initialize(app_context);


//        AdSettings.setTestMode(true);


        UnityAds.initialize(app_context, unity_app_id, false, new IUnityAdsInitializationListener() {
            @Override
            public void onInitializationComplete() {
            }

            @Override
            public void onInitializationFailed(UnityAds.UnityAdsInitializationError error, String message) {
            }
        });


        StartAppSDK.init(app_context, start_app_id, false);
        StartAppAd.disableSplash();

    }


}
