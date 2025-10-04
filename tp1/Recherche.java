public class Recherche{
    public static void main(String[] args){
        int[] tab = {45,56,78,96,12,55,12,474};
        boolean trouve = false;
        
        int cible = Integer.parseInt(args[0]);
        for(int i = 0; i < tab.length; i++){
            if( cible == tab[i]){
                trouve = true ;
                break;
            }
        }

        System.out.println("trouvé ? : " + trouve); 
    }
}