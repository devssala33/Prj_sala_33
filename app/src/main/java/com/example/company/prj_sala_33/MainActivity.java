package com.example.company.prj_sala_33;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.telaprincipal);
    }


//
//    CREATE TABLE `contato` (
//            `id_contato` int(11) NOT NULL,
//  `cod_contato` int(11) NOT NULL,
//  `desc_contato` text NOT NULL,
//            `descompleta` text NOT NULL,
//            `vlr_preco` decimal(10,0) NOT NULL,
//  `vlr_desconto` decimal(10,0) NOT NULL,
//  `ativo` int(11) NOT NULL)
//
//    CREATE TABLE `item` (
//            `id_item` int(11) NOT NULL,
//  `cod_item` int(11) NOT NULL,
//  `desc_item` text NOT NULL,
//            `descompleta` text NOT NULL,
//            `vlr_preco` decimal(10,0) NOT NULL,
//  `vlr_desconto` decimal(10,0) NOT NULL,
//  `ativo` int(11) NOT NULL)
//
//    CREATE TABLE `pedido` (
//            `id_pedido` int(11) NOT NULL,
//  `cod_pedido` int(11) NOT NULL,
//  `id_contato` int(11) NOT NULL,
//  `vlr_total` decimal(10,0) NOT NULL,
//  `ativo` int(11) NOT NULL,
//  `entregue` int(11) NOT NULL,
//  `contato_id_contato` int(11) NOT NULL)
//
//    CREATE TABLE `pedido_item` (
//            `id_pedido` int(11) NOT NULL,
//  `id_item` int(11) NOT NULL,
//  `qtd_item` text NOT NULL,
//            `vlr_preco` decimal(10,0) NOT NULL,
//  `vlr_total` text NOT NULL,
//            `item_id_item` int(11) NOT NULL)
//
//    CREATE TABLE `usuario` (
//            `id_usuario` int(11) NOT NULL,
//  `nome_usuario` text NOT NULL,
//            `senha_usuario` text NOT NULL,
//            `ativo` int(11) NOT NULL)

}
