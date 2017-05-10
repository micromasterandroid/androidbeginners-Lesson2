package micromaster.beginner.com.addingviewsprogrammatically;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private int contTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contTextView = 0;

        final LinearLayout linearLayoutList = (LinearLayout) findViewById(R.id.linear_layout_list);
        final Button button = (Button) findViewById(R.id.button_add);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                changeBackgroundColor(linearLayoutList);
                addNewTextView(linearLayoutList);
            }
        });
    }

    private void changeBackgroundColor(LinearLayout linearLayout) {
        Random rnd = new Random();
        int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
        linearLayout.setBackgroundColor(color);
    }

    private void addNewTextView(LinearLayout linearLayout) {
        TextView textView = new TextView(this);
        textView.setText("Text View" + contTextView++);
        textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);
        linearLayout.addView(textView);
    }
}
