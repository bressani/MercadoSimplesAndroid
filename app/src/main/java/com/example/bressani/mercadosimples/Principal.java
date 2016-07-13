package com.example.bressani.mercadosimples;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Principal extends AppCompatActivity {

    CheckBox arroz, feijao, leite;
    public final static String codigo = "compra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        arroz = (CheckBox) findViewById(R.id.arroz);
        feijao = (CheckBox) findViewById(R.id.feijao);
        leite = (CheckBox) findViewById(R.id.leite);

        arroz.setOnClickListener(controladorArroz);
        feijao.setOnClickListener(controladorFeijao);
        leite.setOnClickListener(controladorLeite);


        final TextView editArroz = (TextView) findViewById(R.id.qtdArroz);
        editArroz.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (/*Integer.parseInt(editArroz.getText().toString())*/1 > 0)
                    arroz.setSelected(true);
                else
                    arroz.setSelected(false);

            }
        });
    }


    public void carrinho(View view) {
        Intent intent = new Intent(this, Secundaria.class);
        Bundle dados = new Bundle();
        TextView arrozView = (TextView) findViewById(R.id.qtdArroz);
        TextView feijaoView = (TextView) findViewById(R.id.qtdFeijao);
        TextView leiteView = (TextView) findViewById(R.id.qtdLeite);


        int arroz = Integer.parseInt(arrozView.getText().toString());
        int feijao = Integer.parseInt(feijaoView.getText().toString());
        int leite = Integer.parseInt(leiteView.getText().toString());
        dados.putInt("arroz", arroz);
        dados.putInt("feijao", feijao);
        dados.putInt("leite", leite);

        intent.putExtras(dados);
        startActivity(intent);
    }

    View.OnClickListener controladorArroz = new View.OnClickListener() {
        public void onClick(View v) {
            TextView view = (TextView) findViewById(R.id.qtdArroz);
            int quantidade = Integer.parseInt(view.getText().toString());

            if (quantidade == 0) {
                view.setText("1");
            } else {
                view.setText("0");
            }

        }
    };
    View.OnClickListener controladorFeijao = new View.OnClickListener() {
        public void onClick(View v) {
            TextView view = (TextView) findViewById(R.id.qtdFeijao);
            int quantidade = Integer.parseInt(view.getText().toString());

            if (quantidade == 0) {
                view.setText("1");
            } else {
                view.setText("0");
            }
        }
    };
    View.OnClickListener controladorLeite = new View.OnClickListener() {
        public void onClick(View v) {
            TextView view = (TextView) findViewById(R.id.qtdLeite);
            int quantidade = Integer.parseInt(view.getText().toString());

            if (quantidade == 0) {
                view.setText("1");
            } else {
                view.setText("0");
            }
        }
    };

}
