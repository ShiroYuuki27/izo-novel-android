package com.sata.izonovel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView menuFavorite, menuInfoPengguna, menuDaftarNovel, menuInputNovel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        menuInfoPengguna = findViewById(R.id.informasi_pengguna);
        menuInfoPengguna.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Intent intent = new Intent(MainActivity.this, BiodataActivity.class);
                startActivity(intent);
                return false;
            }
        });

        menuFavorite = findViewById(R.id.favorite_more);
        menuFavorite.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Intent intent = new Intent(MainActivity.this, NovelFavoriteActivity.class);
                startActivity(intent);
                return false;
            }
        });

        menuDaftarNovel = findViewById(R.id.daftar_novel);
        menuDaftarNovel.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Intent intent = new Intent(MainActivity.this, DaftarNovelActivity.class);
                startActivity(intent);
                return false;
            }
        });

        menuInputNovel = findViewById(R.id.tvInputNovel);
        menuInputNovel.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Intent intent = new Intent(MainActivity.this, FormInptActivity.class);
                startActivity(intent);
                return false;
            }
        });

    }
}