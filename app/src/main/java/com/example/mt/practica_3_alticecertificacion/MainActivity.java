package com.example.mt.practica_3_alticecertificacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {
    int[] ids = {
            R.id.btn1,
            R.id.btn2
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /**
         * RECORRIDO UTLIZADO PARA DECIRLE A CADA BOTON QUE TIENE UN LISTENER **NECESARIO**
         */
        for(int id: ids){
            findViewById(id).setOnClickListener(this);
        }

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn1:
                goActivity(MultipleLayoutPractice.class);
                break;
            case R.id.btn2:
                goActivity(ConstraintLayout.class);
                break;
        }
    }
    private void goActivity(Class <? extends  AppCompatActivity> cls){
        startActivity(new Intent(MainActivity.this,cls));
    }
}
