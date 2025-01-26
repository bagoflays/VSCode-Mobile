package com.bagoflays.codemobile;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.PersistableBundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.Toast;
import android.widget.LinearLayout;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView web = findViewById(R.id.daWeb);
        web.setWebChromeClient(new WebChromeClient());
        web.loadUrl("file:///android_asset/index.html");
        web.getSettings().setJavaScriptEnabled(true);
        web.getSettings().setAllowFileAccess(true);
        web.getSettings().setAllowContentAccess(true);
        web.getSettings().setDomStorageEnabled(true);
        Toast.makeText(this,"Welcome to the Visual Studio Code mobile unofficial port",Toast.LENGTH_LONG).show();
    }
}