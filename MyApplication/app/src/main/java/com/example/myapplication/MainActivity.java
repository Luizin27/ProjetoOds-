package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button sair, ODS1, ODS2, ODS3, ODS4, ODS5, ODS6, ODS7, ODS8, ODS9, ODS10, ODS11, ODS12, ODS13,
            ODS14, ODS15, ODS16, ODS17;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sair = findViewById(R.id.sair);
        sair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                finishAffinity();
            }
        });

        ODS1 = findViewById(R.id.ODS1);
        ODS1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ods1 = new Intent( getApplicationContext(), ODS1Activity.class);
                startActivity(ods1);
            }
        });

        ODS2 = findViewById(R.id.ODS2);
        ODS2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ods2 = new Intent( getApplicationContext(), ODS2Activity.class);
                startActivity(ods2);
            }
        });

        ODS3 = findViewById(R.id.ODS3);
        ODS3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ods3 = new Intent( getApplicationContext(), ODS3Activity.class);
                startActivity(ods3);
            }
        });

        ODS4 = findViewById(R.id.ODS4);
        ODS4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ods4 = new Intent( getApplicationContext(), ODS4Activity.class);
                startActivity(ods4);
            }
        });

        // BOTAO ABRE ODS5
        ODS5 = findViewById(R.id.ODS5);
        ODS5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ods5 = new Intent( getApplicationContext(), ODS5Activity.class);
                startActivity(ods5);
            }
        });

        ODS6 = findViewById(R.id.ODS6);
        ODS6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ods6 = new Intent( getApplicationContext(), ODS6Activity.class);
                startActivity(ods6);
            }
        });

        ODS7 = findViewById(R.id.ODS7);
        ODS7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ods7 = new Intent( getApplicationContext(), ODS7Activity.class);
                startActivity(ods7);
            }
        });

        ODS8 = findViewById(R.id.ODS8);
        ODS8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ods8 = new Intent( getApplicationContext(), ODS8Activity.class);
                startActivity(ods8);
            }
        });

        ODS9 = findViewById(R.id.ODS9);
        ODS9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ods9 = new Intent( getApplicationContext(), ODS9Activity.class);
                startActivity(ods9);
            }
        });

        ODS10 = findViewById(R.id.ODS10);
        ODS10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ods10 = new Intent( getApplicationContext(), ODS10Activity.class);
                startActivity(ods10);
            }
        });

        ODS11 = findViewById(R.id.ODS11);
        ODS11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ods11 = new Intent( getApplicationContext(), ODS11Activity.class);
                startActivity(ods11);
            }
        });

        ODS12 = findViewById(R.id.ODS12);
        ODS12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ods12 = new Intent( getApplicationContext(), ODS12Activity.class);
                startActivity(ods12);
            }
        });

        ODS13 = findViewById(R.id.ODS13);
        ODS13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ods13 = new Intent( getApplicationContext(), ODS13Activity.class);
                startActivity(ods13);
            }
        });

        ODS14 = findViewById(R.id.ODS14);
        ODS14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ods14 = new Intent( getApplicationContext(), ODS14Activity.class);
                startActivity(ods14);
            }
        });

        ODS15 = findViewById(R.id.ODS15);
        ODS15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ods15 = new Intent( getApplicationContext(), ODS15Activity.class);
                startActivity(ods15);
            }
        });

        ODS16 = findViewById(R.id.ODS16);
        ODS16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ods16 = new Intent( getApplicationContext(), ODS16Activity.class);
                startActivity(ods16);
            }
        });

        ODS17 = findViewById(R.id.ODS17);
        ODS17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ods17 = new Intent( getApplicationContext(), ODS17Activity.class);
                startActivity(ods17);
            }
        });
    }
}