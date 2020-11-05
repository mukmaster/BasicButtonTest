package de.planetmuk.android.basicbuttontest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonEventHandler(View v) {
        TextView display = findViewById(R.id.displayTextView);
        if (v == findViewById(R.id.topButton))
            display.setText("Button 1");
        else if (v == findViewById(R.id.bottomButton))
            display.setText("Button 2");
        else
            display.setText("???");
    }
}