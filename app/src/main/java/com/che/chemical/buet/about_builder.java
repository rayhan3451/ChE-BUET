package com.che.chemical.buet;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class about_builder extends FragmentActivity {
    private WebView webView420;
    String buildertext="<h2><b><strong><center>Mohammad Rayhan</center></strong></b></h2>"+

            "<center><p>I am glad to make this app for Department of Chemical Engineering .\n" +
            "You are the most brilliant student in Bangladesh without any doubt.\n" +
            "If you use my application and it is helpful for you then this would\n" +
            " be a great achievement for me .This is my first Android App .\n" +
            " So please forgive me if I make any mistake.If you like the App then Please" +
            " pray for me so that i can make more better app like this in future.Thank you.</p></center><br>"+

            "<center><h3><b><u>For Contact</u></b></h3></center>"+
            "<p><b>Email</b><br>md.rayhan3451@gmail.com\n</p><br>"+

            "<p><b>Fb Page</b><br>Bundle of ERROR\n</p><br>"+

            "<p><b>Fb Page Link</b><br>https://www.facebook.com/pythonclass/\n</p><br>"+

            "<center><h3><b><u>Information Provider</u></b></h3></center>"+
            "<p><b>\n" +
            "Hasanuzzaman Rafin</b><br>Batch: Chemical 17\n</p><br><br>"+

            "<p><em>[ if you like this App, give a Rating in Play Store so that people can easily find the App in Google Play Store ] </em></p><br><br>";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_builder);
        webView420 = (WebView) findViewById(R.id.dollar_circle_web);
        webView420.loadDataWithBaseURL(null,buildertext,"text/html","utf-8",null);
    }
}
