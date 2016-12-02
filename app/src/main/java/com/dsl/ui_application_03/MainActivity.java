package com.dsl.ui_application_03;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView text1;
    TextView text2;
    TextView text3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI();
    }

    /**
     * 控件初始化
     */
    public void initUI()
    {
        text1 = (TextView)findViewById(R.id.text1);
        text2 = (TextView)findViewById(R.id.text2);
        text2 = (TextView)findViewById(R.id.text3);
        MyTextlistener my = new MyTextlistener();
        text1.setOnClickListener(my);
        text2.setOnClickListener(my);
        text3.setOnClickListener(my);
    }

    /**
     * 自定义监听类，该类实现了View类
     */
    class MyTextlistener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            switch (v.getId())
            {
                case R.id.text1://改变第一行字体显示
                    text1.setText("第一行！");
                break;
                case R.id.text2://改变第二行字体显示
                    text1.setText("第二行！");
                    break;
                case R.id.text3://改变第三行字体显示
                    text1.setText("第三行！");
                    break;
            }
        }
    }

}
