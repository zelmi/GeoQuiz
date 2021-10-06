package com.bignerdranch.android.geoquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

//    the m prefix is an Android naming convention
    private Button mTrueButton;
    private Button mFalseButton;

    //    The onCreate(Bundle) method is called when an instance of the activity subclass is created
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        When an activity is created, it needs a UI to manage. To get the activity its UI, you
//        call the following Activity method
        setContentView(R.layout.activity_main);
//        that setContentView method inflates a layout and puts it on screen. When a layout is inflated,
//        each widget in the layout file is instantiated as defined by its attributes. You specify which
//        layout to inflate by passing in the layout’s resource ID

        mTrueButton = (Button) findViewById(R.id.true_button);
//        below code is listener for true button
        mTrueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                this refers to the View.OnClickListener
                Toast.makeText(MainActivity.this, R.string.correct_toast, Toast.LENGTH_SHORT).show();
            }
        });
        mFalseButton = (Button) findViewById(R.id.false_button);
        mFalseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, R.string.incorrect_toast, Toast.LENGTH_SHORT).show();
            }
        });
    }
}