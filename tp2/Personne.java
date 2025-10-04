package projet_java;
import java.util.GregorianCalendar;

public class Personne {
	public  static final char HOMME  = 'H'; 
	public  static final char FEMME  = 'F'; 
	
	private  String nom,prenom; 
	
	private int anne_naissiance;
	private char civilite;
	private GregorianCalendar date_naissaince ; 
	
	
	Personne(String no,String pre){
			this.nom = no ;
			this.prenom = pre;
	}
	
	Personne(char civ, String no,String pre){
		this(no,pre); 
		this.civilite = civ;
	}
	
	Personne(char civ, String no,String pre,int anne_naiss ){
		this(civ,no,pre); 
		this.anne_naissiance = anne_naiss ; 
	}
	
	Personne(char civ, String no,String pre,int anne_naiss, GregorianCalendar date_n ){
			this(civ,no,pre,anne_naiss);
			this.date_naissaince = date_n;
	}
	
	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public char getCivilite() {
		return civilite;
	}

	public GregorianCalendar getDate_naissaince() {
		return date_naissaince;
	}
	
	public int getAnne_naissiance() {
		return anne_naissiance;
	}

	public int age(int anneeCourante){
		if(this.getAnne_naissiance() > anneeCourante ){
			System.out.println("L'année courant est antéruieure de l'année de naissiance !!! ");
			return -1;
		}
		return anneeCourante-getAnne_naissiance(); 
	}
	
	public boolean plusJeune(Personne p){
		   return this.age(2025) <  p.age(2025);  
	}
	
	
	public String toString(){
		return getCivilite()+" "+getPrenom()+" "+getNom()+" "+getDate_naissaince();
	}
	

	
	
}
