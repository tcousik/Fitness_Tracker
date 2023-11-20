package com.example.fitnesstracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;

import com.example.fitnesstracker.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding; //binding object

    //view binding enabled
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        //reference buttons

        binding.buttonWorkoutTracker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWorkoutTrackerActivity();
            }
        });

        binding.buttonCalorieTracker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCalorieTrackerActivity();
            }
        });

        binding.buttonSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSettingsActivity();
            }
        });
    }

    //open activities
    public void openWorkoutTrackerActivity() {
        Intent intent = new Intent(this, WorkoutTrackerActivity.class);
        startActivity(intent);
    }


    public void openCalorieTrackerActivity() {
        Intent intent = new Intent(this, CalorieTrackerActivity.class);
        startActivity(intent);
    }

    public void openSettingsActivity() {
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
    }
}