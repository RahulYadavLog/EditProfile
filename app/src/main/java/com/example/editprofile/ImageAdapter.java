package com.example.editprofile;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

public class ImageAdapter extends PagerAdapter {
    Context mContext;
    ImageView imageView;
    ClickToGetPosition clickToGetPosition;

    int position = 0;
    private int[] sliderImageId;




    public interface ClickToGetPosition {
        void sendPos(int position);
    }

    ImageAdapter(Context context, int[] sliderImageId, ClickToGetPosition clickToGetPosition) {
        this.mContext = context;
        this.clickToGetPosition = clickToGetPosition;
        this.sliderImageId = sliderImageId;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((ImageView) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, final int position) {
        imageView = new ImageView(mContext);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageResource(sliderImageId[position]);
        ((ViewPager) container).addView(imageView, 0);

//        switch (position)
//        {
//            case 0:
//              imageView.setImageResource(sliderImageId[1]);
//          break;
//
//            case 1:
//                imageView.setImageResource(sliderImageId[2]);
//                break;
//        }
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickToGetPosition.sendPos(position);
            }
        });
        return imageView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        ((ViewPager) container).removeView((ImageView) object);
    }

    @Override
    public int getCount() {


        return sliderImageId.length;
    }
}
