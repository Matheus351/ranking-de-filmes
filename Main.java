import java.util.Scanner;
import java.util.ArrayList;
public class Main{
    
    public static void main(String[] args) {
        
        Lista objetoLista = new Lista();
        int option = 1;
        int cont=0;
        Scanner ler = new Scanner( System.in );
     do{
         System.out.println("<<MENU>>\nDigite um número para:\n 1.Adicionar um novo filme\n 2.Alterar uma nota\n 3.Para ver os filmes\n 4.Para mudar uma descrição\n 0.Para encerrar");
         option = ler.nextInt();
       switch(option){
           
         case 1:
           ler.nextLine();
          cont=cont+1;
            System.out.println("Insira um título:");
         
           String titulo = ler.nextLine();
             
            System.out.println("Insira uma descrição:");
         
            String descr = ler.nextLine();
       
            System.out.println("Insira uma nota(número inteiro):");
         
             int n = ler.nextInt();
      
             System.out.println("Qual o genero?:");
             ler.nextLine();  
             String genero = ler.nextLine();
           
             objetoLista.inserirFilme(titulo,n,descr,genero);
               
           System.out.println("Filme de "+genero+ " inserido");
          break;
           case 2:
                  System.out.println("Insira o nome do filme que quer mudar a nota:");
           
          ler.nextLine();
          String nomeDoFilme = ler.nextLine();

         
          Filme f = objetoLista.procurarFilme(nomeDoFilme);//filme encontrado
           if(f!=null){
             f.mudarNota();
           }else{
              System.out.println("Filme não encontrado");
           }
           
           
           break;
           case 3:
           
                System.out.println("Escolha uma opção:\n 1.Ver todos\n 2.Filtrar os de Aventura\n 3.Filtrar os de Ação");
                 ler.nextLine();
                 int opcao = ler.nextInt();
                 if(opcao==1){
                    objetoLista.mostrarFilmes();    
                 }
                 else if(opcao==2){
                   objetoLista.mostrarFilmesAventura();
                 }else{
                   objetoLista.mostrarFilmesAcao();
                 }
                 System.out.println("E voce inseriu "+cont+" novos filmes");
           
           break;
           case 4:
                     System.out.println("Insira o nome do filme que quer mudar a descrição:");
                      ler.nextLine();
                      nomeDoFilme = ler.nextLine();
                  
                      f = objetoLista.procurarFilme(nomeDoFilme);
                     
                      if(f!=null){
                         f.mudarDescricao();
                      }else{
                          System.out.println("Filme não encontrado");
                      }
           
           break;
               case 0:
           
                   System.out.println("Programa encerrado");
           
               break;
               default:
                System.out.println("Número inválido");
          }
     }while(option!=0);    
        
    }
}
