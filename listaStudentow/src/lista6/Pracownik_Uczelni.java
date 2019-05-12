package lista6;

@SuppressWarnings("serial")
public abstract class Pracownik_Uczelni extends Osoba {
	
	private String Stanowisko_Pracy;
	
	//konstruktor domyslny
	public Pracownik_Uczelni()
	{
		this.Stanowisko_Pracy="---";
	}
	
	//konstruktor przeciazony
	public Pracownik_Uczelni(String Imie, String Nazwisko, String PESEL, int wiek, char plec, String Stanowisko_Pracy)
	{
		super(Imie,Nazwisko,PESEL,wiek,plec);		
		this.Stanowisko_Pracy=Stanowisko_Pracy;
	}
		
	
	public String getStanowisko_Pracy() {
		return Stanowisko_Pracy;
	}
	public void setStanowisko_Pracy(String stanowisko_Pracy) {
		Stanowisko_Pracy = stanowisko_Pracy;
	}
	
	
	public void Wyswietl()
	{
		super.Wyswietl();
		System.out.print("Stanowisko Pracy: " + getStanowisko_Pracy() + "\n");
	}
	
	public String toString()
	{
		return super.toString()+ this.Stanowisko_Pracy + "\t";
	}


}
