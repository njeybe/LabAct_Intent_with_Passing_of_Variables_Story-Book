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

public class Page6 extends AppCompatActivity {
    Intent i;
    TextView tv_page6;
    String str_character;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_page6);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        tv_page6 =(TextView) findViewById(R.id.tv_page6);
        i = getIntent();
        str_character = i.getStringExtra("str_character");
        tv_page6.setText("Sa isang engkwentro, hindi nakaligtas ang batang lider na si " + str_character + ".  Binaril siya ng mga nakalaban nilang gang bilang ganti. Sa kabila ng lahat ng pangarap na hindi natupad, nagwakas ang kanyang kwento sa isang madugong gabi. \n\nSa murang edad, siya’y naging bahagi ng isang masalimuot na kwento ng karahasan. Hindi na siya nagkaroon ng pagkakataon na makapagbagong buhay.");
    }
    public void next(View view){
        Intent homePage = new Intent(this, MainActivity.class);
        startActivity(homePage);
    }
    public void previous(View view){
        Intent toPage5 = new Intent(this, Page5.class);
        toPage5.putExtra("str_character", str_character);
        startActivity(toPage5);
    }
}