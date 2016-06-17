package com.puri.showphotofromurl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView im = (ImageView)findViewById(R.id.imageView);

        Picasso.with(getApplicationContext())
                .load("http://202.44.12.172/upload/images/file.jpg")
                .resize(1000, 1000)
                .centerCrop()
                .into(im);

        assert im != null;
        im.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"eieieiei",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
