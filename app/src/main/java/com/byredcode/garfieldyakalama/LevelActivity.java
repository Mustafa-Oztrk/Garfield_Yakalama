package com.byredcode.garfieldyakalama;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LevelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);
    }


    public void EasyBtn(View view){
        Intent intent = new Intent(this, EasyActivity.class);
        startActivity(intent);

    }

    public void MediumBtn(View view){
        Intent intent = new Intent(this, MediumActivity.class);
        startActivity(intent);

    }

    public void HarBtn(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }

}