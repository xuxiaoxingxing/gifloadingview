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
        if (mGifLoadingView != null && mGifLoadingView.getDialog() != null && mGifLoadingView.getDialog().isShowing()) {
            mGifLoadingView.dismissDialog();
        } else {
            if (mGifLoadingView.isAdded()) {
                mGifLoadingView.dismiss();
            } else {
                mGifLoadingView.setImageResource(intRes);
                mGifLoadingView.show(fragmentManager, "");
            }
        }

    }

    public static void showGifdialog2(FragmentManager fragmentManager, int intRes) {

        GifLoadingView1 mGifLoadingView2 = GifLoadingView1.getInstance();
        if (mGifLoadingView2 != null && mGifLoadingView2.getDialog() != null && mGifLoadingView2.getDialog().isShowing()) {
            mGifLoadingView2.dismissDialog();
        } else {
            if (mGifLoadingView2.isAdded()) {
                mGifLoadingView2.dismiss();
            } else {
                mGifLoadingView2.setImageResource(intRes);
                mGifLoadingView2.show(fragmentManager, "");
            }
        }


    }

    public static void dismissDialog() {
        GifLoadingView1.getInstance().dismissDialog();
    }

    public static void dismissDialog1() {
        GifLoadingView.getInstance().dismissDialog();
    }


}
