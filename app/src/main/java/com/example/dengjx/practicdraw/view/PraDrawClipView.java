package com.example.dengjx.practicdraw.view;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;

import com.example.dengjx.practicdraw.R;

/**
 * Created by dengjx on 2017/10/26.
 */

public class PraDrawClipView extends View {
    Paint paint;
    int degree;
    Camera camera;
    ObjectAnimator animator = ObjectAnimator.ofInt(this,"degree",0,180);
    public PraDrawClipView(Context context) {
        this(context,null);
    }

    public PraDrawClipView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        paint = new Paint();
        camera = new Camera();
        animator.setDuration(5000);
        animator.setInterpolator(new LinearInterpolator());
        animator.setRepeatCount(ValueAnimator.INFINITE);
        animator.setRepeatMode(ValueAnimator.REVERSE);
    }

    public void setDegree(int degree) {
        this.degree = degree;
        invalidate();
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        animator.start();
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        animator.end();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.maps);

    /*  // 第一种
        canvas.save();
        Path path = new Path();
        path.addCircle(400,300,200, Path.Direction.CCW);
        canvas.clipPath(path);*//*
        canvas.drawBitmap(bitmap,50,50,paint);
        canvas.restore();*/

       /* // 第二种
        canvas.save();
        Path path = new Path();
        path.addCircle(400,300,200, Path.Direction.CCW);
        path.setFillType(Path.FillType.INVERSE_WINDING);
        canvas.clipPath(path);
        canvas.drawBitmap(bitmap,50,50,paint);
        canvas.restore();*/

      /* // 旋转90 或者 45
        canvas.save();
        canvas.rotate(45,bitmap.getWidth()/2 + 50 ,bitmap.getHeight()/2 +50);
        canvas.drawBitmap(bitmap,50,50,paint);
        canvas.restore();*/

     /*   canvas.save();

        camera.save();
        camera.rotateX(30);
        canvas.translate(bitmap.getWidth()/2 + 50,bitmap.getHeight()/2 + 50);
        camera.applyToCanvas(canvas);
        canvas.translate(-(bitmap.getWidth()/2 + 50),-(bitmap.getHeight()/2 + 50));
        camera.restore();
        canvas.drawBitmap(bitmap,50,50,paint);
        canvas.restore();*/

        int bitmapwidth = bitmap.getWidth();
        int bitmapHeight = bitmap.getHeight();
        int centerX = getWidth()/2;
        int centerY = getHeight()/2;

        int x = centerX - bitmapwidth/2;
        int y = centerY - bitmapHeight/2;

        canvas.save();
        canvas.clipRect(0,0,getWidth(),centerY);
        canvas.drawBitmap(bitmap,x,y,paint);
        canvas.restore();

        canvas.save();
        if(degree < 90){
            canvas.clipRect(0,centerY,getWidth(),getHeight());
        }else{
            canvas.clipRect(0,0,getWidth(),centerY);
        }
        camera.save();
        camera.rotateX(degree);
        canvas.translate(centerX,centerY);
        camera.applyToCanvas(canvas);
        canvas.translate(-centerX,-centerY);
        camera.restore();
        canvas.drawBitmap(bitmap,x,y,paint);
        canvas.restore();

    }
}
