package com.bignerdranch.android.escaperoom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BookshelfActivity extends AppCompatActivity {

    private Button mBook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bookshelf);

        mBook = (Button) findViewById(R.id.book);
        mBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BookshelfActivity.this, BookActivity.class);
                startActivity(intent);
            }
        });
    }
}
