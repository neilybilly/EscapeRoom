package com.bignerdranch.android.escaperoom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class UnscrambleActivity extends AppCompatActivity {

    private EditText arm;
    private EditText hand;
    private EditText fac;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unscramble);
        arm = findViewById(R.id.arms);

        arm.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent keyEvent) {

                if (keyEvent.getAction() == KeyEvent.ACTION_DOWN) {
                    if (keyCode == keyEvent.KEYCODE_ENTER) {
                        checkAnswer();
                    }
                }

                return false;
            }
        });

        hand = findViewById(R.id.hands);

        hand.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent keyEvent) {

                if (keyEvent.getAction() == KeyEvent.ACTION_DOWN) {
                    if (keyCode == keyEvent.KEYCODE_ENTER) {
                        checkAnswer2();
                    }
                }

                return false;
            }
        });

        fac = findViewById(R.id.face);

        fac.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent keyEvent) {

                if (keyEvent.getAction() == KeyEvent.ACTION_DOWN) {
                    if (keyCode == keyEvent.KEYCODE_ENTER) {
                        checkAnswer3();
                    }
                }

                return false;
            }
        });

    }

    public void checkAnswer() {
        String answer = arm.getText().toString().toLowerCase();

        if (answer.equals("arms")) {
            //correct!
            Toast toast = Toast.makeText(this, "Correct!", Toast.LENGTH_LONG);
            toast.show();
        } else {
            //wrong
            Toast toast = Toast.makeText(this, "Try Again!", Toast.LENGTH_SHORT);
            toast.show();
        }
    }

    public void checkAnswer2() {
        String answer2 = hand.getText().toString().toLowerCase();
        if (answer2.equals("hands")) {
            //correct!
            Toast toast = Toast.makeText(this, "Correct!", Toast.LENGTH_LONG);
            toast.show();
        } else {
            //wrong
            Toast toast = Toast.makeText(this, "Try Again!", Toast.LENGTH_SHORT);
            toast.show();
        }
    }

    public void checkAnswer3() {
        String answer3 = fac.getText().toString().toLowerCase();
        if (answer3.equals("face")) {
            //correct!
            Toast toast = Toast.makeText(this, "Correct!", Toast.LENGTH_LONG);
            toast.show();
        } else {
            //wrong
            Toast toast = Toast.makeText(this, "Try Again!", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}