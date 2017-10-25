package com.example.dengjx.practicdraw.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.example.dengjx.practicdraw.R;

/**
 * Created by dengjx on 2017/10/24.
 */

public class PraMaskFilterView extends View {
    Paint paint;

    public PraMaskFilterView(Context context) {
        this(context,null);
    }

    public PraMaskFilterView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        paint = new Paint();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
     //   paint.setMaskFilter(new BlurMaskFilter(50,BlurMaskFilter.Blur.NORMAL));
     //   paint.setMaskFilter(new BlurMaskFilter(50,BlurMaskFilter.Blur.SOLID));
     //   paint.setMaskFilter(new BlurMaskFilter(50,BlurMaskFilter.Blur.INNER));
      //  paint.setMaskFilter(new BlurMaskFilter(50,BlurMaskFilter.Blur.OUTER));

        ColorFilter lightingColorFilter = new LightingColorFilter(0x00ffff, 0x000050);
        paint.setColorFilter(lightingColorFilter);

        Bitmap bitmapIcon = BitmapFactory.decodeResource(getResources(), R.drawable.what_the_fuck);
        canvas.drawBitmap(bitmapIcon,100,100,paint);


    }
}
