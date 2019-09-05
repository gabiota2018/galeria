package com.example.galeria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
private ImageView imagen;
private  int orden=1;



private Button adelante;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.principal);
        imagen=findViewById(R.id.foto);
        adelante=findViewById(R.id.btAdelante);
        adelante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (orden){
                    case 1: imagen.setImageResource(R.drawable.casa2);orden++;break;
                    case 2: imagen.setImageResource(R.drawable.casa3);orden++;break;
                    case 3: imagen.setImageResource(R.drawable.casa4);orden++;break;
                    case 4: imagen.setImageResource(R.drawable.casa1);orden=1;break;
                }
            }
        });
    }
    public  void retroceder (View v){
        switch (orden){
            case 1: imagen.setImageResource(R.drawable.casa4);orden=4;break;
            case 2: imagen.setImageResource(R.drawable.casa1);orden--;break;
            case 3: imagen.setImageResource(R.drawable.casa2);orden--;break;
            case 4: imagen.setImageResource(R.drawable.casa3);orden--;break;
        }
    }
}
