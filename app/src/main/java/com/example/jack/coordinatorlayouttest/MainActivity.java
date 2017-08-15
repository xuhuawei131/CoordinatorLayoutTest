package com.example.jack.coordinatorlayouttest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View view1=findViewById(R.id.btn_scorll1);
        View view2=findViewById(R.id.btn_scorll2);
        View view3=findViewById(R.id.btn_scorll3);
        View view4=findViewById(R.id.btn_scorll4);

        view1.setOnClickListener(this);
        view2.setOnClickListener(this);
        view3.setOnClickListener(this);
        view4.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent=new Intent();
        switch (v.getId()){
            case R.id.btn_scorll1:
                intent.setClass(this,ScrollingActivity.class);
                break;
            case R.id.btn_scorll2:
                intent.setClass(this,Scrolling2Activity.class);
                break;
            case R.id.btn_scorll3:
                intent.setClass(this,Scrolling3Activity.class);
                break;
            case R.id.btn_scorll4:
                intent.setClass(this,Scrolling4Activity.class);
                break;
        }
        startActivity(intent);
    }
}
