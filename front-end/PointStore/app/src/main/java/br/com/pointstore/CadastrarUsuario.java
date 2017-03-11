package br.com.pointstore;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import br.com.pointstore.R;

public class CadastrarUsuario extends AppCompatActivity {

    private EditText editTextNome;
    private EditText editTextCadEmail;
    private EditText editTextSobrenome;
    private EditText editTextCadSenha;
    private EditText editTextCadUsuario;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_usuario);

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

            //back
        }
    }
}
