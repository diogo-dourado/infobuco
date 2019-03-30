package com.projeto.newsbucoapp;

import android.content.Intent;
import android.os.Bundle;
//import android.support.design.widget.FloatingActionButton;
//import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class ActPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_principal);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button btnAdmin = (Button) findViewById(R.id.btn_Admin);
        btnAdmin.setOnClickListener(new android.view.View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(ActPrincipal.this, ActCursoAdmin.class);
                startActivity(intent);
            }
        });

        Button btnSI = (Button) findViewById(R.id.btn_SI);
        btnSI.setOnClickListener(new android.view.View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(ActPrincipal.this, ActCursoSI.class);
                startActivity(intent);
            }
        });

        Button btnSair = (Button) findViewById(R.id.btn_Sair);
        btnSair.setOnClickListener(new android.view.View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(ActPrincipal.this, ActLogin.class);
                startActivity(intent);
            }
        });

    }

}
