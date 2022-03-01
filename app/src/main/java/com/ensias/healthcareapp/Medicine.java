package com.ensias.healthcareapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Medicine extends AppCompatActivity {

    ImageView ferikind;
    ImageView dolo;
    ImageView cofsil;
    ImageView cherry1;
    ImageView crocin;
    ImageView zinco;
    ImageView vitamin_c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicine);

        ferikind= findViewById(R.id.ferikind);
        dolo= findViewById(R.id.dolo);
        cofsil= findViewById(R.id.cofsil);
        cherry1= findViewById(R.id.cherry1);
        crocin= findViewById(R.id.crocin);
        zinco= findViewById(R.id.zinco);
        vitamin_c= findViewById(R.id.vitamin_c);
        dolo= findViewById(R.id.dolo);


        ferikind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.apollopharmacy.in/otc/ferikind-tablet");
            }
        });

        dolo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.apollopharmacy.in/otc/dolo-650mg-tablet-15-s");
            }
        });

        cofsil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.apollopharmacy.in/otc/cofsils-naturals-cough-syrup-100ml");
            }
        });

        cherry1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.apollopharmacy.in/medicine/chericof-syrup-60ml");
            }
        });

        zinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.apollopharmacy.in/otc/zincovit-tablet");
            }
        });

        crocin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.apollopharmacy.in/otc/crocin-pain-relief-tablet");
            }
        });

        vitamin_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.apollopharmacy.in/otc/limcee-500mg-tablet");
            }
        });
    }



    private void gotoUrl(String s) {
        Uri uri= Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

}