package com.beginner.micromaster.contactlist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView contactName = (TextView) findViewById(R.id.contact_name);
        TextView contactLastName = (TextView) findViewById(R.id.contact_last_name);
        TextView contactEmail = (TextView) findViewById(R.id.textViewEmail);
        TextView contactPhoneNumber = (TextView) findViewById(R.id.textViewPhoneNumber);

        Bundle b = new Bundle();
        b = getIntent().getExtras();

        String name = b.getString("name");
        String lastName = b.getString("lastName");
        String email = b.getString("email");
        int phoneNumber = b.getInt("phoneNumber");

        contactName.setText(name);
        contactLastName.setText(lastName);
        contactEmail.setText(email);
        contactPhoneNumber.setText(phoneNumber+"");

    }
}
