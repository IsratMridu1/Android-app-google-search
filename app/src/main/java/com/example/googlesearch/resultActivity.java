package com.example.googlesearch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class resultActivity extends AppCompatActivity {
    private WebView webViewId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        webViewId = findViewById(R.id.webViewId);
        WebSettings webSettings = webViewId.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webViewId.setWebViewClient(new WebViewClient());
        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
                webViewId.loadUrl("https://www.google.com/search?q="+bundle.getString("stringValue"));
        }
    }
}