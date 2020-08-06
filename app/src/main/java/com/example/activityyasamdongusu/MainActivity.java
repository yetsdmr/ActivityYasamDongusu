package com.example.activityyasamdongusu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("Takip","onCreate Metodu Çalıştı.");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Takip","onStart Metodu Çalıştı.");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Takip","onResume Metodu Çalıştı.");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Takip","onPause Metodu Çalıştı.");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Takip","onRestart Metodu Çalıştı.");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Takip","onDestroy Metodu Çalıştı.");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Takip","onStop Metodu Çalıştı.");
    }
}