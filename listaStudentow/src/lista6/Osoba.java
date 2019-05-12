package lista6;

import java.io.Serializable;


@SuppressWarnings("serial")
public abstract class Osoba implements Serializable{
	private String Imie;
	private String Nazwisko;
	private String PESEL;
	private int Wiek;
	private char plec;
	
	//konstruktor domyslny
	public Osoba()
	{
		this.Imie=null;
		this.Nazwisko=null;
		this.PESEL=null;
		this.Wiek=0;
		this.plec='-';
	}
		
	
	//konstruktor przeciazony
	public Osoba(String Imie, String Nazwisko, String PESEL, int wiek, char plec)
	{
		this.Imie=Imie;
		this.Nazwisko=Nazwisko;
		this.PESEL=PESEL;
		this.Wiek=wiek;
		this.plec=plec;
	}
		
	//gettety i settery
	public String getImie() {
		return Imie;
	}
	public void setImie(String imie) {
		Imie = imie;
	}
	public String getNazwisko() {
		return Nazwisko;
	}
	public void setNazwisko(String nazwisko) {
		Nazwisko = nazwisko;
	}
	public String getPESEL() {
		return PESEL;
	}
	public void setPESEL(String pESEL) {
		PESEL = pESEL;
	}
	public int getWiek() {
		return Wiek;
	}
	public void setWiek(int wiek) {
		this.Wiek = wiek;
	}
	public char getPlec() {
		return plec;
	}
	public void setPlec(char plec) {
		this.plec = plec;
	}
	
	public void Wyswietl()
	{
		System.out.println("Imie: " + getImie() + ", Nazwisko: " + getNazwisko()+", PESEL: " + getPESEL()
		+ ", wiek: " + getWiek() + ", plec: " + getPlec());
	}
	
	public String toString()
	{
		return this.Imie + "\t" + this.Nazwisko + "\t" + this.PESEL + "\t" + this.plec + "\t" + this.Wiek + "\t";
	}
	
}	
	
