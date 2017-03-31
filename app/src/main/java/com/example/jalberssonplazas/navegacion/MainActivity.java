package com.example.jalberssonplazas.navegacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    ImageView img;
    TextView titulo;
    Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNext=(Button) findViewById(R.id.btnNext);

    }
    public void siguiente(View view)
    {
        Intent intent=new Intent(MainActivity.this, Main2Activity.class);
        startActivity(intent);
    }

}
