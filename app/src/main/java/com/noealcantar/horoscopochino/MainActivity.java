package com.noealcantar.horoscopochino;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton btnBuey= (ImageButton) this.findViewById(R.id.btnBuey);
        ImageButton btnCaballo=(ImageButton) this.findViewById(R.id.btnCaballo);
        ImageButton btnCabra=(ImageButton) this.findViewById(R.id.btnCabra);
        ImageButton btnDragon=(ImageButton) this.findViewById(R.id.btnDragon);
        ImageButton btnGallo=(ImageButton) this.findViewById(R.id.btnGallo);
        ImageButton btnGato=(ImageButton) this.findViewById(R.id.btnGato);
        ImageButton btnJabali=(ImageButton) this.findViewById(R.id.btnJabali);
        ImageButton btnMono=(ImageButton) this.findViewById(R.id.btnMono);
        ImageButton btnPerro=(ImageButton) this.findViewById(R.id.btnPerro);
        ImageButton btnRata=(ImageButton) this.findViewById(R.id.btnRata);
        ImageButton btnSerpiente=(ImageButton) this.findViewById(R.id.btnSerpiente);
        ImageButton btnTigre=(ImageButton) this.findViewById(R.id.btnTigre);

        btnBuey.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(View v)
            {
                showSigno("BUEY");
            }
        });

        btnCaballo.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(View v)
            {
                showSigno("CABALLO");
            }
        });

        btnCabra.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(View v)
            {
                showSigno("CABRA");
            }
        });

        btnDragon.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                showSigno("DRAGON");
            }
        });

        btnGallo.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                showSigno("GALLO");
            }
        });

        btnGato.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                showSigno("GATO");
            }
        });

        btnJabali.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                showSigno("JABALI");
            }
        });

        btnMono.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                showSigno("MONO");
            }
        });

        btnPerro.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                showSigno("PERRO");
            }
        });

        btnRata.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                showSigno("RATA");
            }
        });

        btnSerpiente.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                showSigno("SERPIENTE");
            }
        });

        btnTigre.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                showSigno("TIGRE");
            }
        });
    }

    private void showSigno(String signo)
    {
        Intent i = new Intent(this,SignoActivity.class);

        i.putExtra("SIGNO", signo);

        this.startActivity(i);
    }


}
