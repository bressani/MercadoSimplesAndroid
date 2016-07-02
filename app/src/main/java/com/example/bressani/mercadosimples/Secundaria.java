package com.example.bressani.mercadosimples;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

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

        int Rarroz, Rfeijao, Rleite;
        int arrozResult, feijaoResult, leiteResult;

        arrozResult = arroz * 10;
        feijaoResult = feijao * 500;
        leiteResult = leite * 5;

        AlertDialog.Builder dialogo = new AlertDialog.Builder(Secundaria.this);

        int total = arrozResult + feijaoResult + leiteResult;
        dialogo.setTitle("Compra");
        dialogo.setMessage("O valor total da compra é: R$" + total);
        dialogo.setNeutralButton("Ok", null);
        dialogo.show();

    }
}
