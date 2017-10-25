package com.example.dengjx.practicdraw.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by dengjx on 2017/10/25.
 */

public class PraDrawTextView extends View {
    Paint paint;

    public PraDrawTextView(Context context) {
        this(context,null);
    }

    public PraDrawTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        paint = new Paint();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        String text = "Hello HenCoder";
        paint.setTextSize(30);
        paint.setTypeface(Typeface.DEFAULT);
        canvas.drawText(text,200,200,paint);
        paint.setTypeface(Typeface.SERIF);
        canvas.drawText(text,200,300,paint);

        String text1 = "三个月内你胖了";
        String text2 = "4.5";
        String text3 = "公斤";
        Paint paint1 = new Paint();
        paint1.setTextSize(30);
        paint1.setColor(Color.BLACK);
        canvas.drawText(text1,200,400,paint1);
        Paint paint2 = new Paint();
        paint2.setColor(Color.RED);
        paint2.setTextSize(40);
        canvas.drawText(text2,200+paint1.measureText(text1),400,paint2);
        canvas.drawText(text3,200+paint1.measureText(text1)+paint2.measureText(text2),400,paint1);

        Paint paint4 = new Paint();
        paint4.setTextSize(50);
        paint4.setColor(Color.BLACK);
        canvas.drawText(text,200,500,paint4);
        Rect rect = new Rect();
        paint4.getTextBounds(text,0,text.length(),rect);
        rect.left += 200;
        rect.top = (int) (paint4.getFontMetrics().ascent +500);
        rect.right += 200;
        rect.bottom += 500;
        paint.setStrokeWidth(5);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.RED);
        canvas.drawRect(rect,paint);


    }
}
