package com.example.jimmyyu.fortnitedroprandomizer;

import android.app.Activity;
import android.os.Bundle;
//Import widget classes
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ImageView;
//Import event handling classes
import android.view.View.OnClickListener;
import java.util.Random;

public class MainActivity extends Activity {
    //Declare reference variables for widgets
    private Button randomizeButton;
    private TextView dropTextView;
    private ImageView markerView;

    //Instance Variables
    String[] locationList = {"Dusty Divot", "Retail Row", "Pleasant Park", "Tilted Towers", "Wailing Woods", "Fatal Fields", "Shifty Shafts", "Greasy Grove", "Snobby Shores", "Haunted Hills", "Flush Factory", "Lonely Lodge", "Paradise Palms", "Risky Reels", "Tomato Town" };
    Random r = new Random();
    int randNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialize widget reference variables
        randomizeButton = findViewById(R.id.randomizeButton);
        dropTextView = findViewById(R.id.dropTextView);
        markerView = findViewById(R.id.markerView);

        //Event listeners
        OnClickListener buttonEventListener = new ButtonListener();
        randomizeButton.setOnClickListener(buttonEventListener);
    }

    class ButtonListener implements OnClickListener {
        @Override
        public void onClick(View v) {
            if (v.getId() == R.id.randomizeButton) {
                translate(markerView);
                markerView.bringToFront();
            }
        }
    }
    private void translate(View markerView){
        randNum = r.nextInt(locationList.length);
        if (locationList[randNum].equals("Dusty Divot")) {
            markerView.animate().x(620).y(525).setDuration(400).start();
            dropTextView.setText("Dusty Divot");
        }
        else if (locationList[randNum].equals("Retail Row")) {
            markerView.animate().x(785).y(535).setDuration(400).start();
            dropTextView.setText("Retail Row");
        }
        else if (locationList[randNum].equals("Pleasant Park")) {
            markerView.animate().x(285).y(275).setDuration(400).start();
            dropTextView.setText("Pleasant Park");
        }
        else if (locationList[randNum].equals("Tilted Towers")) {
            markerView.animate().x(385).y(475).setDuration(400).start();
            dropTextView.setText("Tilted Towers");
        }
        else if (locationList[randNum].equals("Wailing Woods")) {
            markerView.animate().x(857).y(300).setDuration(400).start();
            dropTextView.setText("Wailing Woods");
        }
        else if (locationList[randNum].equals("Fatal Fields")) {
            markerView.animate().x(620).y(800).setDuration(400).start();
            dropTextView.setText("Fatal Fields");
        }
        else if (locationList[randNum].equals("Shifty Shafts")) {
            markerView.animate().x(385).y(640).setDuration(400).start();
            dropTextView.setText("Shifty Shafts");
        }
        else if (locationList[randNum].equals("Greasy Grove")) {
            markerView.animate().x(230).y(645).setDuration(400).start();
            dropTextView.setText("Greasy Grove");
        }
        else if ((locationList[randNum]).equals("Snobby Shores")) {
            markerView.animate().x(80).y(450).setDuration(400).start();
            dropTextView.setText("Snobby Shores");
        }
        else if (locationList[randNum].equals("Haunted Hills")) {
            markerView.animate().x(160).y(185).setDuration(400).start();
            dropTextView.setText("Haunted Hills");
        }
        else if (locationList[randNum].equals("Flush Factory")) {
            markerView.animate().x(360).y(875).setDuration(400).start();
            dropTextView.setText("Flush Factory");
        }
        else if (locationList[randNum].equals("Lonely Lodge")) {
            markerView.animate().x(925).y(450).setDuration(400).start();
            dropTextView.setText("Lonely Lodge");
        }
        else if (locationList[randNum].equals("Paradise Palms")) {
            markerView.animate().x(850).y(750).setDuration(400).start();
            dropTextView.setText("Paradise Palms");
        }
        else if (locationList[randNum].equals("Risky Reels")) {
            markerView.animate().x(770).y(190).setDuration(400).start();
            dropTextView.setText("Risky Reels");
        }
        else if (locationList[randNum].equals("Tomato Town")) {
            markerView.animate().x(690).y(315).setDuration(400).start();
            dropTextView.setText("Tomato Town");
        }
    }
}
