package com.example.jalberssonplazas.navegacion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener
{

    Button btnVerde, btnAmarillo, btnRojo;
    TextView txtVerde, txtAmarillo, txtRojo;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        btnAmarillo=(Button) findViewById(R.id.btnAmarillo);
        btnVerde= (Button) findViewById(R.id.btnVerde);
        btnRojo= (Button) findViewById(R.id.btnRojo);
        txtAmarillo=(TextView) findViewById(R.id.txtAmarillo);
        txtVerde=(TextView) findViewById(R.id.txtVerde);
        txtRojo=(TextView) findViewById(R.id.txtRojo);
        btnVerde.setOnClickListener(this);
        btnAmarillo.setOnClickListener(this);
        btnRojo.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.btnAmarillo:
                txtAmarillo.setText("Yellow");
                break;

            case R.id.btnVerde:
                txtVerde.setText("Green");
                break;

            case R.id.btnRojo:
                txtRojo.setText("Red");
                break;
        }
    }
}
