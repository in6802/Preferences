package com.cji.edu.preferences;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ReferenceInputActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonSave;
    TextView textViewName, textViewPassword, textViewEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reference_input);

        buttonSave = findViewById(R.id.buttonSave);
        buttonSave.setOnClickListener(this);

        Bundle bundle = getIntent().getExtras();
        textViewName.setText(bundle.getString("nameKey","NO DATA"));
        textViewPassword.setText(bundle.getString("passwordKey", "NO DATA"));
        textViewEmail.setText(bundle.getString("emailKey", "NO DATA"));
    }

    @Override
    public void onClick(View v) {
        // 매개 변수 1. 저장되는 파일 이름, 2. MODE_PRIVATE 이앱에서만 사용하겠다.
        SharedPreferences.Editor editor = getSharedPreferences("Person", Context.MODE_PRIVATE).edit();
        editor.putString("nameKey", textViewName.getText().toString());
        editor.putString("passwordKey", textViewPassword.getText().toString());
        editor.putString("emailKey", textViewEmail.getText().toString());
        editor.commit();
    }

    @Override
    public void finish() {
        super.finish();
    }
}
