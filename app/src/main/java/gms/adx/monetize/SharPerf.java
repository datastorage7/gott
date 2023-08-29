package gms.adx.monetize;

import android.content.Context;


public class SharPerf {

    public static String dwnld = "dwnld";

    public static void set_dwnld(Context mContext, Integer integer) {
        mContext.getSharedPreferences(mContext.getPackageName(), 0).edit()
                .putInt(dwnld, integer).commit();
    }

    public static int get_dwnld(Context mContext) {
        return mContext.getSharedPreferences(mContext.getPackageName(), 0)
                .getInt(dwnld, 0);
    }


    public static String show_ads = "show_ads";

    public static void set_show_ads(Context mContext, String string) {
        mContext.getSharedPreferences(mContext.getPackageName(), 0).edit()
                .putString(show_ads, string).commit();
    }

    public static String get_show_ads(Context mContext) {
        return mContext.getSharedPreferences(mContext.getPackageName(), 0)
                .getString(show_ads, "1");
    }

    private static final String Exit_Pop = "Exit_Pop";

    public static void setExit_Pop(Context mContext, String string) {
        mContext.getSharedPreferences(mContext.getPackageName(), 0).edit()
                .putString(Exit_Pop, string).commit();
    }

    public static String getExit_Pop(Context mContext) {
        return mContext.getSharedPreferences(mContext.getPackageName(), 0)
                .getString(Exit_Pop, "0");
    }

    public static String counter_ads = "counter_ads";


    public static void set_counter_ads(Context mContext, String string) {
        mContext.getSharedPreferences(mContext.getPackageName(), 0).edit()
                .putString(counter_ads, string).commit();
    }

    public static String get_counter_ads(Context mContext) {
        return mContext.getSharedPreferences(mContext.getPackageName(), 0)
                .getString(counter_ads, "3");
    }


    private static final String Count_Ads = "Count_Ads";


    public static void setCount_Ads(Context mContext, int string) {
        mContext.getSharedPreferences(mContext.getPackageName(), 0).edit()
                .putInt(Count_Ads, string).commit();
    }

    public static int getCount_Ads(Context mContext) {
        return mContext.getSharedPreferences(mContext.getPackageName(), 0)
                .getInt(Count_Ads, 1);
    }


    public static String splesh_ads = "splesh_ads";

    public static void set_splesh_ads(Context mContext, String string) {
        mContext.getSharedPreferences(mContext.getPackageName(), 0).edit()
                .putString(splesh_ads, string).commit();
    }

    public static String get_splesh_ads(Context mContext) {
        return mContext.getSharedPreferences(mContext.getPackageName(), 0)
                .getString(splesh_ads, "3");
    }


    private static final String splash_anim = "splash_anim";

    public static void setsplash_anim(Context mContext, String string) {
        mContext.getSharedPreferences(mContext.getPackageName(), 0).edit()
                .putString(splash_anim, string).commit();
    }

    public static String getsplash_anim(Context mContext) {
        return mContext.getSharedPreferences(mContext.getPackageName(), 0)
                .getString(splash_anim, "0");
    }


    private static final String First_ads = "First_ads";


    public static void setFirst_ads(Context mContext, int string) {
        mContext.getSharedPreferences(mContext.getPackageName(), 0).edit()
                .putInt(First_ads, string).commit();
    }

    public static int getFirst_ads(Context mContext) {
        return mContext.getSharedPreferences(mContext.getPackageName(), 0)
                .getInt(First_ads, 0);
    }


    private static final String First_ads_splesh = "First_ads_splesh";


    public static void setFirst_ads_splesh(Context mContext, int string) {
        mContext.getSharedPreferences(mContext.getPackageName(), 0).edit()
                .putInt(First_ads_splesh, string).commit();
    }

    public static int getFirst_ads_splesh(Context mContext) {
        return mContext.getSharedPreferences(mContext.getPackageName(), 0)
                .getInt(First_ads_splesh, 0);
    }


    private static final String Increase_Ads = "Increase_Ads";


    public static void setIncrease_Ads(Context mContext, String string) {
        mContext.getSharedPreferences(mContext.getPackageName(), 0).edit()
                .putString(Increase_Ads, string).commit();
    }

    public static String getIncrease_Ads(Context mContext) {
        return mContext.getSharedPreferences(mContext.getPackageName(), 0)
                .getString(Increase_Ads, "0");
    }


    private static final String b_nooff = "b_nooff";


    public static void setb_nooff(Context mContext, String string) {
        mContext.getSharedPreferences(mContext.getPackageName(), 0).edit()
                .putString(b_nooff, string).commit();
    }

    public static String getb_nooff(Context mContext) {
        return mContext.getSharedPreferences(mContext.getPackageName(), 0)
                .getString(b_nooff, "1");
    }

    private static final String n_nooff = "n_nooff";

    public static void setn_nooff(Context mContext, String string) {
        mContext.getSharedPreferences(mContext.getPackageName(), 0).edit()
                .putString(n_nooff, string).commit();
    }

    public static String getn_nooff(Context mContext) {
        return mContext.getSharedPreferences(mContext.getPackageName(), 0)
                .getString(n_nooff, "1");
    }

    private static final String i_nooff = "i_nooff";


    public static void seti_nooff(Context mContext, String string) {
        mContext.getSharedPreferences(mContext.getPackageName(), 0).edit()
                .putString(i_nooff, string).commit();
    }

    public static String geti_nooff(Context mContext) {
        return mContext.getSharedPreferences(mContext.getPackageName(), 0)
                .getString(i_nooff, "1");
    }

    private static final String For_Approval = "For_Approval";

    public static void setFor_Approval(Context mContext, String string) {
        mContext.getSharedPreferences(mContext.getPackageName(), 0).edit()
                .putString(For_Approval, string).commit();
    }

    public static String getFor_Approval(Context mContext) {
        return mContext.getSharedPreferences(mContext.getPackageName(), 0)
                .getString(For_Approval, "0");

    }

    private static final String only_fb_inter = "only_fb_inter";

    public static void setonly_fb_inter(Context mContext, String string) {
        mContext.getSharedPreferences(mContext.getPackageName(), 0).edit()
                .putString(only_fb_inter, string).commit();
    }

    public static String getonly_fb_inter(Context mContext) {
        return mContext.getSharedPreferences(mContext.getPackageName(), 0)
                .getString(only_fb_inter, "0");
    }


    public static String fb_b = "fb_b";

    public static void set_fb_b(Context mContext, String string) {
        mContext.getSharedPreferences(mContext.getPackageName(), 0).edit()
                .putString(fb_b, string).commit();
    }

    public static String get_fb_b(Context mContext) {
        return mContext.getSharedPreferences(mContext.getPackageName(), 0)
                .getString(fb_b, Gotas.fb_b);
    }

    public static String fb_mr = "fb_mr";

    public static void set_fb_mr(Context mContext, String string) {
        mContext.getSharedPreferences(mContext.getPackageName(), 0).edit()
                .putString(fb_mr, string).commit();
    }

    public static String get_fb_mr(Context mContext) {
        return mContext.getSharedPreferences(mContext.getPackageName(), 0)
                .getString(fb_mr, Gotas.fb_mr);
    }


    public static String fb_i = "fb_i";

    public static void set_fb_i(Context mContext, String string) {
        mContext.getSharedPreferences(mContext.getPackageName(), 0).edit()
                .putString(fb_i, string).commit();
    }

    public static String get_fb_i(Context mContext) {
        return mContext.getSharedPreferences(mContext.getPackageName(), 0)
                .getString(fb_i, Gotas.fb_i);
    }


    public static String fb_n = "fb_n";

    public static void set_fb_n(Context mContext, String string) {
        mContext.getSharedPreferences(mContext.getPackageName(), 0).edit()
                .putString(fb_n, string).commit();
    }

    public static String get_fb_n(Context mContext) {
        return mContext.getSharedPreferences(mContext.getPackageName(), 0)
                .getString(fb_n, Gotas.fb_n);
    }


    public static String fb_ns = "IMG_16_9_APP_INSTALL#YOUR_PLACEMENT_ID";


    public static void set_fb_ns(Context mContext, String string) {
        mContext.getSharedPreferences(mContext.getPackageName(), 0).edit()
                .putString(fb_ns, string).commit();
    }

    public static String get_fb_ns(Context mContext) {
        return mContext.getSharedPreferences(mContext.getPackageName(), 0)
                .getString(fb_ns, Gotas.fb_ns);
    }


    private static final String GL_Setup_Ads = "GL_Setup_Ads";


    public static void setGL_Setup_Ads(Context mContext, String string) {
        mContext.getSharedPreferences(mContext.getPackageName(), 0).edit()
                .putString(GL_Setup_Ads, string).commit();
    }

    public static String getGL_Setup_Ads(Context mContext) {
        return mContext.getSharedPreferences(mContext.getPackageName(), 0)
                .getString(GL_Setup_Ads, "L");
    }

    public static String admob_i1 = "admob_i1";

    public static void set_admob_i1(Context mContext, String string) {
        mContext.getSharedPreferences(mContext.getPackageName(), 0).edit()
                .putString(admob_i1, string).commit();
    }

    public static String get_admob_i1(Context mContext) {
        return mContext.getSharedPreferences(mContext.getPackageName(), 0)
                .getString(admob_i1, Gotas.admob_i1);
    }

    public static String admob_i11 = "admob_i11";

    public static void set_admob_i11(Context mContext, String string) {
        mContext.getSharedPreferences(mContext.getPackageName(), 0).edit()
                .putString(admob_i11, string).commit();
    }

    public static String get_admob_i11(Context mContext) {
        return mContext.getSharedPreferences(mContext.getPackageName(), 0)
                .getString(admob_i11, Gotas.admob_i11);
    }


    public static String admob_i2 = "admob_i2";

    public static void set_admob_i2(Context mContext, String string) {
        mContext.getSharedPreferences(mContext.getPackageName(), 0).edit()
                .putString(admob_i2, string).commit();
    }

    public static String get_admob_i2(Context mContext) {
        return mContext.getSharedPreferences(mContext.getPackageName(), 0)
                .getString(admob_i2, Gotas.admob_i2);
    }

    public static String admob_i22 = "admob_i22";

    public static void set_admob_i22(Context mContext, String string) {
        mContext.getSharedPreferences(mContext.getPackageName(), 0).edit()
                .putString(admob_i22, string).commit();
    }

    public static String get_admob_i22(Context mContext) {
        return mContext.getSharedPreferences(mContext.getPackageName(), 0)
                .getString(admob_i22, Gotas.admob_i22);
    }

    public static String admob_i3 = "admob_i3";

    public static void set_admob_i3(Context mContext, String string) {
        mContext.getSharedPreferences(mContext.getPackageName(), 0).edit()
                .putString(admob_i3, string).commit();
    }

    public static String get_admob_i3(Context mContext) {
        return mContext.getSharedPreferences(mContext.getPackageName(), 0)
                .getString(admob_i3, Gotas.admob_i3);
    }

    public static String admob_i33 = "admob_i33";

    public static void set_admob_i33(Context mContext, String string) {
        mContext.getSharedPreferences(mContext.getPackageName(), 0).edit()
                .putString(admob_i33, string).commit();
    }

    public static String get_admob_i33(Context mContext) {
        return mContext.getSharedPreferences(mContext.getPackageName(), 0)
                .getString(admob_i33, Gotas.admob_i33);
    }

    public static String admob_b1 = "admob_b1";

    public static void set_admob_b1(Context mContext, String string) {
        mContext.getSharedPreferences(mContext.getPackageName(), 0).edit()
                .putString(admob_b1, string).commit();
    }

    public static String get_admob_b1(Context mContext) {
        return mContext.getSharedPreferences(mContext.getPackageName(), 0)
                .getString(admob_b1, Gotas.admob_b1);
    }

    public static String admob_b11 = "admob_b11";

    public static void set_admob_b11(Context mContext, String string) {
        mContext.getSharedPreferences(mContext.getPackageName(), 0).edit()
                .putString(admob_b11, string).commit();
    }

    public static String get_admob_b11(Context mContext) {
        return mContext.getSharedPreferences(mContext.getPackageName(), 0)
                .getString(admob_b11, Gotas.admob_b11);
    }

    public static String admob_b2 = "admob_b2";

    public static void set_admob_b2(Context mContext, String string) {
        mContext.getSharedPreferences(mContext.getPackageName(), 0).edit()
                .putString(admob_b2, string).commit();
    }

    public static String get_admob_b2(Context mContext) {
        return mContext.getSharedPreferences(mContext.getPackageName(), 0)
                .getString(admob_b2, Gotas.admob_b2);
    }

    public static String admob_b22 = "admob_b22";

    public static void set_admob_b22(Context mContext, String string) {
        mContext.getSharedPreferences(mContext.getPackageName(), 0).edit()
                .putString(admob_b22, string).commit();
    }

    public static String get_admob_b22(Context mContext) {
        return mContext.getSharedPreferences(mContext.getPackageName(), 0)
                .getString(admob_b22, Gotas.admob_b22);
    }

    public static String admob_b3 = "admob_b3";

    public static void set_admob_b3(Context mContext, String string) {
        mContext.getSharedPreferences(mContext.getPackageName(), 0).edit()
                .putString(admob_b3, string).commit();
    }

    public static String get_admob_b3(Context mContext) {
        return mContext.getSharedPreferences(mContext.getPackageName(), 0)
                .getString(admob_b3, Gotas.admob_b3);
    }

    public static String admob_b33 = "admob_b33";

    public static void set_admob_b33(Context mContext, String string) {
        mContext.getSharedPreferences(mContext.getPackageName(), 0).edit()
                .putString(admob_b33, string).commit();
    }

    public static String get_admob_b33(Context mContext) {
        return mContext.getSharedPreferences(mContext.getPackageName(), 0)
                .getString(admob_b33, Gotas.admob_b33);
    }


    public static String admob_n1 = "admob_n1";

    public static void set_admob_n1(Context mContext, String string) {
        mContext.getSharedPreferences(mContext.getPackageName(), 0).edit()
                .putString(admob_n1, string).commit();
    }

    public static String get_admob_n1(Context mContext) {
        return mContext.getSharedPreferences(mContext.getPackageName(), 0)
                .getString(admob_n1, Gotas.admob_n1);
    }

    public static String admob_n11 = "admob_n11";

    public static void set_admob_n11(Context mContext, String string) {
        mContext.getSharedPreferences(mContext.getPackageName(), 0).edit()
                .putString(admob_n11, string).commit();
    }

    public static String get_admob_n11(Context mContext) {
        return mContext.getSharedPreferences(mContext.getPackageName(), 0)
                .getString(admob_n11, Gotas.admob_n11);
    }


    public static String admob_n2 = "admob_n2";

    public static void set_admob_n2(Context mContext, String string) {
        mContext.getSharedPreferences(mContext.getPackageName(), 0).edit()
                .putString(admob_n2, string).commit();
    }

    public static String get_admob_n2(Context mContext) {
        return mContext.getSharedPreferences(mContext.getPackageName(), 0)
                .getString(admob_n2, Gotas.admob_n2);
    }

    public static String admob_n22 = "admob_n22";

    public static void set_admob_n22(Context mContext, String string) {
        mContext.getSharedPreferences(mContext.getPackageName(), 0).edit()
                .putString(admob_n22, string).commit();
    }

    public static String get_admob_n22(Context mContext) {
        return mContext.getSharedPreferences(mContext.getPackageName(), 0)
                .getString(admob_n22, Gotas.admob_n22);
    }

    public static String admob_n3 = "admob_n3";

    public static void set_admob_n3(Context mContext, String string) {
        mContext.getSharedPreferences(mContext.getPackageName(), 0).edit()
                .putString(admob_n3, string).commit();
    }

    public static String get_admob_n3(Context mContext) {
        return mContext.getSharedPreferences(mContext.getPackageName(), 0)
                .getString(admob_n3, Gotas.admob_n3);
    }


    public static String admob_n33 = "admob_n33";

    public static void set_admob_n33(Context mContext, String string) {
        mContext.getSharedPreferences(mContext.getPackageName(), 0).edit()
                .putString(admob_n33, string).commit();
    }

    public static String get_admob_n33(Context mContext) {
        return mContext.getSharedPreferences(mContext.getPackageName(), 0)
                .getString(admob_n33, Gotas.admob_n33);
    }


    public static String admob_ao = "admob_ao";

    public static void set_admob_ao(Context mContext, String string) {
        mContext.getSharedPreferences(mContext.getPackageName(), 0).edit()
                .putString(admob_ao, string).commit();
    }

    public static String get_admob_ao(Context mContext) {
        return mContext.getSharedPreferences(mContext.getPackageName(), 0)
                .getString(admob_ao, Gotas.admob_ao);
    }


    private static final String AC_App = "AC_App";

    public static void setAC_App(Context mContext, String string) {
        mContext.getSharedPreferences(mContext.getPackageName(), 0).edit()
                .putString(AC_App, string).commit();
    }

    public static String getAC_App(Context mContext) {
        return mContext.getSharedPreferences(mContext.getPackageName(), 0)
                .getString(AC_App, "");
    }


    private static final String AC_Inter = "AC_Inter";

    public static void setAC_Inter(Context mContext, String string) {
        mContext.getSharedPreferences(mContext.getPackageName(), 0).edit()
                .putString(AC_Inter, string).commit();
    }

    public static String getAC_Inter(Context mContext) {
        return mContext.getSharedPreferences(mContext.getPackageName(), 0)
                .getString(AC_Inter, "");
    }

    private static final String AC_Banner = "AC_Banner";

    public static void setAC_Banner(Context mContext, String string) {
        mContext.getSharedPreferences(mContext.getPackageName(), 0).edit()
                .putString(AC_Banner, string).commit();
    }

    public static String getAC_Banner(Context mContext) {
        return mContext.getSharedPreferences(mContext.getPackageName(), 0)
                .getString(AC_Banner, "");
    }

    private static final String AC_Reward = "AC_Reward";

    public static void setAC_Reward(Context mContext, String string) {
        mContext.getSharedPreferences(mContext.getPackageName(), 0).edit()
                .putString(AC_Reward, string).commit();
    }

    public static String getAC_Reward(Context mContext) {
        return mContext.getSharedPreferences(mContext.getPackageName(), 0)
                .getString(AC_Reward, "");
    }


    private static final String Tappx = "Tappx";

    public static void set_Tappx(Context mContext, String string) {
        mContext.getSharedPreferences(mContext.getPackageName(), 0).edit()
                .putString(Tappx, string).commit();
    }

    public static String get_Tappx(Context mContext) {
        return mContext.getSharedPreferences(mContext.getPackageName(), 0)
                .getString(Tappx, "");
    }


    private static final String BGColor = "BGColor";

    public static void setBGColor(Context mContext, String string) {
        mContext.getSharedPreferences(mContext.getPackageName(), 0).edit()
                .putString(BGColor, string).commit();
    }

    public static String getBGColor(Context mContext) {
        return mContext.getSharedPreferences(mContext.getPackageName(), 0)
                .getString(BGColor, "#292929");
    }


    private static final String TitleTextColor = "TitleTextColor";

    public static void setTitleTextColor(Context mContext, String string) {
        mContext.getSharedPreferences(mContext.getPackageName(), 0).edit()
                .putString(TitleTextColor, string).commit();
    }

    public static String getTitleTextColor(Context mContext) {
        return mContext.getSharedPreferences(mContext.getPackageName(), 0)
                .getString(TitleTextColor, "#ffffff");
    }


    private static final String DescriptionTextColor = "DescriptionTextColor";

    public static void setDescriptionTextColor(Context mContext, String string) {
        mContext.getSharedPreferences(mContext.getPackageName(), 0).edit()
                .putString(DescriptionTextColor, string).commit();
    }

    public static String getDescriptionTextColor(Context mContext) {
        return mContext.getSharedPreferences(mContext.getPackageName(), 0)
                .getString(DescriptionTextColor, "#b3b3b3");
    }


    private static final String ButtonColor = "ButtonColor";

    public static void setButtonColor(Context mContext, String string) {
        mContext.getSharedPreferences(mContext.getPackageName(), 0).edit()
                .putString(ButtonColor, string).commit();
    }

    public static String getButtonColor(Context mContext) {
        return mContext.getSharedPreferences(mContext.getPackageName(), 0)
                .getString(ButtonColor, "#474747");
    }


    private static final String ButtonTextColor = "ButtonTextColor";

    public static void setButtonTextColor(Context mContext, String string) {
        mContext.getSharedPreferences(mContext.getPackageName(), 0).edit()
                .putString(ButtonTextColor, string).commit();
    }

    public static String getButtonTextColor(Context mContext) {
        return mContext.getSharedPreferences(mContext.getPackageName(), 0)
                .getString(ButtonTextColor, "#ffffff");
    }


    private static final String ButtonBorderColor = "ButtonBorderColor";

    public static void setButtonBorderColor(Context mContext, String string) {
        mContext.getSharedPreferences(mContext.getPackageName(), 0).edit()
                .putString(ButtonBorderColor, string).commit();
    }

    public static String getButtonBorderColor(Context mContext) {
        return mContext.getSharedPreferences(mContext.getPackageName(), 0)
                .getString(ButtonBorderColor, "#ffffff");
    }


    private static final String Native_custom = "Native_custom";

    public static void setNative_custom(Context mContext, String string) {
        mContext.getSharedPreferences(mContext.getPackageName(), 0).edit()
                .putString(Native_custom, string).commit();
    }

    public static String getNative_custom(Context mContext) {
        return mContext.getSharedPreferences(mContext.getPackageName(), 0)
                .getString(Native_custom, "0");
    }

    private static final String AO_Setup = "ao_ads";

    public static void setAO_Setup(Context mContext, String string) {
        mContext.getSharedPreferences(mContext.getPackageName(), 0).edit()
                .putString(AO_Setup, string).commit();
    }

    public static String getAO_Setup(Context mContext) {
        return mContext.getSharedPreferences(mContext.getPackageName(), 0)
                .getString(AO_Setup, "1");
    }

    private static final String b_n_ex = "b_n_ex";


    public static void setb_n_ex(Context mContext, String string) {
        mContext.getSharedPreferences(mContext.getPackageName(), 0).edit()
                .putString(b_n_ex, string).commit();
    }

    public static String getb_n_ex(Context mContext) {
        return mContext.getSharedPreferences(mContext.getPackageName(), 0)
                .getString(b_n_ex, "0");
    }

    private static final String Extra1 = "Extra1";

    public static void setExtra1(Context mContext, String string) {
        mContext.getSharedPreferences(mContext.getPackageName(), 0).edit()
                .putString(Extra1, string).commit();
    }

    public static String getExtra1(Context mContext) {
        return mContext.getSharedPreferences(mContext.getPackageName(), 0)
                .getString(Extra1, "0");
    }

    private static final String Extra2 = "Extra2";

    public static void setExtra2(Context mContext, String string) {
        mContext.getSharedPreferences(mContext.getPackageName(), 0).edit()
                .putString(Extra2, string).commit();
    }

    public static String getExtra2(Context mContext) {
        return mContext.getSharedPreferences(mContext.getPackageName(), 0)
                .getString(Extra2, "0");
    }


    private static final String Extra3 = "Extra3";

    public static void setExtra3(Context mContext, String string) {
        mContext.getSharedPreferences(mContext.getPackageName(), 0).edit()
                .putString(Extra3, string).commit();
    }

    public static String getExtra3(Context mContext) {
        return mContext.getSharedPreferences(mContext.getPackageName(), 0)
                .getString(Extra3, "0");
    }


    private static final String Extra4 = "Extra4";

    public static void setExtra4(Context mContext, String string) {
        mContext.getSharedPreferences(mContext.getPackageName(), 0).edit()
                .putString(Extra4, string).commit();
    }

    public static String getExtra4(Context mContext) {
        return mContext.getSharedPreferences(mContext.getPackageName(), 0)
                .getString(Extra4, "0");
    }

    private static final String Extra5 = "Extra5";

    public static void setExtra5(Context mContext, String string) {
        mContext.getSharedPreferences(mContext.getPackageName(), 0).edit()
                .putString(Extra5, string).commit();
    }

    public static String getExtra5(Context mContext) {
        return mContext.getSharedPreferences(mContext.getPackageName(), 0)
                .getString(Extra5, "0");
    }


}
