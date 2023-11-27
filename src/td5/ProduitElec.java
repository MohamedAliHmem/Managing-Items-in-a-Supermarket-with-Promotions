package td5;
import java.util.*;
public class ProduitElec extends Article implements Promotion{

	String categorie;
	
	public ProduitElec(long ref,String lib, float p,int q,String c){
		super(ref,lib,p,q);
		this.categorie = c ;
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
		return this.prixDeVente(date)*(1+this.TVA);
	}
	
	@Override
	void decrire() {
		System.out.println("la classe : "+this.getClass().getSimpleName()+", et de categorie : "+this.categorie);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
