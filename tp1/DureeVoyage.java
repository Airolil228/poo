public class DureeVoyage{
    public static void main(String[] args){

        int h1 = Integer.parseInt(args[0]);
        int h2 = Integer.parseInt(args[2]);

        int m1 = Integer.parseInt(args[1]);
        int m2 = Integer.parseInt(args[3]);
        
        int debut = (h1*60)+m1;
        int fin = (h2*60)+m2;

        int duree = fin-debut;

        
        if (duree < 0) {
            duree += 24 * 60;
        }
       
        
        int resh = duree / 60;
        int resm =  duree % 60;
        

        
        
        System.out.println("Durée du voyage: "+ resh + " h " + resm); 
    }

}
