package td5;
import java.time.*;
public abstract class Article {
	
	protected long reference ;
	protected String libelle ;
	protected float prixHT ;
	protected int qteStock = 0 ;
	protected float TVA = 10 ;
	
	Article (long ref, String lib, float p, int q){
		this.reference = ref;
		this.libelle = lib ;
		this.prixHT = p ;
		this.qteStock = q ;
		
	}
	
	void approvisionner(int nb) {
		this.qteStock += nb ;
	}
	
	void decrire() {
		System.out.println("reference :"+ this.reference+" libelle : "+this.libelle);
	}

	abstract float calculPrixTTC(); /*{
		return this.prixHT+(this.prixHT*(this.TVA/100));
	}*/
	
	boolean appartientPromo() {
		if (this.libelle.equals("vetement") || this.libelle.equals("electronique"))
			return true ;
		return false ;
	}
	
	boolean estDispo(int qteAchat) {
		if (this.qteStock<= qteAchat)
			return true ;
		return false ;
	}
	
	
	public static void main(String[] args) {
		Instant current = Instant.now();


		System.out.println(current);
	}

}
