public class RechcercheDicho{
    /*
     * @author Vasily SOMSAATH
     * @version 0.00001
     */
    public static void main(String[] args){
        int[] tab  = {-1,2,4,5,6,8,9,12};

        int cible = Integer.parseInt(args[0]);
        int debut = 0;
        int fin = tab.length-1;
        boolean flag = false;
        
        int moite = 0;
        
        while( debut <= fin){
            moite = (debut+fin)/2;
            
            if(cible == tab[moite]){
                flag = true; 
                break; 
            }
            if(cible > tab[moite] ){
                debut = moite+1;
            }else{
                fin = moite-1;
            }

            
        }   

        System.out.println("Trouver ? :" + flag ); 
    }
}