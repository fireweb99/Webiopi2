package com.example.fireweb.webiopi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageButton imbt_light=(ImageButton)findViewById(R.id.imBt_light);
        final ImageButton imbt_h=(ImageButton)findViewById(R.id.imbt_h);
        final boolean[] lightbool = {true};
        final boolean[] hbool = {true};

        imbt_light.setImageResource(R.drawable.ic_w500h5001371991666offlamp512);
        imbt_h.setImageResource(R.drawable.ic_iconoffhot);

        imbt_light.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (lightbool[0])
                    imbt_light.setImageResource(R.drawable.ic_w500h5001371991670onlamp512);

                else
                    // возвращаем первую картинку
                    imbt_light.setImageResource(R.drawable.ic_w500h5001371991666offlamp512);

                lightbool[0] = !lightbool[0];
            }

        });

        imbt_h.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                if (hbool[0])
                    imbt_h.setImageResource(R.drawable.ic_icononhot);

                else
                    // возвращаем первую картинку
                    imbt_h.setImageResource(R.drawable.ic_iconoffhot);

                hbool[0] = !hbool[0];
            }
        });
    }
}
