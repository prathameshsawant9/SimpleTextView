package com.leo.simpletv.ex;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.leo.simpletextview.SimpleTextView;

public class MainActivity extends AppCompatActivity {

    SimpleTextView mExample_1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mExample_1 = (SimpleTextView) findViewById(R.id.tv_colorexample);
        mExample_1.setFont("pacifico.ttf");

        // Some more Handy Methods
        // mExample_1.setLinearGradient(Color.RED,Color.BLUE,SimpleTextView.LG_HORIZONTAL);
        // mExample_1.setHtmlText(getResources().getString(R.string.sample_htmltext));
    }
}
