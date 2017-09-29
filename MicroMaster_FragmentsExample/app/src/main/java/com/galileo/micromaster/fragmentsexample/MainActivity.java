package com.galileo.micromaster.fragmentsexample;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.R.attr.fragment;
import static android.os.Build.VERSION_CODES.M;

public class MainActivity extends AppCompatActivity {

    public boolean show_frag1 = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirstFragment fragment = new FirstFragment();
        getSupportFragmentManager().beginTransaction()
                .add(R.id.fragment_container, fragment).commit();
    }

    public void changeFragment(View view) {
        Fragment fragment;
        Button button = (Button)findViewById(view.getId());
        if(!show_frag1){
            fragment = new SecondFragment();
            button.setText(R.string.show_first_fragment);
        }else {
            fragment = new FirstFragment();
            button.setText(R.string.show_second_fragment);
        }
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, fragment).commit();
        show_frag1 = !show_frag1;
    }
}
