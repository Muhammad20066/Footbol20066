package com.example.football;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class Game_Levels extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_levels);


        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Button button_back = (Button) findViewById(R.id.button_back);
        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //здесь будет команда для кнопки

                //начало конструкции
                try {
                    Intent intent = new Intent(Game_Levels.this, MainActivity.class);
                    startActivity(intent);
                    finish();

                } catch (Exception e) {

                }

            }
            //конец конструкции


        });

        //Кнопка для перехода на 1 уровень - начало
        TextView textView1 = findViewById(R.id.textView1);
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(Game_Levels.this, Level1.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {
                    //пусто
                }
            }
        });
        //Кнопка для перехода на 1 уровень - конец
    }}


