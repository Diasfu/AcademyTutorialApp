package com.example.diasfu.academytutorialapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by diasf on 26/08/2016.
 */
public class ImageAdaptor extends BaseAdapter {

    private Context mContext;
    //this sets the size of an image
    private int mImageHeight = 300;
    private int mImageWidth = 300;

    //setting up an array of pictures
    private static Integer[] mThumbnails={R.drawable.blanco_home,
            R.drawable.blanco_home_two,
            R.drawable.blanco_park,
            R.drawable.coffee,
            R.drawable.pancakes,
            R.drawable.us_bikes,
            R.drawable.us_sunset,
    };

    //context refers to the current activity that is active
    public ImageAdaptor(Context context){
        mContext = context;
    }


    @Override
    public int getCount() {
        return mThumbnails.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;

        if(convertView == null){
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(mImageHeight, mImageWidth));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8,8,8,8);
        }else{
            imageView= (ImageView) convertView;
        }
        //this loads the image in full so I will replace it with Bitmap bitmap..two lines down
        //imageView.setImageResource(mThumbnails[position]);
        Bitmap bitmap = ImageUtils.decodeSampleBitmapFromResource(mContext.getResources(), mThumbnails[position], mImageWidth, mImageHeight);
        imageView.setImageBitmap(bitmap);
        //this will rescale the pictures and show them

        return  imageView;
    }
}
