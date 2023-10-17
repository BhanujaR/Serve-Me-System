package com.example.servemesystem;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView login;
    private TextView newaccount;
    private TextView forgot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference();
        // Read from the database
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                System.out.println(dataSnapshot.getChildrenCount());
                //Log.d(TAG, "Value is: " + value);
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                //Log.w(TAG, "Failed to read value.", error.toException());
            }
        });
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
                startActivity(new Intent(this, Cust_Navigation.class));
                break;
            case R.id.newaccount:
                startActivity(new Intent(this, Registration_Customer.class));
                break;
            case R.id.forgot:
                startActivity(new Intent(this,ForgotPassword.class));
                break;
        }
    }
}