package com.vinicius.igti_java_projetofinal;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.io.Console;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onCadastro(View view){
        Intent intent = new Intent(this, CadastroActivity.class);
        startActivity(intent);
    }

    public void onAgendarServico(View view){
        Intent intent = new Intent(this, AgendamentoActivity.class);
        startActivity(intent);
    }

    public void onAgenda(View view){
        Intent intent = new Intent(this, AgendaActivity.class);
        startActivity(intent);
    }

    public void onClientes(View view){
        Intent intent = new Intent(this, ClientesActivity.class);
        startActivity(intent);
    }
}