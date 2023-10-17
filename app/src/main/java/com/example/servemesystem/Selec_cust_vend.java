package com.example.servemesystem;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Selec_cust_vend extends AppCompatActivity implements View.OnClickListener {
    ImageButton customer_icon;
    ImageButton vendor_icon;
    Button clickhere;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selec_cust_vend);

        customer_icon = (ImageButton) findViewById(R.id.cust_icon);
        customer_icon.setOnClickListener(this);

        vendor_icon = (ImageButton) findViewById(R.id.vend_icon);
        vendor_icon.setOnClickListener(this);

        clickhere = (Button) findViewById(R.id.clickhere);
        clickhere.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.cust_icon:
                startActivity(new Intent(this, MainActivity.class));
                break;
            case R.id.vend_icon:
                startActivity(new Intent(this, MainActivity2.class));
                break;
            case R.id.clickhere:
                startActivity(new Intent(this,NoRegCustUI.class));
        }
    }
}