package br.com.pointstore.util;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import br.com.pointstore.R;
import rest.LoginService;
import rest.UsuarioService;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;


public class Login extends AppCompatActivity {

    private EditText editTextLogin;
    private EditText editTextSenha;
    private LoginService mLoginService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://10.0.2.2:8080/")
                .addConverterFactory(JacksonConverterFactory.create())
                .build();

        mLoginService = retrofit.create(LoginService.class);


        editTextLogin = (EditText) findViewById(R.id.editTextLogin);
        editTextSenha = (EditText) findViewById(R.id.editTextSenha);


    }


    public void logar(View v) {


        if ((editTextLogin.getText().length() <= 0)) {
            //Toast toast = Toast.makeText(getApplicationContext(), "Login Vazio!", Toast.LENGTH_SHORT);
            //toast.show();
            editTextLogin.setError("Login Vazio!");

        }  if ((editTextSenha.getText().length() <= 0)) {
            //Toast toast = Toast.makeText(getApplicationContext(), "Digite a Senha!", Toast.LENGTH_SHORT);
            //toast.show();
            editTextSenha.setError("Digite a Senha!");
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
