package revisao.ia;

import java.util.Scanner;
import revisao.ia.Pilha;
/**
 *
 * @author paulo
 */
public class Revisao {

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        //1
        System.out.print("Olá mundo\n");
       //2
        int vet[] = new int[10];
        System.out.print("Informe os valores do Vetor:\n");
        
        for(int i=0; i<10; i++){
            //vet[i]= ler.nextInt();
            vet[i]= i;
        }
        for(int i=0; i<10; i++){
            System.out.print(vet[i]);
            System.out.print(" ");
        }
        //3
        int mat[][] = new int [10][10];
        System.out.print("\nInforme os Valores da Matriz:\n");
        for(int i=0; i<10; i++){
            for(int j=0; j<10; j++){
                //mat[i][j]=ler.nextInt();
                mat[i][j]= j;
            }
        }
        for(int i=0; i<10; i++){
            for(int j=0; j<10; j++){
                System.out.print(mat[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    //4
        
    Pilha p = new Pilha();
    System.out.println("Informe os valores pra pilha: ");
    for(int i=0; i<10; i++){
            //p.push(ler.nextInt());
            p.push(i);
        }
    System.out.println("Os itens removidos da pilha:");
    while(p.isEmpty()==false){
        System.out.println(p.pop());
    }
    //5
    Fila f = new Fila(); 
    System.out.println("Informe os valores pra fila: ");
    for(int i=0; i<10; i++){
    //f.adicionar(ler.nextInt());
    f.adicionar(i); 
    }
    System.out.println("Os itens removidos da fila:");
    f.mostrar();
    f.remover();
    }}  
   

