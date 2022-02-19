/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.fatecfranca.ex0;

import javax.swing.JOptionPane;

/**
 *
 * @author ADM
 */
public class Carro {
    //declaração das variaveis
    String modelo;
    int ano;
    float velocidade;
    boolean motor;
    
    //metodos contrutores
    Carro(){}
    
    Carro(String md, int an, float ve, boolean mt){
        modelo = md;
        ano = an;
        velocidade = ve;
        motor = mt;
    }
    
    //metodos
    void ligar (){
        motor = true;
    }
    void desligar(){
        motor = false;
        velocidade = 0;
    }
    void acelerar(float x){
        velocidade += x;
    }
    void frear (float x){
        velocidade-=x;
    }
    void mostrar(){
        
        // formas de fazer a saida de dados (o null sereve pra dizer que a janela não tem pai. )
        //System.out.println("Modelo: " + modelo + "Ano: " + ano + "Velo: " + velocidade + "Motor: " + motor);
         JOptionPane.showMessageDialog(null,"Modelo: " + modelo + "Ano: " + ano + "Velo: " + velocidade + "Motor: " + motor);
    }
    
}
