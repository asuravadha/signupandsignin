package in.countrybaskets.signupandsignin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class webview extends AppCompatActivity {
WebView webview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);
        webview=findViewById(R.id.webview1);
        WebViewClient webViewClient=new WebViewClient();
        webview.setWebViewClient(webViewClient);
        webview.loadUrl("https://www.google.com/");
        WebSettings webSettings=webview.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}