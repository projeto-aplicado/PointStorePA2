package br.com.pointstore.util;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

import br.com.pointstore.R;
import br.com.pointstore.model.Usuario;
import rest.LoginService;
import rest.UsuarioService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class Perfil extends AppCompatActivity {

    private EditText editTextNome;
    private EditText editTextSobrenome;
    private EditText editTextEmail;
    private EditText editTextCPF;
    private EditText editTextLogin;
    private EditText editTextSenha;
    private UsuarioService mUsuarioService;
    private Usuario usuario;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_activity_perfil);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });



    }

    private void atualizarPerfil(){

        if((this.editTextNome.getText().length() > 0) && (this.editTextSobrenome.getText().length() > 0) &&

                (this.editTextEmail.getText().length() > 0)&& (this.editTextCPF.getText().length() > 0)&&

                (this.editTextLogin.getText().length()> 0) && (this.editTextSenha.getText().length() > 0)){

            Call<Usuario> userCall = mUsuarioService.updateUser(this.usuario);
            userCall.enqueue(new Callback<Usuario>() {
                @Override
                public void onResponse(Call<Usuario> call, Response<Usuario> response) {


                }

                @Override
                public void onFailure(Call<Usuario> call, Throwable t) {


                }
            });

            Intent telaDeLogin = new Intent(this, Login.class);
            startActivity(telaDeLogin);

        }else{
            if (editTextNome.getText().length() <= 0){
                editTextNome.setError("Campo nome é obrigatório");
            }
            if (editTextSobrenome.getText().length() <= 0){
                editTextSobrenome.setError("Campo sobrenome é obrigatório");
            }
            if (editTextEmail.getText().length() <= 0){
                editTextEmail.setError("Campo email é obrigatório");
            }
            if (editTextCPF.getText().length() <= 0){
                editTextCPF.setError("Campo cpf é obrigatório");
            }
            if (editTextLogin.getText().length() <= 0){
                editTextLogin.setError("Campo login é obrigatório");
            }
            if (editTextSenha.getText().length() <= 0){
                editTextSenha.setError("Campo senha é obrigatório");
            }
        }

    }


}
