package com.example.animate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    boolean figure1IsShowing = true;

    public void fadeFunction(View view) {

        Log.i("Info", "image tapped");
        ImageView figure1ImageView = (ImageView) findViewById(R.id.figure1ImageView);


        ImageView figure2ImageView = (ImageView) findViewById(R.id.figure2ImageView);


        if (figure1IsShowing) {

            figure1IsShowing = false;

            figure1ImageView.animate().alpha(0).setDuration(2000);

            figure2ImageView.animate().alpha(1).setDuration(2000);

        } else {

            figure1IsShowing = true;

            figure1ImageView.animate().alpha(1).setDuration(2000);

            figure2ImageView.animate().alpha(0).setDuration(2000);

        }
    }
        @Override
        protected void onCreate (Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }
}
