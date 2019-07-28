package com.example.trabrodolfo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

public class Rifles extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rifles);
        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String arma = " ";
                String dano = " ";
                String calibre = " ";
                String carregador = " ";
                String modosdetiro = " ";
                String disponivel= " ";
                String img= "";
                if (position == 0) {
                    arma = "Arma escolhida - AKM"; dano = "Dano: 48"; calibre = "Calibre: 7.62mm"; carregador = "Pente: 30 tiros"; modosdetiro = "MDT: Semi - Auto"; disponivel = "Mapa: Em todos os mapas";
                    img = "akm";
                }
                else if (position == 1) {
                    arma = "Arma escolhida - M416"; dano = "Dano: 41"; calibre = "Calibre: 5.56 mm"; carregador = "Pente: 30 tiros"; modosdetiro = "MDT: Semi - Auto"; disponivel = "Mapa: Em todos os mapas";
                    img = "m416";
                }
                else if (position == 2) {
                    arma = "Arma escolhida - M16A4"; dano = "Dano: 41"; calibre = "Calibre: 5.56 mm"; carregador = "Pente: 30 tiros"; modosdetiro = "MDT: Semi - Burst"; disponivel = "Mapa: Em todos os mapas";
                    img = "m16a4";
                }
                else if (position == 3) {
                    arma = "Arma escolhida - Scar-L"; dano = "Dano: 41"; calibre = "Calibre: 5.56 mm"; carregador = "Pente: 30 tiros"; modosdetiro = "MDT: Semi - Auto"; disponivel = "Mapa: Erangel / Miramar";
                    img = "scarl";
                }
                else if (position == 4) {
                    arma = "Arma escolhida - Groza"; dano = "Dano: 48"; calibre = "Calibre: 7.62mm"; carregador = "Pente: 30 tiros"; modosdetiro = "MDT: Semi - Auto"; disponivel = "Mapa: Apenas em Airdrop";
                    img = "groza";
                }
                else if (position == 5) {
                    arma = "Arma escolhida - AUG"; dano = "Dano: 44"; calibre = "Calibre: 5.56mm"; carregador = "Pente: 30 tiros"; modosdetiro = "MDT: Semi - Auto"; disponivel = "Mapa: Apenas em Airdrop";
                    img = "aug3";
                }
                else if (position == 6) {
                    arma = "Arma escolhida - QBZ"; dano = "Dano: 43"; calibre = "Calibre: 5.56 mm"; carregador = "Pente: 30 tiros"; modosdetiro = "MDT: Semi - Auto"; disponivel = "Mapa: Apenas Sanhok";
                    img = "qbz";
                }
                else if (position == 7) {
                    arma = "Arma escolhida - Beryl M762"; dano = "Dano: 46"; calibre = "Calibre: 7.62 mm"; carregador = "Pente: 30 tiros"; modosdetiro = "MDT: Semi - Auto"; disponivel = "Mapa: Todos os Mapas";
                    img = "berlym762";
                }
                else if (position == 8) {
                    arma = "Arma escolhida - Mk47 Mutant"; dano = "Dano: 48"; calibre = "Calibre: 7.62mm"; carregador = "Pente: 20 tiros"; modosdetiro = "MDT: Semi - Burst"; disponivel = "Mapa: Todos os Mapas menos Vikendi";
                    img = "mk47mutant";
                }
                else if (position == 9) {
                    arma = "Arma escolhida - G36C"; dano = "Dano: 41"; calibre = "Calibre: 5.56 mm"; carregador = "Pente: 30 tiros"; modosdetiro = "MDT: Semi - Auto"; disponivel = "Mapa: Apenas Vikendi";
                    img = "g36c";
                }
                Bundle bundle = new Bundle();
                bundle.putString("armaEscolhida", arma);
                bundle.putString("danoArma", dano);
                bundle.putString("calibreArma", calibre);
                bundle.putString("carregadorArma", carregador);
                bundle.putString("modosdetiroArma", modosdetiro);
                bundle.putString("lugarDisponivel", disponivel);
                bundle.putString("armaesc", img);
                Intent intent = new Intent(getBaseContext(), informaRifles.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        };
        ListView listView = (ListView) findViewById(R.id.listViewRifles);
        listView.setOnItemClickListener(itemClickListener);
    }


}
