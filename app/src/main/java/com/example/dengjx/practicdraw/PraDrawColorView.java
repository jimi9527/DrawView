package com.example.dengjx.practicdraw;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * drawColor
 * Created by dengjx on 2017/9/27.
 */

public class PraDrawColorView  extends View{
    public PraDrawColorView(Context context) {
        this(context,null);
    }

    public PraDrawColorView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(Color.YELLOW);
    }
}
