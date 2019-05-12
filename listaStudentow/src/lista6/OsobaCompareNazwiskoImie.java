package lista6;
import java.util.Comparator;
public class OsobaCompareNazwiskoImie implements Comparator<Osoba>
{

	@Override
	public int compare(Osoba o1, Osoba o2) {
		if(o1.getNazwisko().equals(o2.getNazwisko()))
		{
			return o1.getImie().compareTo(o2.getImie());
		}									
				
		return 0;
	}

}
