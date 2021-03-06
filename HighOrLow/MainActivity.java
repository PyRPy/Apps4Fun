package com.example.highorlow;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randomNumber;

    public void guessFunction(View view) {

        EditText editText = (EditText) findViewById(R.id.editTextNumber);
        TextView textViewHint = findViewById(R.id.textView4);

        int guessValue = Integer.parseInt(editText.getText().toString());
        String message;
        if (guessValue > randomNumber) {
            message = "lower";
        } else if (guessValue < randomNumber) {
            message = "higher";
        } else {
            message = "You got it!";
        }

        textViewHint.setText(message);

        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

        Log.i("entered values", editText.getText().toString());
        Log.i("info", Integer.toString(randomNumber));
        Log.i("your guess is: ", message);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // where you create a random number
        Random rand = new Random();
        randomNumber = rand.nextInt(20) + 1;
    }
}