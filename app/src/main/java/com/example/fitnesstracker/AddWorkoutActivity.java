package com.example.fitnesstracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;


import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.DialogFragment;

import com.example.fitnesstracker.databinding.ActivityAddWorkoutBinding;

public class AddWorkoutActivity extends DialogFragment {

    private ActivityAddWorkoutBinding binding;

    @Override
    public Dialog onCreateDialog (Bundle savedInstanceState) {

        binding = ActivityAddWorkoutBinding.inflate(LayoutInflater.from(getContext()));

        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setView(binding.getRoot());

        binding.clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clear();
            }
        });

        binding.save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                save();
                dismiss();

            }
        });


        return builder.create();
    }

    public void save(){
        String name = binding.editTextText.getText().toString();
        String type = "";
        if(binding.radioButton.isChecked()){
            type = "Back";
        }
        if(binding.radioButton2.isChecked()){
            type = "Legs";
        }
        if(binding.radioButton3.isChecked()){
            type = "Arms";
        }
        if(binding.radioButton.isChecked()){
            type = "Chest";
        }
        Workout workout = new Workout(name, type);
        WorkoutTrackerActivity workoutTracker = (WorkoutTrackerActivity)getActivity();
        workoutTracker.addWorkoutToList(workout);
        dismiss();
    }
    public void clear(){
        binding.editTextText.setText("");
        binding.radioButton4.setChecked(true);
    }
}