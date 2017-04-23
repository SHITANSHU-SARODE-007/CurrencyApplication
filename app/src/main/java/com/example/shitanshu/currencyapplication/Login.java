package com.example.shitanshu.currencyapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by shitanshu on 3/22/2017.
 */

public class Login extends AppCompatActivity {

    private EditText username = null;
    private EditText password = null;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = (EditText)findViewById(R.id.editText1);
        password = (EditText)findViewById(R.id.editText2);
        login = (Button)findViewById(R.id.button1);

    }

    public void login(View view){
        if(username.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
            Toast.makeText(getApplicationContext(), "Redirecting...", Toast.LENGTH_SHORT).show();
            //intent code block
            Intent lIntent = new Intent();
            lIntent.setClass(this, MainActivity.class);
            startActivity(lIntent);
            finish();
        }

        else{
            Toast.makeText(getApplicationContext(), "Wrong Credentials",Toast.LENGTH_SHORT).show();
        }
    }

}

