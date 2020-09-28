/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisao.ia;

/**
 *
 * @author paulo
 */
public class Pilha {
    
    public Object[] vetor;
    public int ponteiro;
    
    
    //construtor
    public Pilha(){
        this.ponteiro=-1; // pilha vazia
        this.vetor=new Object[10]; //posiçoes
    }
    // se ta vazio
    public boolean isEmpty(){
        if(this.ponteiro==-1){
            return true;
        }
        return false;
    }
    //tamanho
    public int size(){
        if(this.isEmpty()){
            return 0;
        }
        return this.ponteiro+1;
    }
    public Object pop(){
        if(isEmpty()){
            return null;
        }
        return this.vetor[this.ponteiro--];
    }
    public void push(Object valor){
        if(this.ponteiro < this.vetor.length-1){
            this.vetor[++ponteiro]=valor;
        }
    }
    
}
