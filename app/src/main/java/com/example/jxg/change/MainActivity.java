package com.example.jxg.change;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btn = (Button) findViewById(R.id.button1);
        btn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                jump2ok();
            }
        });
    }

    //跳到ok页面
    public void jump2ok() {
        setContentView(R.layout.seound);
        //当有按键按下跳到main页面
        Button btn = (Button) findViewById(R.id.button1);
        btn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                jump2main();
            }
        });
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            setContentView(R.layout.activity_main);
        }
        return false;
    }

    //跳到main页面
    public void jump2main() {
        setContentView(R.layout.activity_main);
        //当有按键按下跳到ok页面
        Button btn = (Button) findViewById(R.id.button1);
        btn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                jump2ok();
            }
        });
    }
}
