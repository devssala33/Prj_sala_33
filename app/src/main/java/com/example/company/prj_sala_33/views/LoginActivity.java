package com.example.company.prj_sala_33.views;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.company.prj_sala_33.R;

/**
 * Created by milton on 10/02/2018.
 */

public class LoginActivity extends AppCompatActivity {

    Context context;
    private EditText et_login;
    private EditText et_senha;
    private Button btn_logar;
    private Button btn_cancelar;
    private String mensagem;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.telalogin);

        initVars();
        initActions();
    }


    /*
    * metodo para iniciar as variaveis
     */

    private void initVars() {
        context = getBaseContext();
        et_login = findViewById(R.id.telalogin_et_login);
        et_senha = findViewById(R.id.telalogin_et_senha);
        btn_logar = findViewById(R.id.telalogin_btn_logar);
        btn_cancelar = findViewById(R.id.telalogin_btn_cancelar);

    }

    /**
     * metodo para iniciar ações
     */
    private void initActions() {

        btn_logar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(validacao()){
                    logar();
                }else{
                    exibirErro(mensagem);
                }
            }
        });

        btn_cancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                limparFormulario();
            }
        });

    }
    private void limparFormulario() {
        et_login.setText("");
        et_senha.setText("");
        et_login.requestFocus();
    }

    private void logar() {
        Intent intent = new Intent(context, TelaPrincipal.class);

        startActivity(intent);
    }

    private void exibirErro(String mensagem) {
        Toast.makeText(context, mensagem, Toast.LENGTH_SHORT).show();
    }

    private boolean validacao() {
        String login = et_login.getText().toString().trim();
        String senha = et_senha.getText().toString().trim();

        mensagem = "";

        if(login.length() == 0){
            mensagem = "Erro nome é obrigatorio";
            return false;
        }

        if(senha.length() == 0){
            mensagem = "Erro senha é obrigatoria";
            return false;
        }

        if (!(login.equals("admin") && senha.equals("admin"))){

            mensagem = "Usuario ou senha incorretos";
            return false;
        }

        return true;
    }
}
