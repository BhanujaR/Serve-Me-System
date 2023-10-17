package com.example.servemesystem;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginLayoutVendor extends AppCompatActivity{

    private int neword;
    Button inc;
    TextView tx1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_layout_vendor);

         inc = (Button) findViewById(R.id.VendClick);
         tx1 = (TextView) findViewById(R.id.neworder);

         inc.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 neword++;
                 tx1.setText(Integer.toString(neword));
             }
         });
    }
}