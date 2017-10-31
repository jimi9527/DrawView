package com.example.dengjx.practicdraw.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/**
 * Created by dengjx on 2017/10/31.
 */

public class PraSpottedLinearView extends LinearLayout {
    public PraSpottedLinearView(Context context) {
        this(context,null);
    }

    public PraSpottedLinearView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);

        Paint paint = new Paint();
        paint.setColor(Color.RED);

        canvas.drawCircle(50,80,10,paint);
        canvas.drawCircle(100,70,30,paint);
        canvas.drawCircle(60,160,30,paint);
        canvas.drawCircle(80,200,30,paint);
    }
}
