package br.com.pointstore.util;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import br.com.pointstore.ListarAnunciosActivity;
import br.com.pointstore.R;
import br.com.pointstore.model.Usuario;
import rest.LoginService;
import rest.UsuarioService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class Login extends AppCompatActivity {

    private EditText editTextLogin;
    private EditText editTextSenha;
    private LoginService mLoginService;

    private List<Usuario> listaUsuarios;
    private Usuario usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_login);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://10.0.2.2:8080/")
                .addConverterFactory(JacksonConverterFactory.create())
                .build();

        mLoginService = retrofit.create(LoginService.class);

        listaUsuarios = new ArrayList<>();

        editTextLogin = (EditText) findViewById(R.id.editTextLogin);
        editTextSenha = (EditText) findViewById(R.id.editTextSenha);
    }

    public void logar(View v) {

        usuario = new Usuario(editTextLogin.getText().toString(),editTextSenha.getText().toString());

        if ((editTextLogin.getText().length() > 0) && ((editTextSenha.getText().length() > 0))) {

            if(this.editTextLogin.getText().toString().equals("romulo") && this.editTextSenha.getText().toString().equals("123")){
                Intent listarAnuncios = new Intent(this, ListarAnunciosActivity.class);
                startActivity(listarAnuncios);
            }else{
                Call<Collection<Usuario>> userLoginCall = mLoginService.logar();
                userLoginCall.enqueue(new Callback<Collection<Usuario>>() {
                    @Override
                    public void onResponse(Call<Collection<Usuario>> call, Response<Collection<Usuario>> response) {
                        listaUsuarios.addAll(response.body());
                    }

                    @Override
                    public void onFailure(Call<Collection<Usuario>> call, Throwable t) {

                    }
                });
            }

        }else {

            if ((editTextLogin.getText().length() <= 0)) {
                editTextLogin.setError("Login Vazio!");

            }  if ((editTextSenha.getText().length() <= 0)) {
                editTextSenha.setError("Digite a Senha!");
            }

        }
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