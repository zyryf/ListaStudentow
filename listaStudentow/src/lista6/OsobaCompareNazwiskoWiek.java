package lista6;

import java.util.Comparator;

public class OsobaCompareNazwiskoWiek implements Comparator<Osoba>
{
    
	@Override
	public int compare(Osoba o1, Osoba o2) {
		if(o1.getNazwisko().equals(o2.getNazwisko())&& o1.getWiek()< o2.getWiek()) return -1;
		if(o1.getNazwisko().equals(o2.getNazwisko())&& o1.getWiek()> o2.getWiek()) return 1;
		return 0;
	}
	
}