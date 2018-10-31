package com.cji.edu.preferences;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonSharedPut, buttonSharedGet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonSharedPut = findViewById(R.id.buttonSharedPut);
        buttonSharedPut.setOnClickListener(this);

        buttonSharedGet = findViewById(R.id.buttonSharedGet);
        buttonSharedGet.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        EditText editTextName = findViewById(R.id.editTextName);
        EditText editTextPassword = findViewById(R.id.editTextPassword);
        EditText editTextEmail = findViewById(R.id.editTextEmail);

        Bundle bundle = new Bundle();
        bundle.putString("nameKey", editTextName.getText().toString());
        bundle.putString("passwordKey", editTextPassword.getText().toString());
        bundle.putString("emailKey", editTextEmail.getText().toString());

        Intent intent = new Intent(this, ReferenceInputActivity.class);
        intent.putExtras(bundle);

        startActivityForResult(intent, Activity.RESULT_FIRST_USER);
    }
}
