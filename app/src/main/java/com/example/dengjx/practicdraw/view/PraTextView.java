package com.example.dengjx.practicdraw.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by dengjx on 2017/10/31.
 */

public class PraTextView extends TextView{
    public PraTextView(Context context) {
        this(context,null);
    }

    public PraTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawColor(Color.RED);
        super.onDraw(canvas);
    }
}
