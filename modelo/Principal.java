/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author marlo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //INSTANCIAR 10 OBJETOS DA CLASS ALUNO USANDO O 
        //CONSTRUTOR CHEIO
        Aluno aluno01 = new Aluno(1 ,"MARLON" , "1111-1111");
        Aluno aluno02 = new Aluno(2 ,"THIAGO" , "2222-2222");
        Aluno aluno03 = new Aluno(3 ,"MATHEUS", "3333-3333");
        Aluno aluno04 = new Aluno(4 ,"LUCAS"  , "4444-4444");
        Aluno aluno05 = new Aluno(5 ,"MARCELO", "5555-5555");
        Aluno aluno06 = new Aluno(6 ,"PEDRO"  , "6666-6666");
        Aluno aluno07 = new Aluno(7 ,"JOAO"   , "7777-7777");
        Aluno aluno08 = new Aluno(8 ,"MARIA"  , "8888-8888");
        Aluno aluno09 = new Aluno(9 ,"SARA"   , "9999-9999");
        Aluno aluno10 = new Aluno(10,"FLOR"   , "1010-1010");
        
        
        //OBJETO 'listaAlunos' pertence 'a Classe ArrayList'
        //instanciando uma lista vazia que só receberá objetos da 
        //classe Aluno
        //Classe TIPADA ArrayList<T> "<T> = tipo dela"
        ArrayList<Aluno> listaAluno = new ArrayList<Aluno>();
       
        
        
        //ADICIONANDO 10 OBJETOS DA CLASSE Aluno
        //NA LISTA INSTANCIADA USANDO MÉTODO add()
        listaAluno.add(aluno01);
        listaAluno.add(aluno02);
        listaAluno.add(aluno03);
        listaAluno.add(aluno04);
        listaAluno.add(aluno05);
        listaAluno.add(aluno06);
        listaAluno.add(aluno07);
        listaAluno.add(aluno08);
        listaAluno.add(aluno09);
        listaAluno.add(aluno10);
        //listaAluno.add("aluno11"); ERROR - LISTA TIPADA NAO ACEITA STRING
        
        
        //instanciar 5 objetos da classe Aluno
        //e adicionar na listaAlunos
        //usando um laço FOR
        
        for(int i = 11; i < 16; i++){
            Aluno objAluno = new Aluno(i, "aluno"+i, "9999-99"+i);
            listaAluno.add(objAluno);
            
        }

        //SE O OBJETO FOR DEFINIDO FORA DO "FOR", TEREMOS A REFERENCIA A UM UNICO OBJETO (GLOBAL)
        
        //nesse caso teremos de colocar o objeto dentro do laço FOR
        //******* NAO POSSO DECLARAR FORA DO LAÇO *******
        for(int i = 11; i < 16; i++){
            Aluno objAluno1 = new Aluno();
            objAluno1.setIdAluno(i);
            objAluno1.setNome("aluno"+i);
            objAluno1.setCelular("9999-99"+i);
            listaAluno.add(objAluno1);
            
        }
       
        
        //LEITURA DOS OBJETOS ADCIONADOS DENTRO DA LISTA
        //USANDO O LAÇO FOR
        //método size() retorna o tamanho da lista
        //método get(index) retorna o elemento da posição INDEX
        for(int j = 0; j <listaAluno.size(); j++){
            System.out.println("Aluno: "+listaAluno.get(j).getIdAluno()+
                                   " - "+listaAluno.get(j).getNome()+
                                   " - "+listaAluno.get(j).getCelular());
        }
        
        
        //******************************************************************************************
        
        
        
        System.out.println("\n");
        System.out.println("** OTIMIZADO **");
        
        
        //******* NAO "DEVO" DECLARAR DENTRO DO LAÇO FOR *******
        Aluno objAluno = new Aluno();
        
        for(int k = 0; k <listaAluno.size(); k++){
            
            objAluno = listaAluno.get(k);
            if(objAluno.getIdAluno() == 9){
                System.out.println("ENCONTREI O/A: "+ objAluno.getNome());
            }
            System.out.println("Aluno: "+ objAluno.getIdAluno() +" - "+ objAluno.getNome()+ " - "+objAluno.getCelular());
            
        }
        
        
        
        
    }
    
}
