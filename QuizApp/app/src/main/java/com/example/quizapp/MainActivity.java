package com.example.quizapp;

import android.annotation.SuppressLint;
import android.media.Image;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    
    ImageView ivImage;
    Button btQuiz, btLearn, btHome, btData, btAbout, btExit;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivImage = findViewById(R.id.ivImage);
        btQuiz = findViewById(R.id.btQuiz);
        btLearn = findViewById(R.id.btAbout);
        btHome = findViewById(R.id.btHome);
        btData = findViewById(R.id.btData);
        btAbout = findViewById(R.id.btAbout);
        btExit = findViewById(R.id.btExit);

        btQuiz.setOnClickListener(view -> quiz());
        btLearn.setOnClickListener(view -> learn());
        btHome.setOnClickListener(view -> home());
        btData.setOnClickListener(view -> data());
        btAbout.setOnClickListener(view -> about());
        btExit.setOnClickListener(view -> exit());
        
    }

    private void exit() {
    }

    private void about() {
    }

    private void data() {
    }

    private void home() {
    }

    private void learn() {
    }

    private void quiz() {
    }
}