package com.taskManagement;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText email, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email = (EditText) findViewById(R.id.editText_Email);
        password = (EditText) findViewById(R.id.editText_Password);
    }

    public void logIn(View view){
        Intent intent = new Intent(this, ListActivity.class);
        String messageEmail = email.getText().toString();
        intent.putExtra("messageEmail", messageEmail);
        startActivity(intent);
    }
}