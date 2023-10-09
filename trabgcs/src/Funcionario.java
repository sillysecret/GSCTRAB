public class Funcionario {
     private String nome; 
     private Tipofunc Tipo; 
     private int id; 
     
     public Funcionario(){} 
     
     public Funcionario(String nome,Tipofunc tipo, int id) { 
        this.id = id;
        this.Tipo = tipo; 
        this.nome = nome;
     }

     enum Tipofunc {
        Funcionario, 
        Administrador
     }
}