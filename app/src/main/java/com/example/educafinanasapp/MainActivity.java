package com.example.educafinanasapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btnIMPOSTO);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tela = new Intent(MainActivity.this, ImpostoActivity.class);
                startActivity(tela);
            }
        });

        btn = findViewById(R.id.btnORCAMENTO);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tela = new Intent(MainActivity.this, OrcamentoActivity.class);
                startActivity(tela);
            }
        });

        btn = findViewById(R.id.btnDIVIDA);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tela = new Intent(MainActivity.this, DividaActivity.class);
                startActivity(tela);
            }

        });

        btn = findViewById(R.id.btnSEGURO);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tela = new Intent(MainActivity.this, SeguroActivity.class);
                startActivity(tela);
            }
        });

        btn = findViewById(R.id.btnEDUCACAO);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tela = new Intent(MainActivity.this, EducacapActivity.class);
                startActivity(tela);
            }
        });

        btn = findViewById(R.id.btnPLANEJAMENTO);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tela = new Intent(MainActivity.this, PlanejamentoActivity.class);
                startActivity(tela);
            }
        });

        btn = findViewById(R.id.btnPOUPANCA);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tela = new Intent(MainActivity.this, PoupancaActivity.class);
                startActivity(tela);
            }
        });

        btn = findViewById(R.id.btnINVESTIMENTOS);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tela = new Intent(MainActivity.this, InvestimentosActivity.class);
                startActivity(tela);
            }
        });

        btn = findViewById(R.id.btnETICA);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tela = new Intent(MainActivity.this, EticaActivity.class);
                startActivity(tela);
            }
        });

        btn = findViewById(R.id.btnCOMPORTAMENTO);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tela = new Intent(MainActivity.this, ComportamentoActivity.class);
                startActivity(tela);
            }
        });

        btn = findViewById(R.id.btnHERANCA);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tela = new Intent(MainActivity.this, HerancaActivity.class);
                startActivity(tela);
            }
        });

    }
}