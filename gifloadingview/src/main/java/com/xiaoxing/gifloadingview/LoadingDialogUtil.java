package com.xiaoxing.gifloadingview;


import android.support.v4.app.FragmentManager;

/**
 * 描述：
 * 作者：xiaoxing on 17/4/23 22:10
 * 邮箱：2235445233@qq.com
 */
public class LoadingDialogUtil {


    private static GifLoadingView mGifLoadingView;
    private static GifLoadingView1 mGifLoadingView2;


    public static void showGifdialog1(FragmentManager fragmentManager, int intRes) {

        mGifLoadingView = new GifLoadingView();
        mGifLoadingView.setImageResource(intRes);
        mGifLoadingView.show(fragmentManager, "");

    }

    public static void showGifdialog2(FragmentManager fragmentManager, int intRes) {

        mGifLoadingView2 = new GifLoadingView1();
        mGifLoadingView2.setImageResource(intRes);
        mGifLoadingView2.show(fragmentManager, "");

    }

    public static void dismissDialog() {
        if (mGifLoadingView != null) {
            mGifLoadingView.dismiss();
        }
        if (mGifLoadingView2 != null) {
            mGifLoadingView2.dismiss();
        }
    }


}
