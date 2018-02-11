package com.example.company.prj_sala_33.views;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.ShareCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.company.prj_sala_33.R;

public class MainActivity extends AppCompatActivity {
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.telalogin);

        //somente para testes
        context = getBaseContext();
        Intent intent = new Intent(context, LoginActivity.class);
        startActivity(intent);


        finish();

    }
}
