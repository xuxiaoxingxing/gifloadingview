package com.xiaoxing.gifloadingview;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.Gravity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

/**
 * Created by Roger on 2016/4/28.
 */
public class GifLoadingView1 extends DialogFragment {
    private static GifLoadingView1 sInstance = null;
    private Dialog mDialog;
    //  private GradientDrawable gd;
    private int mRadius = 10, tempRadius = 10;
    private float mDownScaleFactor = 5.0f, tempDownScaleFactor = 5.0f;
    private boolean mDimming = true;
    private boolean mBlurredActionBar = false;
    private int CornerRadius = 30;
    private int backGroundColor = Color.parseColor("#001991EC");
    private ImageView mImageView;
    private int id;

    public static GifLoadingView1 getInstance() {
        if (sInstance == null) {
            synchronized (GifLoadingView1.class) {
                if (sInstance == null)
                    sInstance = new GifLoadingView1();
            }
        }
        return sInstance;
    }

    public void dismissDialog() {
        if (sInstance != null) {
            if (isAdded())
                dismiss();
            sInstance = null;
        }
    }

    public void setImageResource(int id) {
        this.id = id;
        setResource();
    }

    private void setResource() {
        if (mDialog == null) {
            return;
        }
        setBackGroundColor(BitmapUtil.getPixColor(BitmapFactory.decodeResource(getResources(), id)));
        mImageView.setImageResource(id);
//    gd.setColor(backGroundColor);
//    mDialog.findViewById(R.id.mBackground).setBackground(gd);
    }

    public void setBackGroundColor(int backGroundColor) {
        this.backGroundColor = backGroundColor;
//    gd.setColor(backGroundColor);
//    mDialog.findViewById(R.id.mBackground).setBackground(gd);
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        if (mDialog == null) {
            mDialog = new Dialog(getActivity(), R.style.gif_dialog);
            mDialog.setContentView(R.layout.gifloading_main1);
            mDialog.setCanceledOnTouchOutside(true);
            mDialog.getWindow().setGravity(Gravity.CENTER);
//      gd = new GradientDrawable();
//      gd.setCornerRadius(CornerRadius);
            mImageView = (ImageView) mDialog.findViewById(R.id.gifImageView);
            if (id == 0) {
                id = R.drawable.loading_01;
            }
            setBackGroundColor(BitmapUtil.getPixColor(BitmapFactory.decodeResource(getResources(), id)));
            mImageView.setImageResource(id);

            Animation rotateAnimation = AnimationUtils.loadAnimation(getActivity(), R.anim.rotate_anim);
            mImageView.startAnimation(rotateAnimation);

//      gd.setColor(backGroundColor);
//      mDialog.findViewById(R.id.mBackground).setBackground(gd);
        }
        return mDialog;
    }

    @Override
    public void onDismiss(DialogInterface dialog) {
        super.onDismiss(dialog);
        mDialog = null;
    }

    public void setBackgroundResource(int id) {
        this.id = id;
        setResource();
    }

    public ImageView getmGifImageView() {
        return mImageView;
    }

    public void setBlurredActionBar(boolean mBlurredActionBar) {
        this.mBlurredActionBar = mBlurredActionBar;
    }

    public void setCornerRadius(int cornerRadius) {
        CornerRadius = cornerRadius;
    }

    public void setRadius(int mRadius) {
        this.mRadius = mRadius;
    }

    public void setDownScaleFactor(float mDownScaleFactor) {
        this.mDownScaleFactor = mDownScaleFactor;
    }

    public void setDimming(boolean mDimming) {
        this.mDimming = mDimming;
    }

//  @Override protected boolean isDimmingEnable() {
//    return mDimming;
//  }
//
//  @Override protected boolean isActionBarBlurred() {
//    return mBlurredActionBar;
//  }
//
//  @Override protected float getDownScaleFactor() {
//    return mDownScaleFactor;
//  }
//
//  @Override protected int getBlurRadius() {
//    return mRadius;
//  }
//
//  @Override protected boolean isDebugEnable() {
//    return false;
//  }
}
