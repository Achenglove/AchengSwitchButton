package com.ccr.achengswitchbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.ccr.switchbuttonlibrary.ASwitchButton;

public class MainActivity extends AppCompatActivity {
    ASwitchButton aSwitchButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        aSwitchButton=(ASwitchButton) findViewById(R.id.checkbox);
        aSwitchButton.setOnCheckedChangeListener(new ASwitchButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(ASwitchButton view, boolean isChecked) {
                if(isChecked){
                    Toast.makeText(MainActivity.this,"打开",Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(MainActivity.this,"关闭",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
