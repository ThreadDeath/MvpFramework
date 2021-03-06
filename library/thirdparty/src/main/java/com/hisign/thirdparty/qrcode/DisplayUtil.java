package com.hisign.thirdparty.qrcode;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;

/**
 * 描述：像素和dp转换工具类
 * 公司：北京海鑫科金高科技股份有限公司
 * 作者：张绪飞
 * 创建时间:2016/12/6
 * 最后修改时间:2016/12/6
 */
public class DisplayUtil {
    
    public static int screenWidthPx;  //屏幕宽 px
    public static int screenHeightPx; //屏幕高 px
    public static float density; // 屏幕密度比
    public static int densityDPI;// 屏幕密度
    public static float screenWidthDip; //  dp单位
    public static float screenHeightDip;//  dp单位
    
    /**
     * 根据手机的分辨率从 dp 的单位 转成为 px(像素)
     */
    public static int dip2px(Context context, float dpValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }
    
    /**
     * 根据手机的分辨率从 px(像素) 的单位 转成为 dp
     */
    public static int px2dip(Context context, float pxValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (pxValue / scale + 0.5f);
    }

    /**
     * 获得屏幕宽度
     *
     * @param context
     * @return
     */
    public static int getScreenWidth(Context context) {
        WindowManager wm = (WindowManager) context
                .getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics outMetrics = new DisplayMetrics();
        wm.getDefaultDisplay().getMetrics(outMetrics);
        return outMetrics.widthPixels;
    }

    /**
     * 获得屏幕高度
     *
     * @param context
     * @return
     */
    public static int getScreenHeight(Context context) {
        WindowManager wm = (WindowManager) context
                .getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics outMetrics = new DisplayMetrics();
        wm.getDefaultDisplay().getMetrics(outMetrics);
        return outMetrics.heightPixels;
    }

}
