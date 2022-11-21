package com.thaf.projetopedrapapeloutesoura;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionadoPedra(View view){

        this.escolhaUsuario("pedra");
    }

    public void selecionadoPapel(View view){

        this.escolhaUsuario("papel");
    }

    public void selecionadoTesoura(View view){

        this.escolhaUsuario("tesoura");
    }

    public void escolhaUsuario(String escolhaUsuario){

        ImageView imgResultado = findViewById(R.id.imgResultado);
        TextView txtResultado = findViewById(R.id.txtResultado);

        int num = new Random().nextInt(3);
        String[] opcao = {"pedra","papel","tesoura"};
        String escolhaApp = opcao [num];

        switch (escolhaApp){
            case "pedra":
                imgResultado.setImageResource(R.drawable.pedra);
                break;

            case "papel":
                imgResultado.setImageResource(R.drawable.papel);
                break;

            case "tesoura":
                imgResultado.setImageResource(R.drawable.tesoura);
                break;
        }

        if((escolhaApp == "tesoura" && escolhaUsuario == "papel") || (escolhaApp == "papel" && escolhaUsuario == "pedra") || (escolhaApp == "pedra" && escolhaUsuario == "tesoura")){

            txtResultado.setText("Vacê Perdeu! :(");
        }else if((escolhaUsuario == "tesoura" && escolhaApp == "papel") || (escolhaUsuario == "papel" && escolhaApp == "pedra") || (escolhaUsuario == "pedra" && escolhaApp == "tesoura")){

            txtResultado.setText("Vacê Ganhou! :)");
        }else{

            txtResultado.setText("Empate!");
        }



    }
}