package com.example.arqdsis.exemplociclodevida;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void navegarParaASegundaActivity(View view){
        Intent intent = new Intent(this,Main2Activity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("meuapp","Acti1: onCreate");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("meuapp","Acti1: onResume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("meuapp","Acti1: onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("meuapp","Acti1: onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("meuapp","Acti1: onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("meuapp","Acti1: onDestory");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("meuapp","Acti1: onRestart");

    }
}
