package lista6;

@SuppressWarnings("serial")
public class PracownikND extends Pracownik_Uczelni {
	
	private String katedra;
	private int Dorobek_Naukowy;
	
	public PracownikND()
	{
		this.katedra="---";
		this.Dorobek_Naukowy=0;
	}
	
	public PracownikND(String Imie, String Nazwisko, String PESEL, int wiek, char plec, String Stanowisko_Pracy,int Dorobek_Naukowy, String katedra)
	{
		super(Imie,Nazwisko,PESEL,wiek,plec,Stanowisko_Pracy);
		this.katedra=katedra;
		this.setDorobek_Naukowy(Dorobek_Naukowy);
	}

	public String getKatedra() {
		return katedra;
	}

	public void setKatedra(String katedra) {
		this.katedra = katedra;
	}
	
	public int getDorobek_Naukowy() {
		return Dorobek_Naukowy;
	}
	
	public void setDorobek_Naukowy(int dorobek_Naukowy) {
		Dorobek_Naukowy = dorobek_Naukowy;
	}
	
	public void Wyswietl()
	{
		System.out.println("#Pracownik Naukowo Dydaktyczny#");
		super.Wyswietl();
		System.out.println("Katedra: " + getKatedra() + ", Dorobek naukowy: " + getDorobek_Naukowy() + "\n");
	}

	public String toString()
	{	
		return super.toString()+ this.katedra + "\t" + this.Dorobek_Naukowy;
	}

	
	
}
