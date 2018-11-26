package com.mahindracomviva.helloworld;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button english = findViewById(R.id.english);
        english.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ApplicationUtil.setLanguage("en");
                LocaleManager.setLocale(MainActivity.this);
                recreate();
            }
        });

        Button hindi = findViewById(R.id.hindi);
        hindi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ApplicationUtil.setLanguage("hi");
                LocaleManager.setLocale(MainActivity.this);
                recreate();
            }
        });
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(LocaleManager.setLocale(base));
    }
}
