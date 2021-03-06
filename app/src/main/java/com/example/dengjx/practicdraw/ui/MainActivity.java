package com.example.dengjx.practicdraw.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.dengjx.practicdraw.R;
import com.example.dengjx.practicdraw.view.PraDrawClipView;
import com.example.dengjx.practicdraw.view.PraDrawTextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button mbtnOne,mBtnTwo,mBtnThree,mBtnFour,mBtnFive,mBtnSix;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mbtnOne = (Button) findViewById(R.id.btn_pie);
        mBtnTwo = (Button) findViewById(R.id.btn_two);
        mBtnThree = (Button) findViewById(R.id.btn_three);
        mBtnFour = (Button) findViewById(R.id.btn_four);
        mBtnFive = (Button) findViewById(R.id.btn_five);
        mBtnSix = (Button) findViewById(R.id.btn_six);

        mbtnOne.setOnClickListener(this);
        mBtnTwo.setOnClickListener(this);
        mBtnThree.setOnClickListener(this);
        mBtnFour.setOnClickListener(this);
        mBtnFive.setOnClickListener(this);
        mBtnSix.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_pie:
                startActivity(new Intent(this,PraDrawPieViewActivity.class));
                break;
            case R.id.btn_two:
                startActivity(new Intent(this,PraDrawTwoActivity.class));
                break;
            case R.id.btn_three:
                startActivity(new Intent(this,PraDrawTextActivity.class));
                break;
            case R.id.btn_four:
                startActivity(new Intent(this,PraDrawClipActivity.class));
                break;
            case R.id.btn_five:
                startActivity(new Intent(this,PraDrawFIveActivity.class));
                break;
            case R.id.btn_six:
                startActivity(new Intent(this,PraAnimaActivity.class));
                break;
        }
    }
}
