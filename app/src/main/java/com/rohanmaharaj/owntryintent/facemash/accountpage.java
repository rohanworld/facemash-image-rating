package com.rohanmaharaj.owntryintent.facemash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class accountpage extends AppCompatActivity {
    TextView tvThis;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accountpage);
        tvThis = findViewById(R.id.usernamehere);
        Intent intu = getIntent();
        String usernaam = intu.getStringExtra(MainActivity.keyValueName);
        tvThis.setText("Hey "+usernaam+", ");
    }
}