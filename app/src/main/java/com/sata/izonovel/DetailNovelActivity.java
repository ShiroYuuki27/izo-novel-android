package com.sata.izonovel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class DetailNovelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_novel);

        //
        Intent intent = getIntent();
        String id = intent.getStringExtra("id");
        String judul = intent.getStringExtra("id");


        Log.d("INFO-id",id);
        Log.d("INFO-Judul",judul);
    }
}