package lista6;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Kursy implements Serializable{
	
	private String Nazwa_Kursu;
	private int punktyECTS;
	//konstruktor domyslny
	public Kursy()
	{
		this.Nazwa_Kursu="---";
		this.punktyECTS=0;
	}
	
	//konstruktor przeciazony
	public Kursy(String Nazwa_Kursu, int punktyECTS)
	{
		this.Nazwa_Kursu=Nazwa_Kursu;
		this.punktyECTS=punktyECTS;
	}
	
	
	//gettery i settery
	public String getNazwa_Kursu() {
		return Nazwa_Kursu;
	}
	public void setNazwa_Kursu(String nazwa_Kursu) {
		Nazwa_Kursu = nazwa_Kursu;
	}
	public int getPunktyECTS() {
		return punktyECTS;
	}
	public void setPunktyECTS(int puntkyECTS) {
		this.punktyECTS = puntkyECTS;
	}
	
	public void Wyswietl()
	{
		System.out.println("Nazwa Kursu: " + getNazwa_Kursu() + ", punky ECTS: " + getPunktyECTS());
	}

}
