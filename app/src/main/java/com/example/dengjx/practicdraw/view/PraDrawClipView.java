package com.example.dengjx.practicdraw.view;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Camera;
import android.graphics.Canvas;
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
    ObjectAnimator animator = ObjectAnimator.ofInt(this,"degree",0,180);
    public PraDrawClipView(Context context) {
        this(context,null);
    }

    public PraDrawClipView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        paint = new Paint();
        animator.setDuration(5000);
        animator.setInterpolator(new LinearInterpolator());
        animator.setRepeatMode(ValueAnimator.REVERSE);
    }

    public void setDegree(int degree) {
        this.degree = degree;
        invalidate();
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

        int bitmapwidth = bitmap.getWidth();



        canvas.save();
        Camera camera = new Camera();
        camera.save();
        camera.rotateX(30);
        canvas.translate(bitmap.getWidth()/2 + 50,bitmap.getHeight()/2 + 50);
        camera.applyToCanvas(canvas);
        canvas.translate(-(bitmap.getWidth()/2 + 50),-(bitmap.getHeight()/2 + 50));
        camera.restore();
        canvas.drawBitmap(bitmap,50,50,paint);
        canvas.restore();
    }
}
