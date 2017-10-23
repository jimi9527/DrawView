package com.example.dengjx.practicdraw;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * DrawCicle
 * Created by dengjx on 2017/9/27.
 */

public class PraDrawCicleView extends View {

    Paint paint;
    public PraDrawCicleView(Context context) {
        this(context,null);
    }

    public PraDrawCicleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        paint = new Paint();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint.setColor(Color.BLACK);
        canvas.drawCircle(200,200,100,paint);

        paint.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(600,200,100,paint);

        paint.setColor(Color.GREEN);
        canvas.drawCircle(200,600,100,paint);

        paint.setColor(Color.BLACK);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(40);
        canvas.drawCircle(600,600,100,paint);
    }
}
