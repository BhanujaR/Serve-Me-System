package com.example.servemesystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Registration_Customer extends AppCompatActivity implements View.OnClickListener {
    private TextView cust_register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_customer);

        cust_register = (TextView) findViewById(R.id.cust_register);
        cust_register.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.cust_register:
                startActivity(new Intent(this, MainActivity.class));
                break;
        }
    }
}