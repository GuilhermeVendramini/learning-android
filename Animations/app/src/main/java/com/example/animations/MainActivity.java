package com.example.animations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    boolean aImageShow = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView aImageView = findViewById(R.id.aImageView);
        aImageView.setX(-1000);
        aImageView.animate().translationXBy(1000).setDuration(2000);
    }

    public void fade(View view) {
        Log.i("Info", "Image fade.");
        ImageView aImageView = findViewById(R.id.aImageView);
        ImageView bImageView = findViewById(R.id.bImageView);

        if(aImageShow) {
            aImageShow = false;
            bImageView.animate().rotation(360).setDuration(2000);
            aImageView.animate().rotation(360).setDuration(2000);
            aImageView.animate().alpha(0).setDuration(2000);
            bImageView.animate().alpha(1).setDuration(2000);
        } else {
            aImageShow = true;
            aImageView.animate().rotation(0).setDuration(2000);
            bImageView.animate().rotation(0).setDuration(2000);
            bImageView.animate().alpha(0).setDuration(2000);
            aImageView.animate().alpha(1).setDuration(2000);
        }
    }
}
