package com.example.diasfu.academytutorialapp;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/**
 * Created by diasf on 26/08/2016.
 */
public class ImageUtils {
    //to calculate and scale down pictures
    public static int calculateInSampleSize(BitmapFactory.Options options, int reqWidth, int reqHeight){
        final int height = options.outHeight;
        final int width = options.outWidth;
        //always start at 1 cuz you don't know by how much it needs to be descaled
        int inSampleSize = 1;

        if(height > reqHeight || width > reqWidth){
            final int halfHeight= height/4;
            final int halfWidth= width/4;

            while((halfHeight / inSampleSize) > reqHeight && (halfWidth / inSampleSize) > reqWidth){
                inSampleSize *= 4;
            }
        }


        return inSampleSize;
    }

    //setting our utility class
    public static Bitmap decodeSampleBitmapFromResource(Resources res, int resId, int reqWidth, int reqHeight){
        //screenshots work in this method
        final BitmapFactory.Options options = new BitmapFactory.Options();
        //this just brings the picture spec, not the actual picture
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(res, resId, options);

        options.inSampleSize = calculateInSampleSize(options, reqWidth, reqHeight);
        //setting it to false, as next time, the actual image will be inmported
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeResource(res, resId, options);
    }

}
