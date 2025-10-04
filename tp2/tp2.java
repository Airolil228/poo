package projet_java;
import java.util.Calendar;
import java.util.GregorianCalendar;
import static java.lang.System.out;

public class tp2 {
		public static void main(String[] args) {
			
			Personne p1 = new Personne(Personne.HOMME, "Badis", "Benamraoui", 2003, new GregorianCalendar(2023,Calendar.MARCH,12)); 
			Personne p2 = new Personne(Personne.HOMME, "Nizar", "B'adach", 1990, new GregorianCalendar(1990,Calendar.MARCH,12)); 
			
			System.out.println(p1.plusJeune(p2));
			
			
			
			
		}
}
