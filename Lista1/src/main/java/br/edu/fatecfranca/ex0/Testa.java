
package br.edu.fatecfranca.ex0;

import javax.swing.JOptionPane;


public class Testa {

   
    public static void main(String[] args) {
        //System.out.println("Hoje é sexta feira!!"); comando para exibir um comando
        
        //criando um objeto da classe Carro
        Carro obj1 = new Carro();
        //obj1.modelo = "Onix";quando eu defino o valor da variavel
        obj1.modelo = JOptionPane.showInputDialog("Informe Modelo");//quando eu peço parao usuário inserir a informação
        
        //obj1.ano =2019;quando eu defino o valor da variavel
        obj1.ano =Integer.parseInt(JOptionPane.showInputDialog("Informe o ano:"));//quando eu peço parao usuário inserir a informação
        
        //obj1.velocidade = 0;quando eu defino o valor da variavel
        obj1.velocidade = Float.parseFloat(JOptionPane.showInputDialog("Informe a velocidade:"));//quando eu peço parao usuário inserir a informação
        
        //obj1.motor = false;quando eu defino o valor da variavel
        int resp = JOptionPane.showConfirmDialog(null, "Criar carro com motor ligado?");
        obj1.motor =(resp == JOptionPane.OK_OPTION);//objeto vai receber o valor da variavel resp
        
        obj1.mostrar();
        
        obj1.ligar();
        obj1.mostrar();
        obj1.acelerar(80);
        obj1.mostrar();
        obj1.frear(20);
        obj1.mostrar();
        obj1.desligar();
        obj1.mostrar();
        
        // metodo construtor, quando você ja tem os objetos declarados e quer apenas inicializar novos valores
        Carro obj2 = new Carro("Palio",2012,0,false);       
    }
}
