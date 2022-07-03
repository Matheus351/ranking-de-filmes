import java.util.ArrayList;
import java.util.Scanner;



import java.util.Collections;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Matheus
 */
public class Lista  implements InterfaceExibir{
    
    private ArrayList<Filme> listaFilmes = new ArrayList<>();

    public Lista(){}
     
    public ArrayList<Filme> getLista() {
        return listaFilmes;
    }
    
    public void setLista(Filme novoFilme) {
       listaFilmes.add(novoFilme);
    }
    
    
      Scanner ler = new Scanner( System.in );
      
    @Override
    public void mostrarFilmes() {
       Collections.sort(listaFilmes);
         System.out.println("Em ranking:");
        for(int k=0;k<listaFilmes.size();k++){
         System.out.println("--------"); 
         System.out.println("Filme: "+listaFilmes.get(k).getNome());
         System.out.println("Nota: "+listaFilmes.get(k).getNota());
         System.out.println("Descrição: "+listaFilmes.get(k).getDescricao());
         System.out.println("Gênero: "+listaFilmes.get(k).getGenero());
         System.out.println("--------");
        }
    }
    
    

    @Override
    public void mostrarFilmesAcao() {
        Collections.sort(listaFilmes);
         System.out.println("Em ranking:");
        for(int k=0;k<listaFilmes.size();k++){
         if(listaFilmes.get(k).getGenero().equalsIgnoreCase("ação")){
         System.out.println("--------"); 
         System.out.println("Filme: "+listaFilmes.get(k).getNome());
         System.out.println("Nota: "+listaFilmes.get(k).getNota());
         System.out.println("Descrição: "+listaFilmes.get(k).getDescricao());
         System.out.println("Gênero: "+listaFilmes.get(k).getGenero());
         System.out.println("--------");
         }
        }
    }
    
    

    @Override
    public void mostrarFilmesAventura() {
     Collections.sort(listaFilmes);
         System.out.println("Em ranking:");
        for(int k=0;k<listaFilmes.size();k++){
         if(listaFilmes.get(k).getGenero().equalsIgnoreCase("aventura")){
         System.out.println("--------"); 
         System.out.println("Filme: "+listaFilmes.get(k).getNome());
         System.out.println("Nota: "+listaFilmes.get(k).getNota());
         System.out.println("Descrição: "+listaFilmes.get(k).getDescricao());
         System.out.println("Gênero: "+listaFilmes.get(k).getGenero());
         System.out.println("--------");
         }
        }
    }
    


      
     public void inserirFilme(String nome, int nota, String descricao, String genero){
         
         Filme novoFilme = new Filme(nome,nota,descricao,genero);
         this.setLista(novoFilme);
         
     }
     
     
    
      public Filme procurarFilme(String nome){

         for(int k=0;k<listaFilmes.size();k++){
           
           if(this.getLista().get(k).getNome().equalsIgnoreCase(nome)){
            
             return this.getLista().get(k);
             
           }
           
         }
         return null;
     }
}

