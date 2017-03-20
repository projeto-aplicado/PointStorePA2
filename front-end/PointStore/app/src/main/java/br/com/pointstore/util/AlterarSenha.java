package br.com.pointstore.util;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import br.com.pointstore.R;

public class AlterarSenha extends AppCompatActivity {



    private EditText editTextEmailAtual;
    private EditText editTextNovaSenha;
    private EditText editTextConfirmarNovaSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alterar_senha);


        editTextEmailAtual = (EditText) findViewById(R.id.editTextAlterEmailAtual);
        editTextNovaSenha = (EditText) findViewById(R.id.editTextAlterNovaSenha);
        editTextConfirmarNovaSenha = (EditText) findViewById(R.id.editTextAlterConfirmarSenha);

    }

    public void atualizarSenha (View v) {


        if ((editTextEmailAtual.getText().length() > 0) && (editTextNovaSenha.getText().length() > 0) && (editTextConfirmarNovaSenha.getText().length() > 0) &&
                ((editTextNovaSenha.getText().toString()).equals(editTextConfirmarNovaSenha.getText().toString())) ) {

        } else {

            if (editTextEmailAtual.getText().length() <= 0){
                editTextEmailAtual.setError("Campo email é obrigatório");
            }

            if (!(editTextNovaSenha.getText().toString()).equals(editTextConfirmarNovaSenha.getText().toString())) {

                    editTextNovaSenha.setError("Senhas não conferem");
                    editTextConfirmarNovaSenha.setError("Senhas não conferem");
            }

        }
    }
}
