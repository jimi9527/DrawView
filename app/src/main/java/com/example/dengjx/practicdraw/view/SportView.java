package com.example.dengjx.practicdraw.view;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by dengjx on 2017/10/31.
 */

public class SportView extends View {
    int degree;
    ObjectAnimator objectAnimator;
    public SportView(Context context) {
        this(context,null);
    }

    public SportView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        objectAnimator = ObjectAnimator.ofInt(this,"degree",0,65);
        objectAnimator.setDuration(1000);
    }

    public void setDegree(int degree) {
        this.degree = degree;
        invalidate();
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        objectAnimator.start();
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        objectAnimator.end();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint = new Paint();
        paint.setColor(Color.WHITE);
        paint.setTextSize(40);

        canvas.drawText(degree+"%",300,300,paint);

        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(20);
        RectF rectF = new RectF(150,150,450,450);
        canvas.drawArc(rectF,135,degree*2.7f,false,paint );

    }
}
