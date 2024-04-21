package com.mayconlucas.frasesdodia;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }


    //Atributos

    String[] frases = {
             "Sorria para cada desafio, pois é uma oportunidade de crescimento. ",
             "Agradeça pelas pequenas vitórias que tornam seu dia especial. ",
             "Seja a luz que ilumina o caminho dos outros hoje. ",
             "Transforme obstáculos em degraus para o sucesso. ",
             "Cultive a gratidão e veja a beleza em cada momento. ",
             "O poder da mudança está em suas mãos. Faça hoje valer a pena! ",
             "Aproveite cada respiração como uma chance de recomeçar. ",
             "Espalhe gentileza e colha sorrisos ao longo do dia. ",
             "Confie no processo e mantenha a fé no seu caminho. ",
             "Lembre-se: você é mais forte do que imagina. Avance com coragem! ",
    };

    public void gerarFrase (View view){

        TextView texto = findViewById(R.id.textFraseDoDia);
        int numeroAleatorio = new Random().nextInt(10);
        String frase = frases[numeroAleatorio];
        texto.setText(frase);

    }

    public void exibirTodas (View view){

        TextView texto = findViewById(R.id.textFraseDoDia);

        String textoResultado = "";
        for (String frase : frases ){
            textoResultado = textoResultado + "\n" + frase + "\n";
        }

        texto.setText( textoResultado );

    }

}