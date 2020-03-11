package com.example.holamundo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button pantalla_dos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        establecerElementos();
        ponerEnEscucha();
    }

    public void establecerElementos(){
        pantalla_dos= (Button) findViewById(R.id.boton);

    }

    public void ponerEnEscucha(){
        pantalla_dos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,Actividad2.class));
            }
        });

    }
}
