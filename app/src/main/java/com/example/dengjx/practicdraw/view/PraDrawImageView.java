package com.example.dengjx.practicdraw.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Created by dengjx on 2017/10/31.
 */

public class PraDrawImageView extends ImageView {
    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    public PraDrawImageView(Context context) {
        this(context,null);
    }

    public PraDrawImageView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void onDrawForeground(Canvas canvas) {

        super.onDrawForeground(canvas);
       // drawNew(canvas);

        paint.setTextSize(60);
        paint.setColor(Color.parseColor("#f44336"));
        canvas.drawRect(0, 40, 200, 120, paint);
        paint.setColor(Color.WHITE);
        canvas.drawText("New", 20, 100, paint);
    }

    //绘制new 标签
    public void  drawNew(Canvas canvas){
        Paint paint = new Paint();
        paint.setColor(Color.RED);
        Rect rect = new Rect(0,100,200,80);
        canvas.drawRect(rect,paint);
        paint.setColor(Color.WHITE);
        paint.setTextSize(30);
        canvas.drawText("New",50,160,paint);
    }

}
