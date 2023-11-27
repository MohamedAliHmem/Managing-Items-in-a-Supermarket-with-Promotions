package td5;

public class ProduitGC extends Article{
	public ProduitGC(long ref, String lib, float p,int q){
		super(ref,lib,p,q);
	}

	float calculPrixTTC() {
		return super.prixHT*(1+super.TVA);
	}
	
	@Override
	void decrire() {
		System.out.println("la classe de cette article est : "+this.getClass().getSimpleName());
	}
	
	public static void main(String [] args) {
		/*Article a = new ProduitGC(22,"mm",88,44);
		a.decrire();*/
	}
}
