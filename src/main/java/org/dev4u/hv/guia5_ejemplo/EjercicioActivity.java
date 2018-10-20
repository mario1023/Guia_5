package org.dev4u.hv.guia5_ejemplo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class EjercicioActivity extends AppCompatActivity {


    ImageView imgizquierda,imgcentro,imgderecha;
    Button btnIzquierda,btnnCentro,btnDerecha;
    Animation animacionCoronas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio);

        this.btnIzquierda = findViewById(R.id.btnIzquierda);
        this.btnnCentro = findViewById(R.id.btnCentro);
        this.btnDerecha = findViewById(R.id.btnDerecha);
        this.imgizquierda = findViewById(R.id.imgizquierda);
        this.imgcentro = findViewById(R.id.imgcentro);
        this.imgderecha = findViewById(R.id.imgderecha);

        animacionCoronas = AnimationUtils.loadAnimation(this,R.anim.ejercicio_anim);
        animacionCoronas.setDuration(1150);
        //animacionCoronas.setFillAfter(true);

        btnIzquierda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Toast.makeText(EjercicioActivity.this,"Boton izquierdo",Toast.LENGTH_SHORT).show();
                imgizquierda.startAnimation(animacionCoronas);
            }
        });

        btnnCentro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //  Toast.makeText(EjercicioActivity.this,"Boton centro",Toast.LENGTH_SHORT).show();
                imgcentro.startAnimation(animacionCoronas);
            }
        });

        btnDerecha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //  Toast.makeText(EjercicioActivity.this,"Boton derecho",Toast.LENGTH_SHORT).show();
                imgderecha.startAnimation(animacionCoronas);
            }
        });
    }
}
