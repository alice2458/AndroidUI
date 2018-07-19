package com.example.alice.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {
    @SuppressWarnings("deprecation")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout layout = new LinearLayout(this);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.FILL_PARENT,
                ViewGroup.LayoutParams.FILL_PARENT
        );
        layout.setOrientation(LinearLayout.VERTICAL);
        LinearLayout.LayoutParams txtParam = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.FILL_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        TextView txt = new TextView(this);
        txt.setLayoutParams(txtParam);
        txt.setTextSize(20);
        layout.addView(txt,txtParam);
        txt.setText("Large Team,要一直走到世界尽头。");
        super.setContentView(layout,params);
    }
}
