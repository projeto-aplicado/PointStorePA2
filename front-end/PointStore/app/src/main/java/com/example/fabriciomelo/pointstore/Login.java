package com.example.fabriciomelo.pointstore;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        ActionBar bar = getSupportActionBar();
//        bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#3CB371")));



        setContentView(R.layout.activity_login);

    }


    public void logar(View v) {

    }
    public void cadastrarUsuario (View v) {
        Intent cadastrarUsuario = new Intent(this, CadastrarUsuario.class);
        startActivity(cadastrarUsuario);

    }
    public void alterarSenha (View v) {
        Intent alterarSenha = new Intent(this, AlterarSenha.class);
        startActivity(alterarSenha);

    }



}
