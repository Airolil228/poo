public class Moyenne{
    public static void main(String[] args){

        int somme = 0;
        float res;
            
        for( int i = 0; i < args.length ; i++){
            somme += Integer.parseInt(args[i]); 
        }

        
        System.out.println("Moyenne : " + (float)somme/(float)args.length );
        
    }
}