package td5;

import java.util.Scanner;

public class Vetement extends ProduitGC implements Promotion{
	String couleur ;
	String taille;
	
	public Vetement(long ref, String lib, float p,int q,String c,String t){
		super(ref,lib,p,q);
		this.couleur = c ;
		this.taille = t ;
	}
	@Override
	void decrire() {
		super.decrire();
		System.out.println("de couleur : "+this.couleur+", et de taille : "+this.taille);
	}
	
	public float prixDeVente(String dateStr) {
		if(estPeriodePromo(dateStr))
			return(float) (this.prixHT*0.3);
		return(float) (this.prixHT);
	}
	
	float calculPrixTTC() {
		Scanner sc = new Scanner(System.in);
		System.out.println("donne la date sous la forme suivante yyyy-mm-dd");
		String date = sc.nextLine();
		return this.prixDeVente(date)+(this.prixDeVente(date)*(this.TVA/100));
	}
	
	public static void main(String [] args) {
		/*Article a = new Vetement(44,"ll",55,77,"bleu",155);
		System.out.println(a.calculPrixTTC());*/
	}
}
