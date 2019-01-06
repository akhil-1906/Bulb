package com.example.akhil.bulb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView im1,im2;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.b1);
        im1=(ImageView)findViewById(R.id.im1);
        im2=(ImageView)findViewById(R.id.im2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                im2.setVisibility(View.GONE);
                b1.setText("BULB ON");
            }
        });

    }
}
