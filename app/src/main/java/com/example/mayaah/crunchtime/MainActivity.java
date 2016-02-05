package com.example.mayaah.crunchtime;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

        final EditText editJog = (EditText) findViewById(R.id.editText);
        final EditText editJump = (EditText) findViewById(R.id.editText2);
        final EditText editSit = (EditText) findViewById(R.id.editText3);
        final EditText editPush = (EditText) findViewById(R.id.editText5);
        final EditText editSquat = (EditText) findViewById(R.id.editText4);

        final TextView textCalories = (TextView) findViewById(R.id.numCal);
        final TextView textCalWord = (TextView) findViewById(R.id.calories);
        final TextView textBurn = (TextView) findViewById(R.id.burn);

        ImageButton buttonConvert = (ImageButton) findViewById(R.id.iconBurn);
        final Button buttonClear = (Button) findViewById(R.id.clearButton);

        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textCalories.setVisibility(View.GONE);
                textCalWord.setVisibility(View.GONE);
                textBurn.setVisibility(View.VISIBLE);
                buttonClear.setVisibility(View.GONE);
                editJog.setText("");
                editJump.setText("");
                editSit.setText("");
                editPush.setText("");
                editSquat.setText("");
            }
        });

        buttonConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (editJog.getText().toString().trim().length() != 0) {
                    double jogMin = Double.valueOf(editJog.getText().toString());
                    double jumpMin = jogMin * .8333;
                    editJump.setText(String.valueOf(Math.round(jumpMin)));
                    double sitRep = jogMin * 16.6666;
                    editSit.setText(String.valueOf(Math.round(sitRep)));
                    double pushRep = jogMin * 29.16667;
                    editPush.setText(String.valueOf(Math.round(pushRep)));
                    double squatRep = jogMin * 18.75;
                    editSquat.setText(String.valueOf(Math.round(squatRep)));
                    double calories = jogMin * 8.333;
                    textCalories.setText(String.valueOf(Math.round(calories)));
                    textBurn.setVisibility(View.GONE);
                    textCalories.setVisibility(View.VISIBLE);
                    textCalWord.setVisibility(View.VISIBLE);
                    buttonClear.setVisibility(View.VISIBLE);
                }

                if (editJump.getText().toString().trim().length() != 0) {
                    double jumpMin = Double.valueOf(editJump.getText().toString());
                    double jogMin = jumpMin * .12;
                    editJog.setText(String.valueOf(Math.round(jogMin)));
                    double sitRep = jumpMin * 20;
                    editSit.setText(String.valueOf(Math.round(sitRep)));
                    double pushRep = jumpMin * 35;
                    editPush.setText(String.valueOf(Math.round(pushRep)));
                    double squatRep = jumpMin * 22.5;
                    editSquat.setText(String.valueOf(Math.round(squatRep)));
                    double calories = jumpMin * 10;
                    textCalories.setText(String.valueOf(Math.round(calories)));
                    textBurn.setVisibility(View.GONE);
                    textCalories.setVisibility(View.VISIBLE);
                    textCalWord.setVisibility(View.VISIBLE);
                    buttonClear.setVisibility(View.VISIBLE);
                }

                if (editSit.getText().toString().trim().length() != 0) {
                    double sitRep = Double.valueOf(editSit.getText().toString());
                    double jumpMin = sitRep * 0.05;
                    editJump.setText(String.valueOf(Math.round(jumpMin)));
                    double jogMin = sitRep * .006;
                    editJog.setText(String.valueOf(Math.round(jogMin)));
                    double pushRep = sitRep * 1.75;
                    editPush.setText(String.valueOf(Math.round(pushRep)));
                    double squatRep = sitRep * 1.125;
                    editSquat.setText(String.valueOf(Math.round(squatRep)));
                    double calories = sitRep * 0.5;
                    textCalories.setText(String.valueOf(Math.round(calories)));
                    textBurn.setVisibility(View.GONE);
                    textCalories.setVisibility(View.VISIBLE);
                    textCalWord.setVisibility(View.VISIBLE);
                    buttonClear.setVisibility(View.VISIBLE);

                }

                if (editPush.getText().toString().trim().length() != 0) {
                    double pushRep = Double.valueOf(editPush.getText().toString());
                    double jumpMin = pushRep * 0.0285;
                    editJump.setText(String.valueOf(Math.round(jumpMin)));
                    double jogMin = pushRep * .00342;
                    editJog.setText(String.valueOf(Math.round(jogMin)));
                    double sitRep = pushRep * 0.571;
                    editSit.setText(String.valueOf(Math.round(sitRep)));
                    double squatRep = pushRep * 0.642;
                    editSquat.setText(String.valueOf(Math.round(squatRep)));
                    double calories = pushRep * 0.285;
                    textCalories.setText(String.valueOf(Math.round(calories)));
                    textBurn.setVisibility(View.GONE);
                    textCalories.setVisibility(View.VISIBLE);
                    textCalWord.setVisibility(View.VISIBLE);
                    buttonClear.setVisibility(View.VISIBLE);
                }

                if (editSquat.getText().toString().trim().length() != 0) {
                    double squatRep = Double.valueOf(editSquat.getText().toString());
                    double jumpMin = squatRep * 0.0444;
                    editJump.setText(String.valueOf(Math.round(jumpMin)));
                    double jogMin = squatRep * 0.05333;
                    editJog.setText(String.valueOf(Math.round(jogMin)));
                    double sitRep = squatRep * 0.8888;
                    editSit.setText(String.valueOf(Math.round(sitRep)));
                    double pushRep = squatRep * 1.555;
                    editPush.setText(String.valueOf(Math.round(pushRep)));
                    double calories = squatRep * 0.444;
                    textCalories.setText(String.valueOf(Math.round(calories)));
                    textBurn.setVisibility(View.GONE);
                    textCalories.setVisibility(View.VISIBLE);
                    textCalWord.setVisibility(View.VISIBLE);
                    buttonClear.setVisibility(View.VISIBLE);

                }
            }
        });

    }


}
