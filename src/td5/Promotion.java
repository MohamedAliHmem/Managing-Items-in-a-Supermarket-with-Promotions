package td5;
import java.time.*;
import java.time.format.*;
public interface Promotion {
	LocalDate debutPromo = LocalDate.of(2022, 03, 19);
	LocalDate finPromo = LocalDate.of(2022, 03, 31);
	//LocalDate date = LocalDate.of(2022, 03, 31);
	float prixDeVente(String dateStr);
	default boolean estPeriodePromo(String dateStr) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate date = LocalDate.parse(dateStr, formatter);
		return ( (date.isEqual(debutPromo)|| date.isAfter(debutPromo)) &&(date.isEqual(finPromo) || date.isBefore(finPromo)));
	}
	
	static double calculerRemise(double prixAvantRemise, double prixApresRemise) {
		return ( (prixAvantRemise - prixApresRemise) / prixAvantRemise)* 100;
	}
}
