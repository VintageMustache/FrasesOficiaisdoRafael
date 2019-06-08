package com.example.frasesoficiaisdorafael;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void gerarNovafrase(View view ){
        String[] frasesdoRafael ={
                "Eu tenho cara de puta é?",
                "Por caso eu tenho cara de alguma profissional do sexo?",
                "Boa tarde, pessoas",
                "Boa noite, pessoas",
                "Olá, meus queridos",
                "Eu lhe disse o que, meu querido?",
                "Pesadississimo",
                "Isso ai foi no mínimo pesado",
                "Perai, que eu tô sentindo a gravidade pesar aqui!",
                "Top, Top, Top, Top, Top, Top, Top, Top, Top ",
                "Eu não gosto dela",
                "É um prazer quase que sexual pra mim dizer isso",
                "Ritalina, Ritalina",
                "To com fome",
                "A fé sem Obras é morta",
                "Meu PC é uma bosta, mas depois que eu formatei ele ta lindo",
                "Eu consegui passar um mês sem xingar",
                "Fala, meu querido",
                "Man, se mate",
                "Man",
                "I don't say anything",
                "you cego, filho da puta"

        };

        int num = new Random(). nextInt(frasesdoRafael.length);
        TextView texto = findViewById(R.id.textResult);
        texto.setText( frasesdoRafael [num] );

    }
}
