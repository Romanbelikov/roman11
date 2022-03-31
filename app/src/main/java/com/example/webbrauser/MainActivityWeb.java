package com.example.webbrauser;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivityWeb extends AppCompatActivity {

    private WebView WebView;




    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_web);
        WebView = findViewById(R.id.WebView);
        WebView.getSettings().setJavaScriptEnabled(true);
        WebView.loadUrl("https://www.youtube.com/");
        WebView.setWebViewClient(new WebViewClient());
    }
    public void onBackPressed(){
    if(WebView.canGoBack()){
        WebView.canGoBack();
    }
    else {
        super.onBackPressed();
    }
}
}