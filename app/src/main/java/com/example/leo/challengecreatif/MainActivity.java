package com.example.leo.challengecreatif;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import com.example.leo.challengecreatif.model.Bubble;
import com.example.leo.challengecreatif.model.Map;
import com.example.leo.challengecreatif.model.Notification;
import com.example.leo.challengecreatif.model.User;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    List<Bubble> listOfBubble = new ArrayList<Bubble>();
    List<Notification> listOfNotification = new ArrayList<Notification>();
    User user = new User();
    Map map = new Map();


    /**
     * When the activity is opened for the first time
     * - make a request to the server for the JSON objects
     * - fill the listOfBubble with corresponding data
     * - instanciate a new map
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * when the activity is running
     * - check the position of the user to the bubble
     * - make the bubble start/stop sound
     */
    @Override
    protected void onStart(){
        super.onStart();

    }
}
