package com.example.ex09;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    WebView wV1;
    String stringUrl;
    TextView tv1;




    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wV1= findViewById(R.id.wV1);
        tv1= findViewById(R.id.tV1);
        wV1.setWebViewClient(new MyWebViewClient());
        stringUrl="http://www.walla.co.il/";


    }

    public void go(View view) {
        wV1.loadUrl(stringUrl);
        tv1.setText (stringUrl);



    }

    private class MyWebViewClient extends WebViewClient {
        public boolean shouldOverideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }

    }
}