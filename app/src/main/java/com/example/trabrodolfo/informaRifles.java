package com.example.trabrodolfo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class informaRifles extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informa_rifles);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String arma = bundle.getString("armaEscolhida");
        String dano = bundle.getString("danoArma");
        String calibre = bundle.getString("calibreArma");
        String carregador = bundle.getString("carregadorArma");
        String modosdetiro = bundle.getString("modosdetiroArma");
        String disponivel= bundle.getString("lugarDisponivel");
        String armaesc = bundle.getString("armaesc");

        if (armaesc.equals("akm")) {
            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setBackgroundResource(R.drawable.akm);
        }
        else if (armaesc.equals("aug3")) {
            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setBackgroundResource(R.drawable.aug3);
        }
        else if (armaesc.equals("berlym762")) {
            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setBackgroundResource(R.drawable.berlym762);
        }
        else if (armaesc.equals("g36c")) {
            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setBackgroundResource(R.drawable.g36c);
        }
        else if (armaesc.equals("groza")) {
            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setBackgroundResource(R.drawable.groza);
        }
        else if (armaesc.equals("m16a4")) {
            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setBackgroundResource(R.drawable.m16a4);
        }
        else if (armaesc.equals("m416")) {
            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setBackgroundResource(R.drawable.m416);
        }
        else if (armaesc.equals("mk47mutant")) {
            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setBackgroundResource(R.drawable.mk47mutant);
        }
        else if (armaesc.equals("scarl")) {
            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setBackgroundResource(R.drawable.scarl);
        }
        else if (armaesc.equals("qbz")) {
            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setBackgroundResource(R.drawable.qbz);
        }

        TextView textViewarma = (TextView) findViewById(R.id.textViewArma);
        textViewarma.setText(arma);
        TextView textViewcalibre = (TextView) findViewById(R.id.textViewCalibre);
        textViewcalibre.setText(calibre);
        TextView textViewcarregador = (TextView) findViewById(R.id.textViewCarregador);
        textViewcarregador.setText(carregador);
        TextView textViewdano = (TextView) findViewById(R.id.textViewDano);
        textViewdano.setText(dano);
        TextView textViewdisponivel = (TextView) findViewById(R.id.textViewDisponivel);
        textViewdisponivel.setText(disponivel);
        TextView textViewmododetiro = (TextView) findViewById(R.id.textViewMododetiro);
        textViewmododetiro.setText(modosdetiro);
    }
}
