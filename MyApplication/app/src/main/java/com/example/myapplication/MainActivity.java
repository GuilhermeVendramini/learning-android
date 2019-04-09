package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // clickFunction Button example
    public void clickFunction(View view) {
        EditText nameEditText = (EditText) findViewById(R.id.nameEditText);
        EditText passEditText = (EditText) findViewById(R.id.passEditText);

        Toast.makeText(this, "Hello " + nameEditText.getText().toString(), Toast.LENGTH_SHORT).show();

        Log.i("Info", "Button pressed!");
        Log.i("Name",  nameEditText.getText().toString());
        Log.i("Password", passEditText.getText().toString());
    }

    public void changeImage(View view){

        ImageView image = (ImageView) findViewById(R.id.androidImageView);
        image.setImageResource(R.drawable.android_g);

        Log.i("Info", "Button Image change");

    }
}
