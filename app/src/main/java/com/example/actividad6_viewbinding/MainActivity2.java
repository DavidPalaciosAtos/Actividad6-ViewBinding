package com.example.actividad6_viewbinding;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.actividad6_viewbinding.databinding.ActivityMain2Binding;

public class MainActivity2 extends AppCompatActivity {

    private ActivityMain2Binding enlace;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        enlace = ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(enlace.getRoot());

        enlace.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (enlace.imagenfrag.getVisibility()== View.VISIBLE){
                    enlace.imagenfrag.setVisibility(View.INVISIBLE);
                }else{
                    enlace.imagenfrag.setVisibility(View.VISIBLE);
                }
            }
        });

    }
}