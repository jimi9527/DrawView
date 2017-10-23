package com.example.dengjx.practicdraw;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

/**
 * DrawPieView
 * Created by dengjx on 2017/9/27.
 */

public class PraDrawPieView extends View{
    private static final String TAG = "PraDrawPieView" ;
    Paint paint;

    public PraDrawPieView(Context context) {
        this(context,null);
    }

    public PraDrawPieView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        paint = new Paint();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        paint.setColor(Color.GREEN);
        canvas.drawArc(100,100,560,560,0f,60f,true,paint);
        float mFirstArcX = (float) (100 + 230 + 230 * Math.cos(Math.PI/6));
        float mFistArcY = (float) (100 + 230 + 230 * Math.sin(Math.PI/6));

        drawLine(canvas,mFirstArcX,mFistArcY);
        Log.d(TAG,"Math.cos(3/Math.PI):"+Math.cos(Math.PI/6));
        Log.d(TAG,"Math.sin(3/Math.PI):"+Math.sin(Math.PI/6));
        Log.d(TAG,"mFirstArcX:"+mFirstArcX);
        Log.d(TAG,"mFistArcY:"+mFistArcY);

        paint.setColor(Color.BLUE);
        canvas.drawArc(100,100,560,560,60f,120f,true,paint);

        float mTwoArcX = (float) (100 + 230 - 230*Math.sin(Math.PI/6));
        float mTwoArcY = (float) (100 + 230 + 230 * Math.cos(Math.PI/6));
        drawtwoLine(canvas,mTwoArcX,mTwoArcY);

        paint.setColor(Color.RED);
        canvas.drawArc(100,100,500,500,180f,100f,true,paint);

        float mThreeArcX = (float) (100 + 230 - 230*Math.cos(Math.PI*5/18)-10);
        float mThreeArcY = (float) (100 + 230 -230 * Math.sin(Math.PI*5/18)-10);
        drawThreeLine(canvas,mThreeArcX,mThreeArcY);

        paint.setColor(Color.YELLOW);
        canvas.drawArc(100,100,560,560,280f,60f,true,paint);

        paint.setColor(Color.BLACK);
        canvas.drawArc(100,100,560,560,330f,30f,true,paint);

    }

    // 画指引线
    public void drawLine(Canvas canvas , float startx ,float starty ){
        Paint paint = new Paint();
        paint.setColor(Color.GRAY);
        paint.setStrokeWidth(3);
        canvas.drawLine(startx,starty,startx+20,starty+20,paint);
        canvas.drawLine(startx+20,starty+20,startx+100,starty+20,paint);
        paint.setTextSize(20);
        canvas.drawText("basketball",startx+105,starty+30,paint);
    }
    // 画指引线
    public void drawtwoLine(Canvas canvas , float startx ,float starty ){
        Paint paint = new Paint();
        paint.setColor(Color.GRAY);
        paint.setStrokeWidth(3);
        canvas.drawLine(startx,starty,startx-20,starty+20,paint);
        canvas.drawLine(startx-20,starty+20,startx-100,starty+20,paint);
        paint.setTextSize(20);
        canvas.drawText("tennis",startx-160,starty+30,paint);
    }
    // 画指引线
    public void drawThreeLine(Canvas canvas , float startx ,float starty ){
        Paint paint = new Paint();
        paint.setColor(Color.GRAY);
        paint.setStrokeWidth(3);
        canvas.drawLine(startx,starty,startx-20,starty-20,paint);
        canvas.drawLine(startx-20,starty-20,startx-100,starty-20,paint);
        paint.setTextSize(20);
        canvas.drawText("ping",startx-160,starty-60,paint);
    }
}
