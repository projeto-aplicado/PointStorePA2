package br.com.pointstore.util;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import br.com.pointstore.R;

public class AlterarSenha extends AppCompatActivity {



    private EditText editTextSenhaAtual;
    private EditText editTextNovaSenha;
    private EditText editTextConfirmarNovaSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alterar_senha);


        editTextSenhaAtual = (EditText) findViewById(R.id.editTextAlterSenhaAtual);
        editTextNovaSenha = (EditText) findViewById(R.id.editTextAlterNovaSenha);
        editTextConfirmarNovaSenha = (EditText) findViewById(R.id.editTextAlterConfirmarSenha);

    }

    public void atualizarSenha (View v) {

        if ((editTextSenhaAtual.getText().length() <= 0) || (editTextNovaSenha.getText().length() <= 0) || editTextConfirmarNovaSenha.getText().length() <= 0){
            Toast toast = Toast.makeText(getApplicationContext(), "Campos Vazios", Toast.LENGTH_SHORT);
            toast.show();
            editTextSenhaAtual.setError("erro");

        } else if (editTextNovaSenha.getText().toString() != editTextConfirmarNovaSenha.getText().toString()){
            Toast toast = Toast.makeText(getApplicationContext(), "Senhas não conferem", Toast.LENGTH_SHORT);
            toast.show();
        } else{

                //back
        }
    }

}
