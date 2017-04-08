package com.example.wesle.aplicativodeiveralda;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView quantidade;
    Button pegar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        quantidade = (TextView) findViewById(R.id.quantidade);
        pegar = (Button) findViewById(R.id.vezes);

        pegar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a;
                a = Integer.parseInt(quantidade.getText().toString());
                a++;
                quantidade.setText(String.valueOf(a));

            }
        });

    }
}
