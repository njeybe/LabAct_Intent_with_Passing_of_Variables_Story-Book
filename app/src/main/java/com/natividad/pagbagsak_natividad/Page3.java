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

public class Page3 extends AppCompatActivity {

    Intent i;
    TextView tv_page3;
    String str_character;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_page3);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        tv_page3 = (TextView) findViewById(R.id.tv_page3);

        i = getIntent();
        str_character = i.getStringExtra("str_character");
        tv_page3.setText("Dahil sa takot at respeto sa kanya, nagsimula si " + str_character + "  manguna sa gang ng mga kabataan. Mabilis niyang nakuha ang tiwala ng kanyang mga kasama dahil sa tapang at talino. \n\nMinsan, nagiging lider si " + str_character + " sa mga malalaking laban at operasyon. Habang lumalaki ang kanyang kapangyarihan, nawawala ang takot na nararamdaman niya noong una. \n\nAng kanyang mundo ay nagiging mas madilim at puno ng karahasan.");
    }
    public void next(View view){
        Intent toPage4 = new Intent(this, Page4.class);
        toPage4.putExtra("str_character", str_character);
        startActivity(toPage4);
    }
    public void previous(View view){
        Intent toPage2 = new Intent(this, Page2.class);
        toPage2.putExtra("str_character", str_character);
        startActivity(toPage2);
    }
}