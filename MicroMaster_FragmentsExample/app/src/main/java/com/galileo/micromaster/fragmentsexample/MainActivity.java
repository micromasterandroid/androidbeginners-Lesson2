package com.galileo.micromaster.fragmentsexample;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.R.attr.fragment;
import static android.os.Build.VERSION_CODES.M;

public class MainActivity extends AppCompatActivity {

    //variable used to change the behavior of the button
    public boolean show_frag1 = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirstFragment fragment = new FirstFragment();
        //fragment transaction, adds the first fragment to the activity
        getSupportFragmentManager().beginTransaction()
                .add(R.id.fragment_container, fragment).commit();
    }

    //button onclick method
    public void changeFragment(View view) {
        //declares the fragment that will be shown
        Fragment fragment;
        //finds the button to change the label
        Button button = (Button)findViewById(view.getId());
        //decides if we have to show the first or the second fragment
        //then creates the fragment and changes the button label
        if(!show_frag1){
            fragment = new SecondFragment();
            button.setText(R.string.show_first_fragment);
        }else {
            fragment = new FirstFragment();
            button.setText(R.string.show_second_fragment);
        }
        //replaces the fragment being shown
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, fragment).commit();
        //then changes the condition variable
        show_frag1 = !show_frag1;
    }
}
