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

public class Page2 extends AppCompatActivity {

    Intent i;
    TextView tv_page2;
    String str_character;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_page2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        tv_page2 = (TextView) findViewById(R.id.tv_page2);
        i = getIntent();
        str_character = i.getStringExtra("str_character");
        tv_page2.setText("Sa isang baryo, isang 16-anyos na batang si " + str_character + " ang nalulong sa masamang bisyo dahil sa kahirapan. Hindi siya nakatakas sa mga tukso ng kalsada at mga barkadang may masamang impluwensiya. \n\nHindi niya iniwan ang kanyang pamilya kahit madalas silang magtalo.  Ang buhay ni " + str_character + " ay puno ng kalungkutan at pakiramdam ng kawalan. Pero sa likod ng lahat ng ito, umaasa pa siyang balang araw ay makakawala sa ganitong buhay.");
    }
    public void next(View view){
        Intent toPage3 = new Intent(this, Page3.class);
        toPage3.putExtra("str_character", str_character);
        startActivity(toPage3);
    }
    public void previous(View view){
        Intent homePage = new Intent(this, MainActivity.class);
        homePage.putExtra("str_character", str_character);
        startActivity(homePage);
    }
}