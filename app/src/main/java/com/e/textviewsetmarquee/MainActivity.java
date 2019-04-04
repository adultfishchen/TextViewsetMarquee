package com.e.textviewsetmarquee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView2=(TextView)findViewById(R.id.textView2);
        textView2.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        textView2.setSingleLine(true);
        textView2.setFocusable(true);
        textView2.setFocusableInTouchMode(true);
        textView2.setMarqueeRepeatLimit(-1);
        textView2.setSelected(true);
        textView2.setText("跑馬燈顯示的文字，須為超出範圍的較長字串~");

    }
}
