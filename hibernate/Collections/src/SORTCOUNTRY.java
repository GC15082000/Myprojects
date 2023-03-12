import java.util.Comparator;

public class SORTCOUNTRY implements Comparator<Country>{


	@Override
	public int compare(Country o1, Country o2) {
		
		return o1.counID.compareTo(o2.counID);
	}
	

}
