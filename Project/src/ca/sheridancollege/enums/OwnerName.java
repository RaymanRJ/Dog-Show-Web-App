package ca.sheridancollege.enums;

import java.util.Random;

public enum OwnerName {
	Hal, Rona, Anitra, Jamal, Trevor, Karina, Teofila,	Bernadette, Buffy, Laurene,
	Mahalia, Gaston, Elsa, Mariann,	Velva, Stephine, Ellan, Cathleen, Tonette, Levi,
	Calandra, Harriet, Erich, Boyd, Lorenzo, Windy, Elizabet, Terra, Dreama, Glenda,
	Jaqueline, Suk,	Davina,	Sherman, Mee, Jan, Eleni, Katharyn, Dominick, Margarette,
	Loretta, Nikki, Lavonna, Cedrick, Stephanie, Regenia, Ezekiel, Zenobia, Karine,	Alexander;
	
	private static Random rand = new Random(System.currentTimeMillis());
	
	public static OwnerName getRandomOwnerName() {
		int size = OwnerName.values().length;
		
		return OwnerName.values()[rand.nextInt(size)];
	}
}