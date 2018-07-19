package com.example.alice.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FrameLayout layout = new FrameLayout(this);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(
                ViewGroup.LayoutParams.FILL_PARENT,
                ViewGroup.LayoutParams.FILL_PARENT
        );
        FrameLayout.LayoutParams viewPara = new FrameLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
        );
        ImageView img = new ImageView(this);
        img.setImageResource(R.drawable.bg2);
        EditText edit = new EditText(this);
        edit.setText("Large Team");
        Button btn = new Button(this);
        btn.setText("UI");
        layout.addView(img,viewPara);
        layout.addView(edit,viewPara);
        layout.addView(btn,viewPara);
        setContentView(layout,layoutParams);
    }
}
