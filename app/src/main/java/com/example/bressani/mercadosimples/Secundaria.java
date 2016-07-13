package com.example.bressani.mercadosimples;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.widget.TextView;

public class Secundaria extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundaria);

        Intent intent = getIntent();

        Bundle dados = intent.getExtras();

        int arroz = dados.getInt("arroz");
        int feijao = dados.getInt("feijao");
        int leite = dados.getInt("leite");

        int arrozResult, feijaoResult, leiteResult;

        arrozResult = arroz * 10;
        feijaoResult = feijao * 500;
        leiteResult = leite * 5;

        AlertDialog.Builder dialogo = new AlertDialog.Builder(Secundaria.this);

        int total = arrozResult + feijaoResult + leiteResult;

        TextView texto = (TextView) findViewById(R.id.resultado);
        texto.setText("Arroz: " + arroz + "  Valor: R$" + arrozResult +
                "\n\nFeijão: " + feijao + "  Valor: R$" + feijaoResult +
                "\n\nLeite: " + leite + "  Valor: R$" + leiteResult +
                "\n\n\nValor total da sua compra: R$" + total);

    }
}
