public class Somme{
    public static void main(String[] args){
       int somme = 0; 
       
       for(int i = 0; i < args.length ; i++){
           somme += Integer.parseInt(args[i]); 
       }

       System.out.println("La somme est: " + somme ); 
    }
}