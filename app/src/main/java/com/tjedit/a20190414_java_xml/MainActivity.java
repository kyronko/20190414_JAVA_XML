package com.tjedit.a20190414_java_xml;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView contentTextView;
    EditText inputEditText;
    Button okBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("메인-onCreate 테스트", "정말 실행되나?");
        Log.e("메인-e로그", "어떻게 나오나?");

        contentTextView = findViewById(R.id.contentTextView);
        inputEditText = findViewById(R.id.inputEditText);
        okBtn=findViewById(R.id.okBtn);

    }
}
