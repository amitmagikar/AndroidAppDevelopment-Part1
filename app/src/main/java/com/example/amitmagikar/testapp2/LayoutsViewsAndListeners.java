package com.example.amitmagikar.testapp2;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class LayoutsViewsAndListeners extends AppCompatActivity {

    LinearLayout background;
    Button buttonRed, buttonBlue;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layouts_views_and_listeners);

        background = (LinearLayout) findViewById(R.id.background);
        buttonRed = (Button) findViewById(R.id.buttonRed);
        buttonBlue = (Button) findViewById(R.id.buttonBlue);
        textView = (TextView) findViewById(R.id.textView);


        buttonRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                background.setBackgroundColor(Color.RED);
                textView.setTextColor(Color.WHITE);
            }
        });

        buttonBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                background.setBackgroundColor(Color.BLUE);
                textView.setTextColor(Color.WHITE);

            }
        });
    }


}
