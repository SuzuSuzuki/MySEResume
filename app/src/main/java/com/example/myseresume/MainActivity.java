package com.example.myseresume;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void deveExBtn_onClick(View v){
        Intent i = new Intent(this,com.example.myseresume.DeveExList.class);
        startActivity(i);
    }

    public void qualListBtn_onClick(View v){
        Intent i = new Intent(this,com.example.myseresume.QualList.class);
        startActivity(i);
    }
}
