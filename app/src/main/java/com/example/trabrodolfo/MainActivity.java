package com.example.trabrodolfo;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void telaRifles(View v) {
        Intent intent = new Intent(this, Rifles.class);
        startActivity(intent);
    }

    public void telaSnipers(View v) {

        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Informações Insuficientes:");
        builder.setMessage("Ainda não há informações completas, deseja continuar na tela inicial?");

        DialogInterface.OnClickListener btnSim = new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            }
        };
        DialogInterface.OnClickListener btnNao = new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent(getApplicationContext(), Snipers.class);
                startActivity(intent);
            }
        };
        builder.setNegativeButton("Não", btnNao);
        builder.setPositiveButton("Sim", btnSim);
        builder.create().show();

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel channel = new NotificationChannel("1234", "meu_canal", NotificationManager.IMPORTANCE_DEFAULT);
            NotificationManager canaldenotificação = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
            canaldenotificação.createNotificationChannel(channel);
        };
        NotificationCompat.Builder builder2 = new NotificationCompat.Builder(this, "1234");
        builder2.setSmallIcon(R.drawable.error);
        builder2.setContentTitle("Divergência");
        builder2.setContentText("O aplicativo não pode abrir essa tela ainda");
        builder2.setPriority(NotificationCompat.PRIORITY_DEFAULT);

        NotificationManager canaldenotificação = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        canaldenotificação.notify(254524, builder2.build());
    }

    public void mostrarToast(View v) {
        Toast.makeText(getApplicationContext(), "Ainda estamos trabalhando nisso...", Toast.LENGTH_LONG).show();
    }



}
