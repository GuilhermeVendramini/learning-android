package com.example.convertmoney;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convertMoney(View view) {
        Log.i("Log", "Convert money button");

        EditText moneyEditText = (EditText) findViewById(R.id.moneyEditText);

        String amountInPounds = moneyEditText.getText().toString();

        double amountInPoundsDouble = Double.parseDouble(amountInPounds);
        double amountInDollarsDouble = amountInPoundsDouble * 1.3;

        // String amountInDollars = Double.toString(amountInDollarsDouble);
        String amountInDollars = String.format("%.2f", amountInDollarsDouble);

        Toast.makeText(this, "Result:  " + amountInDollars + " dollars", Toast.LENGTH_SHORT).show();
    }
}
