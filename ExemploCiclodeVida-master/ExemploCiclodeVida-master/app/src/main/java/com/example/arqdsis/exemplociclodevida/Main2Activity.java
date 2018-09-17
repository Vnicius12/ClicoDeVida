package com.example.arqdsis.exemplociclodevida;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.i("meuapp", "Act2: onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("meuapp","Act2: OnStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("meuapp", "Act2: onResume");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("meuapp", "Act2: onStop");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("meuapp", "Act2: onDestroy");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("meuapp", "Act2: onRestart");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("meuapp", "Act2: onPause");

    }
}
