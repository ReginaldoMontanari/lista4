package com.example.exaula2708;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.TestLooperManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText edNum01, edNum02;
TextView txResultado;
Button btSomar, btSubtrair, btMultiplicar, btDividir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        carregaWidgets();
        somar();
        subtrair();
        multiplicar();
        dividir();
//Testes github
        
    }
    private void carregaWidgets(){
        edNum01=(EditText)findViewById(R.id.edtNum01);
        edNum02=(EditText)findViewById(R.id.edtNum02);
        txResultado=(TextView)findViewById(R.id.txtReseultado);
        btSomar=(Button)findViewById(R.id.btnSomar);
        btSubtrair=(Button)findViewById(R.id.btnSubtrair);
        btMultiplicar=(Button)findViewById(R.id.btnMultiplicar);
        btDividir=(Button)findViewById(R.id.btnDividir);
    }

    private void somar(){
        btSomar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
              Integer n1, n2, total;
              n1 = Integer.valueOf(edNum01.getText().toString());
              n2 = Integer.valueOf(edNum02.getText().toString());
              total = n1 + n2;
              txResultado.setText(total.toString());
          }
        });
    }

    private void subtrair(){
        btSubtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer n1, n2, total;
                n1 = Integer.valueOf(edNum01.getText().toString());
                n2 = Integer.valueOf(edNum02.getText().toString());
                total = n1 - n2;
                txResultado.setText(total.toString());
            }
        });
    }

    private void multiplicar(){
        btMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer n1, n2, total;
                n1 = Integer.valueOf(edNum01.getText().toString());
                n2 = Integer.valueOf(edNum02.getText().toString());
                total = n1 * n2;
                txResultado.setText(total.toString());
            }
        });
    }

    private void dividir(){
        btDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer n1, n2, total;
                n1 = Integer.valueOf(edNum01.getText().toString());
                n2 = Integer.valueOf(edNum02.getText().toString());
                total = n1 / n2;
                txResultado.setText(total.toString());
            }
        });
    }
}