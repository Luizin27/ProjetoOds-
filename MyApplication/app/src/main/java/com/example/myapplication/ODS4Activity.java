package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ODS4Activity extends AppCompatActivity {

    Button voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ods4);

        // BOTAO para VOLTAR
        voltar = findViewById(R.id.ODS2);
        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ods2 = new Intent( getApplicationContext(), ODS2Activity.class);
                startActivity(ods2);
            }
        });
    }
}