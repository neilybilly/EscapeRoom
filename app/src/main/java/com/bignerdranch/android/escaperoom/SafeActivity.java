package com.bignerdranch.android.escaperoom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SafeActivity extends AppCompatActivity {

    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_safe);
        editText = findViewById(R.id.editText);

        editText.setOnKeyListener(new View.OnKeyListener() {
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

    }

    public void checkAnswer() {
        String answer = editText.getText().toString().toLowerCase();
        String alertTitle;
        if (answer.equals("25625")) {
            Intent intent = new Intent(getBaseContext(), RoomActivity.class);
            String cancel = "cancel";
            intent.putExtra("user_cancelled", cancel);
            startActivity(intent);
            Toast toast = Toast.makeText(SafeActivity.this, "Correct! You found the key, you win!", Toast.LENGTH_LONG);
            toast.setGravity(Gravity.TOP|Gravity.CENTER_HORIZONTAL, 0, 20);
            toast.show();
        } else {
            //wrong
            Toast toast = Toast.makeText(this, "Try Again!", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.TOP|Gravity.CENTER_HORIZONTAL, 0, 20);
            toast.show();
        }
    }
}
