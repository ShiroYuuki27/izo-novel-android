package com.sata.izonovel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;

public class NovelFavoriteActivity extends AppCompatActivity {
        LinearLayout daftarfavorite;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novel_favorite);

        daftarfavorite = findViewById(R.id.daftarfavorite);
        daftarfavorite.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Intent intent = new Intent(NovelFavoriteActivity.this, BiodataActivity.class);
                startActivity(intent);
                return false;
            }
        });
    }
}