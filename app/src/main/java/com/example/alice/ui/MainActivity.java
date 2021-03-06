package com.example.alice.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private Bundle savedInstanceState;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout layout = new LinearLayout(this);
        super.setContentView(layout);
        layout.setOrientation(LinearLayout.VERTICAL);
        final TextView show = new TextView(this);
        Button bn = new Button(this);
        bn.setText("OK");
        bn.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT));
        layout.addView(show);
        layout.addView(bn);
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show.setText(String.format("hello %s",new Date()));
            }
        });
    }
}
