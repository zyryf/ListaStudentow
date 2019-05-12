package lista6;

@SuppressWarnings("serial")
public class PracownikA extends Pracownik_Uczelni{
	
	private String budynek;
	
	public PracownikA()
	{
		this.budynek=null;
	}
	
	public PracownikA(String Imie, String Nazwisko, String PESEL, int wiek, char plec, String Stanowisko_Pracy, String budynek)
	{
		super(Imie,Nazwisko,PESEL,wiek,plec,Stanowisko_Pracy);
		this.budynek=budynek;
	}

	public String getBudynek() {
		return budynek;
	}

	public void setBudynek(String budynek) {
		this.budynek = budynek;
	}
	
	public void Wyswietl()
	{
		System.out.println("#Pracownik Administracyjny#");
		super.Wyswietl();
		System.out.println("Budynek: " + getBudynek() + "\n");
	}
	
	public String toString()
	{
		return super.toString()+ this.budynek ;
	}

}
