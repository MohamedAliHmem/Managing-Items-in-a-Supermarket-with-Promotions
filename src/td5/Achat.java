package td5;

import java.util.Scanner;

public class Achat {
	static Article [] supermarche = new Article[4];
	public static void main(String [] args) {
		supermarche[0]= new Vetement(123,"Jupe",39.000f,2,"bleue","S");
		supermarche[1]= new ProduitElec(123,"TV",1450.000f,0,"Led 80cm");
		supermarche[2]= new Vetement(178,"Pantalon",42.000f,5,"noir","M");
		supermarche[3]= new ProduitGC(191,"Pates",0.410f,18);
		float total = 0 ;
		for(int i = 0 ; i<4 ; i++) {
			Scanner sc = new Scanner(System.in);
			supermarche[i].decrire();
			System.out.println("donne la qte a acheter");
			int qte = sc.nextInt();
			
			if (supermarche[i].estDispo(qte)) {
				supermarche[i].decrire();
				System.out.println("le prixTTC : "+ supermarche[i].calculPrixTTC());
				total += supermarche[i].calculPrixTTC();
			}else {
				System.out.println("cette article est indisponible pour le moment");
				supermarche[i].decrire();
			}
		}
		System.out.println("le montant total a payer est : " + total);
	}
}
