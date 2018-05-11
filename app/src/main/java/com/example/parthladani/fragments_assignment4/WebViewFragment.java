package com.example.parthladani.fragments_assignment4;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;


public class WebViewFragment extends android.app.Fragment {

    public String value;

    public WebViewFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_web_view, container, false);

        value = getArguments().getString("a");

        Toast.makeText(getContext(),"Wait for Wikipedia to launch!", Toast.LENGTH_LONG).show();
        WebView webView = (WebView) view.findViewById(R.id.webView);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.wikipedia.org/wiki/"+value);

        return view;
    }

}
