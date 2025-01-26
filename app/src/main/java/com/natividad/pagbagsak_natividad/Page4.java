package com.natividad.pagbagsak_natividad;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Page4 extends AppCompatActivity {
    Intent i;
    TextView tv_page4;
    String str_character;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_page4);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        tv_page4 =(TextView) findViewById(R.id.tv_page4);
        i = getIntent();
        str_character = i.getStringExtra("str_character");
        tv_page4.setText("Isang araw, napasok sila ng mga kalaban sa isang operasyon na nauwi sa trahedya. Ang kanyang mga kasama ay nasugatan at si " + str_character + " mismo ay sugatan sa laban. \n\nHabang nagpapagaling, nagsimulang magduda siya kung ito pa nga ba ang tamang landas. Ang mga desisyon ni " + str_character + " ay nagiging pabigat sa kanyang konsensya, ngunit wala siyang magawa. \n\nNatutunan niyang wala nang daan pabalik, at ang bawat hakbang ay palapit sa kapahamakan.");
    }
    public void next(View view){
        Intent toPage5 = new Intent(this, Page5.class);
        toPage5.putExtra("str_character", str_character);
        startActivity(toPage5);
    }
    public void previous(View view){
        Intent toPage3 = new Intent(this, Page3.class);
        toPage3.putExtra("str_character", str_character);
        startActivity(toPage3);
    }
}