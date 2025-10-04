public class Calculette{
    public static void main(String[] args){
        if(args.length > 3 ){
            int ent1 = Integer.parseInt(args[0]);
            int ent2 = Integer.parseInt(args[2]);
            int res = 0;

        
        
            char op = args[1].charAt(0);

        
            switch(op){
            case '+':
                res = ent1 + ent2;
                System.out.println("resultat1: " + res);
                break; 
            case '-':
                res = ent1 - ent2;
                System.out.println("resultat2: " + res);
            
                break;
            case 'x':
                res = ent1 * ent2;
                System.out.println("resultat3: " + res);
            
                break;
            case '/':
                if( ent2 == 0){
                    System.out.println("Interdit de diviser par 0");
                }else{
                    res = ent2 / ent1; 
                }
                break;
            }
        
            System.out.println("resultat: " + res);
        }else{
            System.out.println("Peu d'argumment");
        }
       
       
        
    }

}