package com.example.servemesystem;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Review_Ratings extends AppCompatActivity implements View.OnClickListener {

    private TextView send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review_ratings);

        send = (TextView) findViewById(R.id.sendFeed);
        send.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.sendFeed:
                startActivity(new Intent(this, Selec_cust_vend.class));
                break;
        }
    }
}