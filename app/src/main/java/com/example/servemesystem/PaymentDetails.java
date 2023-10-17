package com.example.servemesystem;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PaymentDetails extends AppCompatActivity implements View.OnClickListener {

    private TextView make_payment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_details);

        make_payment = (TextView) findViewById(R.id.make_pay);
        make_payment.setOnClickListener(this);

    }
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.make_pay:
                startActivity(new Intent(this, Review_Ratings.class));
                break;
        }
    }
}