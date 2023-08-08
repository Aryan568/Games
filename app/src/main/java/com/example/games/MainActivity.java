package com.example.games;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.games.snake.snakedash;
import com.example.games.tictactoe.AddPlayers;

public class MainActivity extends AppCompatActivity {

    Button ttt, snake;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ttt= findViewById(R.id.tictactoe);
        snake=findViewById(R.id.snake);

        ttt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, AddPlayers.class));
            }
        });

        snake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, snakedash.class));
            }
        });
    }
}