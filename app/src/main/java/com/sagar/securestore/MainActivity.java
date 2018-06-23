package com.sagar.securestore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

KeyHandler keyHandler = new KeyHandler();//Bridge between C++ and Java

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = (TextView) findViewById(R.id.sample_text);
        tv.setText("Fabric Key: "+keyHandler.getFabricKey()+"\n\nFirebase Key: "+keyHandler.getFirebaseKey()+"\n\nYoutube Key: "+keyHandler.getYoutubeKey());
    }
}
