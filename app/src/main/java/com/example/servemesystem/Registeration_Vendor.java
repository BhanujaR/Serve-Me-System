package com.example.servemesystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Registeration_Vendor extends AppCompatActivity implements View.OnClickListener {
    private TextView vend_register;
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registeration_vendor);

        vend_register = (TextView) findViewById(R.id.vend_register);
        vend_register.setOnClickListener(this);

        spinner = findViewById(R.id.vend_spinner);

        List<String> categories = new ArrayList<>();
        categories.add(0,"Choose a Service");
        categories.add("Plumbing");
        categories.add("Beauty Services");
        categories.add("Electrical");
        categories.add("Charter Accountants");
        categories.add("Tutoring");
        categories.add("Computer Repair");

        ArrayAdapter<String> dataAdapter;
        dataAdapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item,categories);

        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(dataAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (parent.getItemAtPosition(position).equals("Choose a Service"))
                {

                }
                else
                {
                    String item = parent.getItemAtPosition(position).toString();

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                
            }
        });
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.vend_register:
                startActivity(new Intent(this, MainActivity2.class));
                break;
        }
    }
}