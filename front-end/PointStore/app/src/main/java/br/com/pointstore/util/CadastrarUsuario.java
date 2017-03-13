package br.com.pointstore.util;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

import br.com.pointstore.R;
import br.com.pointstore.model.Usuario;
import rest.UsuarioService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class CadastrarUsuario extends AppCompatActivity {

    private EditText editTextNome;
    private EditText editTextCadEmail;
    private EditText editTextSobrenome;
    private EditText editTextCadSenha;
    private EditText editTextCadUsuario;

    private UsuarioService mUsuarioService;
    private Usuario usuario;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_usuario);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://localhost:8080/")
                .addConverterFactory(JacksonConverterFactory.create())
                .build();

        mUsuarioService = retrofit.create(UsuarioService.class);
        usuario = new Usuario("Fabricio", "Melo","123","123","email","fabricio","123");


        editTextNome = (EditText) findViewById(R.id. editTextNome);
        editTextCadEmail = (EditText) findViewById(R.id.editTextCadEmail);
        editTextSobrenome = (EditText) findViewById(R.id.editTextSobrenome);
        editTextCadSenha = (EditText) findViewById(R.id.editTextCadSenha);
        editTextCadUsuario = (EditText) findViewById (R.id.editTextCadUsuario);

    }


    public void cadastrarUsuario (View v) {

        if ((editTextNome.getText().length() <= 0) || (editTextCadEmail.getText().length() <= 0) ||(editTextSobrenome.getText().length() <= 0)|| (editTextCadSenha.getText().length() <= 0)|| (editTextCadUsuario.getText().length()<=0)){
            Toast toast = Toast.makeText(getApplicationContext(), "Campos Vazios", Toast.LENGTH_SHORT);
            toast.show();


        } else {

            //Toast toast = Toast.makeText(getApplicationContext(), usuario.getNome(), Toast.LENGTH_SHORT);
            //toast.show();

            Call<Usuario> userCall = mUsuarioService.createUser(usuario);
        }
    }
}
