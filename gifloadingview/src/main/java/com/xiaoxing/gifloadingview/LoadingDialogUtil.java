package com.xiaoxing.gifloadingview;

import android.app.FragmentManager;


/**
 * 描述：
 * 作者：xiaoxing on 17/4/23 22:10
 * 邮箱：2235445233@qq.com
 */
public class LoadingDialogUtil {


    private static GifLoadingView mGifLoadingView;


    public static void showGifdialog1(FragmentManager fragmentManager, int intRes) {

        mGifLoadingView = new GifLoadingView();
        mGifLoadingView.setImageResource(intRes);
        mGifLoadingView.show(fragmentManager, "");

    }

    public static void dismissDialog() {
        if (mGifLoadingView != null) {
            mGifLoadingView.dismiss();
        }
    }


}
