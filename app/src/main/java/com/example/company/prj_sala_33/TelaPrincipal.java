package com.example.company.prj_sala_33;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Thassiano Soares on 10/02/2018.
 */

public class TelaPrincipal extends AppCompatActivity{

   //******* DECLARAÇÕES DE VARIAVÉIS *******\\
    Context context;
    private Button telaprincipal_btn_card;
    private Button telaprincipal_btn_pedido;
    private Button telaprincipal_btn_servico;
    private Button telaprincipal_btn_historico;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.telaprincipal);

        iniciarVariaveis();
        executarAcao();

    }

    private void iniciarVariaveis() {
        context = getBaseContext();

        telaprincipal_btn_card = findViewById(R.id.telaprincipal_btn_card);

        telaprincipal_btn_pedido = findViewById(R.id.telaprincipal_btn_pedido);

        telaprincipal_btn_servico = findViewById(R.id.telaprincipal_btn_servico);

        telaprincipal_btn_historico = findViewById(R.id.telaprincipal_btn_historico);
    }

    private void executarAcao() {
        abrirTelaCardapio();
        abrirTelaPedido();
        abrirTelaServicos();
        abrirTelaHistorico();
    }


    private void abrirTelaCardapio() {
        //******* ABRIR TELA DE CARDÁPIIO *******\\
        telaprincipal_btn_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abrir = new Intent(context, TelaCardapio.class);
                startActivity(abrir);

            }
        });
    }


    private void abrirTelaPedido() {
        //******* ABRIR TELA DE PEDIDOS *******\\
        telaprincipal_btn_pedido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abrir = new Intent(context, TelaPedido.class);
                startActivity(abrir);

            }
        });
    }

    private void abrirTelaServicos() {
        //******* ABRIR TELA DE SERVICOS *******\\
        telaprincipal_btn_servico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abrir = new Intent(context, TelaServicos.class);
                startActivity(abrir);

            }
        });
    }

    private void abrirTelaHistorico() {
        //******* ABRIR TELA DE HISTORICO *******\\
        telaprincipal_btn_historico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abrir = new Intent(context, TelaHistorico.class);
                startActivity(abrir);

            }
        });
    }
}
