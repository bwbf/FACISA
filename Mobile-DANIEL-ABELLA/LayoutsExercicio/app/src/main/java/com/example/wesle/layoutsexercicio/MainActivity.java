package com.example.wesle.layoutsexercicio;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {

    Button btnLinear;
    Button btnFrame;
    Button btnRelative;
    Button btnTable;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnRelative = (Button) findViewById(R.id.btnRelative);
        btnLinear = (Button) findViewById(R.id.btnLinear);
        btnTable = (Button) findViewById(R.id.btnTable);

        btnRelative.setOnClickListener(this);
        btnLinear.setOnClickListener(this);
        btnTable.setOnClickListener(this);
    }

    @Override
    //Grid Layout é a MainActivity
    public void onClick(View v) {
            if(v == btnRelative) {
                startActivity(new Intent(this, RelativeLayout.class));
            } else if(v == btnTable) {
                startActivity(new Intent(this, TableLayout.class));
            } else if(v == btnLinear) {
                startActivity(new Intent(this, LinearLayout.class));
            }
    }

}
