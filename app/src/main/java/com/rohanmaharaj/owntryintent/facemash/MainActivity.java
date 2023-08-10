package com.rohanmaharaj.owntryintent.facemash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String keyValueName = "rohanismyname";
    public static final String keyValueHouseName = "shivalikismyhouse";
    EditText nameUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameUser = findViewById(R.id.nameinp);
    }

    public void submitted(View view) {
        Toast.makeText(this, "Opening Account...", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, accountpage.class);
        String nameofUser = nameUser.getText().toString();
        intent.putExtra(keyValueName, nameofUser);
        startActivity(intent);
    }
}