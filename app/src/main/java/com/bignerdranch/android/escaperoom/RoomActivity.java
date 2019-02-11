package com.bignerdranch.android.escaperoom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class RoomActivity extends AppCompatActivity {

    private Button mBookshelf;
    private Button mDesk;
    private Button mSafe;
    private Button mRiddle;
    private Button mUnscramble;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room);

        ImageView myImageView = (ImageView) findViewById(R.id.my_image_view);
        myImageView.setImageResource(R.drawable.office);

        mBookshelf = (Button) findViewById(R.id.bookshelf);
        mBookshelf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( RoomActivity.this, BookshelfActivity.class);
                startActivity(intent);
            }
        });

        mDesk = (Button) findViewById(R.id.desk);
        mDesk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RoomActivity.this, DeskActivity.class);
                startActivity(intent);
            }
        });

        mSafe = (Button) findViewById(R.id.safe);
        mSafe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RoomActivity.this, SafeActivity.class);
                startActivity(intent);
            }
        });

        mRiddle = (Button) findViewById(R.id.riddle);
        mRiddle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RoomActivity.this, RiddleActivity.class);
                startActivity(intent);
            }
        });

        mUnscramble = (Button) findViewById(R.id.unscramble);
        mUnscramble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RoomActivity.this, UnscrambleActivity.class);
                startActivity(intent);
            }
        });

        Intent intent=getIntent();
        intent.getExtras();
        if(intent.hasExtra("user_canceled")){
            Toast toast = Toast.makeText(this, "You found the key! You Win!", Toast.LENGTH_LONG);
            toast.setGravity(Gravity.TOP|Gravity.CENTER_HORIZONTAL, 0, 20);
            toast.show();
        }
    }
}
