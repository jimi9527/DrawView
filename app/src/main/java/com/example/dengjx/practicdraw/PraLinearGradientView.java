package com.example.dengjx.practicdraw;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * LinearGradientView
 * Created by dengjx on 2017/9/28.
 */

public class PraLinearGradientView extends View {
    Paint paint;

    public PraLinearGradientView(Context context) {
        this(context,null);
    }

    public PraLinearGradientView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        paint = new Paint();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    /*    Shader shader = new LinearGradient(100,100,500,500,Color.parseColor("#E91E63"),
                Color.parseColor("#2196F3"),Shader.TileMode.CLAMP);

        Shader shaderRadial = new RadialGradient(300,300,200,Color.parseColor("#E91E63"),
                Color.parseColor("#2196F3"),Shader.TileMode.CLAMP);

        Shader shaderSweep = new SweepGradient(300,300,Color.parseColor("#E91E63"),
                Color.parseColor("#2196F3"));*/

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.batman_logo);
        Shader shaderBitmap = new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);

        Bitmap bitmapIcon = BitmapFactory.decodeResource(getResources(),R.drawable.batman);
        Shader shaderIcon = new BitmapShader(bitmapIcon,Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);

         Shader shader = new ComposeShader(shaderIcon,shaderBitmap, PorterDuff.Mode.SRC_OUT);

         paint.setShader(shader);
        canvas.drawCircle(300,300,300,paint);
    }
}
