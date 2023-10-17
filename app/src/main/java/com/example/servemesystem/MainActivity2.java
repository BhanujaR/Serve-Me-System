package com.example.servemesystem;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {
    private TextView login;
    private TextView newaccount;
    private TextView forgot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        login = (TextView) findViewById(R.id.login);
        login.setOnClickListener(this);

        newaccount = (TextView) findViewById(R.id.newaccount);
        newaccount.setOnClickListener(this);

        forgot = (TextView) findViewById(R.id.forgot);
        forgot.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.login:
                startActivity(new Intent(this, LoginLayoutVendor.class));
                break;
            case R.id.newaccount:
                startActivity(new Intent(this, Registeration_Vendor.class));
                break;
            case R.id.forgot:
                startActivity(new Intent(this,PaymentDetails.class));
                break;
        }
    }
}