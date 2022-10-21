package com.example.icono;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView t;
    private Button facebook;
    private String https;
    String _url = "https://es-la.facebook.com/";
    private TextView T;
    private Button instagram;
    String _urlin = "https://www.instagram.com/";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Typeface robotoLight = Typeface.createFromAsset(getAssets(), "font/RobotoLight.tff");
        t = findViewById(R.id.facebook);
        t.setTypeface(robotoLight);

        facebook = findViewById(R.id.facebook);
        facebook.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
               Uri _link = Uri.parse(_url);
                Intent i = new Intent(Intent.ACTION_VIEW,_link);
                startActivity(i);

                //Log.d("Click", "Ok");
            }
        });

        Typeface robotolight = Typeface.createFromAsset(getAssets(), "font/RobotoLight.tff");
        t = findViewById(R.id.instagram);
        t.setTypeface(robotoLight);

        facebook = findViewById(R.id.instagram);
        facebook.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                Uri _link = Uri.parse(_urlin);
                Intent x = new Intent(Intent.ACTION_VIEW,_link);
                startActivity(x);


            }
        });


    }
}