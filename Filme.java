import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Filme  implements Comparable<Filme>{
    private String nome;
    private int nota;
    private String descricao;
    private String genero;
    
    
    public Filme(String nome,int nota,String descricao,String genero){
        this.nome = nome;
        this.nota = nota;
        this.descricao = descricao;
        this.genero = genero;
    }
    
    public Filme(){}
    
     public String getNome() {
        return nome;
    }

    public void setNome(String nom) {
        this.nome = nom;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int n) {
        this.nota = n;
        
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String desc) {
        this.descricao = desc;
    }
    
    public String getGenero(){
       return genero;    
    }
    
   public void setGenero(String gen){
       this.genero = gen;
   }

    Scanner ler = new Scanner( System.in );

   
    public void mudarNota(){
  
      System.out.println("Insira a nova nota:");
      int notaInserida = ler.nextInt();
            
      this.setNota(notaInserida);
      System.out.println("Nota alterada");
        
    }
    public void mudarDescricao(){
      
         System.out.println("Insira a nova descrição:");
         String descricaoInserida = ler.nextLine();
      
         this.setDescricao(descricaoInserida);
         System.out.println("Descrição alterada");          
    }

    @Override
    public int compareTo(Filme o) {
       return o.nota-this.nota;
    }
    
}
