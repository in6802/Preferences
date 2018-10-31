package com.cji.edu.preferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ReferenceGetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reference_get);

        TextView textViewGetRef = findViewById(R.id.textViewGetReference);

        SharedPreferences sharedPreferences = getSharedPreferences("Person", Context.MODE_PRIVATE);
        String nameKey = sharedPreferences.getString("nameKey", "NO DATA");
        String passwordKey = sharedPreferences.getString("passwordKey", "NO DATA");
        String emailKey = sharedPreferences.getString("emailKey", "NO DATA");

        String text = nameKey + passwordKey + emailKey;
        textViewGetRef.setText(text);

    }
}
