import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import java.util.Comparator;

class SORTCOUNTRY1 implements Comparator<Country> {
	@Override
	public int compare(Country o1, Country o2) {

		return o1.counID.compareTo(o2.counID);
	}
}

public class Country {

	public Integer counID;
	public String counName;
	public String counPopulation;

	@Override
	public String toString() {
		return "Country [counID=" + counID + ", counName=" + counName + ", counPopulation=" + counPopulation + "]";
	}

	public Country(Integer counID, String counName, String counPopulation) {
		this.counID = counID;
		this.counName = counName;
		this.counPopulation = counPopulation;
	}

	public static void main(String... args) {
		Country c1 = new Country(3, "INDIA", "2000");
		Country c2 = new Country(1, "USA", "1900");
		Country c3 = new Country(2, "Russia", "1800");

		List l = new ArrayList();
		l.add(c1);
		l.add(c2);
		l.add(c3);

		System.out.println("BEFORE SORTING :" + l);
		Collections.sort(l, new SORTCOUNTRY1());
		System.out.println("AFTER SORTING :" + l);
	}
}
