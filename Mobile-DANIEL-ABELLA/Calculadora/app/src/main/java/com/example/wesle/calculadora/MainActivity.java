package com.example.wesle.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button zero, um, dois, tres, quatro, cinco, seis, sete,
            oito, nove, somar, dividir, subtrair, multiplicar, igual, limpar;

    TextView valor;

    float mValorUm, mValorDois;

    boolean adicao, subtracao, divisao, multiplicacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        zero = (Button) findViewById(R.id.zero);
        um = (Button) findViewById(R.id.um);
        dois = (Button) findViewById(R.id.dois);
        tres = (Button) findViewById(R.id.tres);
        quatro = (Button) findViewById(R.id.quatro);
        cinco = (Button) findViewById(R.id.cinco);
        seis = (Button) findViewById(R.id.seis);
        sete = (Button) findViewById(R.id.sete);
        oito = (Button) findViewById(R.id.oito);
        nove = (Button) findViewById(R.id.nove);
        somar = (Button) findViewById(R.id.soma);
        dividir = (Button) findViewById(R.id.dividir);
        subtrair = (Button) findViewById(R.id.subtrair);
        multiplicar = (Button) findViewById(R.id.multiplicar);
        igual = (Button) findViewById(R.id.igual);
        limpar = (Button) findViewById(R.id.limpar);
        valor = (TextView) findViewById(R.id.valor);

        um.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valor.setText(valor.getText()+"1");
            }
        });

        dois.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valor.setText(valor.getText()+"2");
            }
        });

        tres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valor.setText(valor.getText()+"3");
            }
        });
        quatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valor.setText(valor.getText()+"4");
            }
        });
        cinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valor.setText(valor.getText()+"5");
            }
        });
        seis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valor.setText(valor.getText()+"6");
            }
        });
        sete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valor.setText(valor.getText()+"7");
            }
        });
        oito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valor.setText(valor.getText()+"8");
            }
        });
        nove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valor.setText(valor.getText()+"9");
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valor.setText(valor.getText()+"0");
            }
        });

        somar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (valor == null){
                    valor.setText("");
                }else {
                    mValorUm = Float.parseFloat(valor.getText() + "");
                    adicao = true;
                    valor.setText(null);
                }
            }
        });

        subtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (valor == null){
                    valor.setText("");
                }else {
                    mValorUm = Float.parseFloat(valor.getText() + "");
                    subtracao = true;
                    valor.setText(null);
                }
            }
        });

        multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (valor == null){
                    valor.setText("");
                }else {
                    mValorUm = Float.parseFloat(valor.getText() + "");
                    multiplicacao = true;
                    valor.setText(null);
                }
            }
        });

        dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (valor == null){
                    valor.setText("");
                }else {
                    mValorUm = Float.parseFloat(valor.getText() + "");
                    divisao = true;
                    valor.setText(null);
                }
            }
        });


        igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValorDois = Float.parseFloat(valor.getText() + "");

                if (adicao == true){

                    valor.setText(mValorUm + mValorDois +"");
                    adicao=false;
                }


                if (subtracao == true){
                    valor.setText(mValorUm - mValorDois+"");
                    subtracao=false;
                }

                if (multiplicacao == true){
                    valor.setText(mValorUm * mValorDois+"");
                    multiplicacao=false;
                }

                if (divisao == true){
                    valor.setText(mValorUm / mValorDois+"");
                    divisao=false;
                }
            }
        });


        limpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valor.setText("");
            }
        });


    }


}
