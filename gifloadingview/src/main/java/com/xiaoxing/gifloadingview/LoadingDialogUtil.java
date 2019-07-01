package com.xiaoxing.gifloadingview;


import android.support.v4.app.FragmentManager;

/**
 * 描述：
 * 作者：xiaoxing on 17/4/23 22:10
 * 邮箱：2235445233@qq.com
 */
public class LoadingDialogUtil {


    public static void showGifdialog1(FragmentManager fragmentManager, int intRes) {

        GifLoadingView mGifLoadingView = GifLoadingView.getInstance();
        mGifLoadingView.setImageResource(intRes);
        mGifLoadingView.show(fragmentManager, "");

    }

    public static void showGifdialog2(FragmentManager fragmentManager, int intRes) {

        GifLoadingView1 mGifLoadingView2 = GifLoadingView1.getInstance();
        mGifLoadingView2.setImageResource(intRes);
        mGifLoadingView2.show(fragmentManager, "");

    }

    public static void dismissDialog() {
        GifLoadingView.getInstance().dismissDialog();
        GifLoadingView1.getInstance().dismissDialog();

    }


}
