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

public class Page5 extends AppCompatActivity {

    Intent i;
    TextView tv_page5;
    String str_character;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_page5);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        tv_page5 =(TextView) findViewById(R.id.tv_page5);
        i = getIntent();
        str_character = i.getStringExtra("str_character");
        tv_page5.setText("Nahuli si " + str_character + " ng pulis sa isang operasyon na hindi naging matagumpay. Isang masalimuot na araw ang nagsimula ng kanyang pagbagsak mula sa posisyon ng kapangyarihan. \n\nSa kabila ng kanyang pagsurrender, hindi pa rin siya ligtas mula sa mga kalaban na naghangad ng ganti. \n\nAng pamilya ni " + str_character + "  ay nagdurusa dahil sa mga ginawa niyang desisyon. Dumanas siya ng matinding pagsisisi sa bawat hakbang na nagdala sa kanya sa kapahamakan." );
    }
    public void next(View view){
        Intent toPage6 = new Intent(this, Page6.class);
        toPage6.putExtra("str_character", str_character);
        startActivity(toPage6);
    }
    public void previous(View view){
        Intent toPage4 = new Intent(this, Page4.class);
        toPage4.putExtra("str_character", str_character);
        startActivity(toPage4);
    }
}