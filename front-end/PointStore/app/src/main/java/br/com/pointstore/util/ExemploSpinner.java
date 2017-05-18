package br.com.pointstore.util;

/**
 * Created by Juan on 05/05/2017.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import java.util.List;
import java.util.ArrayList;

import br.com.pointstore.ListarAnunciosActivity;
import br.com.pointstore.R;

public class ExemploSpinner extends Activity {

    private Spinner spn1;
    private List<String> nomes = new ArrayList<String>();
    private String nome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finalizar_compra);

        //Adicionando Nomes no ArrayList
        nomes.add("MasterCard");
        nomes.add("Visa");
        nomes.add("Nubank");
        nomes.add("Caixa");
        nomes.add("Bradesco");

        //Identifica o Spinner no layout
        spn1 = (Spinner) findViewById(R.id.spinner);
        //Cria um ArrayAdapter usando um padrão de layout da classe R do android, passando o ArrayList nomes
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, nomes);
        ArrayAdapter<String> spinnerArrayAdapter = arrayAdapter;
        spinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spn1.setAdapter(spinnerArrayAdapter);

        //Método do Spinner para capturar o item selecionado
        spn1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View v, int posicao, long id) {
                //pega nome pela posição
                nome = parent.getItemAtPosition(posicao).toString();
                //imprime um Toast na tela com o nome que foi selecionado
                Toast.makeText(ExemploSpinner.this, "Cartão Selecionado: " + nome, Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }



    public void qualificarUser (View view) {
        Intent qualificaruser = new Intent(this, QualificarUsuario.class);
        startActivity(qualificaruser);
    }

}
