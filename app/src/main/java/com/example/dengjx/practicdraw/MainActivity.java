package com.example.dengjx.practicdraw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button mbtnOne;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mbtnOne = (Button) findViewById(R.id.btn_pie);
        mbtnOne.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_pie:
                startActivity(new Intent(this,PraDrawPieViewActivity.class));
                break;
        }
    }
}
