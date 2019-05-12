package lista6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.HashSet;



public class Glowna {
	
 

	public static void main(String[] args) {
		
		
		
		ArrayList<Osoba> listaOsob = new ArrayList<Osoba>();
		
		
		Student o1 = new Student("c", "Kowalski", "98110604674", 12, 'M', 236405, false);
		PracownikA o2= new PracownikA("b", "owalski", "45827582961", 20, 'M', "Szatnia", "B1");
		PracownikND o3 = new PracownikND("a", "fuch", "64228456547", 52, 'M', "Profesor Zwyczajny", 15, "Informatyki");
		Student o4 = new Student("piotr", "Kowalski", "4576767", 25, 'M', 236405, true);		
				
		listaOsob.add(o1);
		listaOsob.add(o2);
		listaOsob.add(o3);
		listaOsob.add(o4);
		
		Kursy kurs1 = new Kursy("Algebra",3);
		Kursy kurs2 = new Kursy("Analiza",4);
	
		
		((Student)listaOsob.get(0)).Dodaj_Kurs(kurs1);
		((Student)listaOsob.get(0)).Dodaj_Kurs(kurs2);
		
		/*
		 * wyszukiwanie osoby
 				
		try
		{
			Wyszukaj("Kowalski",listaOsob);
			
		} catch (IllegalArgumentException e)
		{
			e.printStackTrace();
		}
		*/
						
		
		//DodajOsobeDoListy(listaOsob);
						
		
		//Zapisz(listaOsob);
		//Odczytaj(listaOsob);
		
		//sortowanieNazwiskoImie(listaOsob);
				
				
		//usuwanieNazwisko(listaOsob);
		
		/* 
		 * usuwanie powtarzajacych sie Studentow kolekcja HashSet
		 * 
		HashSet<Student> studenci = new HashSet<Student>();
	
		studenci.add(o1);
		studenci.add(o4);
		
		System.out.println(studenci);
        */
	}
	
	public static void Wyszukaj(String nazwisko, ArrayList<Osoba> listaOsob) throws IllegalArgumentException
	{
		for(int i=0; i<listaOsob.size(); i++)
		{
			if(listaOsob.get(i).getNazwisko().equals(nazwisko))
			{
				System.out.println(listaOsob.get(i));
				if(listaOsob.get(i).getWiek()<18) throw new IllegalArgumentException("Osoba jest niepelnoletnia");
			} 
		}
		
	}
	
	public static void WyszukajStudenta(int nrIndeksu,ArrayList<Osoba> listaOsob) throws IllegalArgumentException
	{
		
		for(int i=0;i<listaOsob.size();i++)
		{
			if(listaOsob.get(i) instanceof Student && ((Student)listaOsob.get(i)).getNrIndeksu() == nrIndeksu)
			{
				System.out.println(listaOsob.get(i));
				if(listaOsob.get(i).getWiek()<18) throw new IllegalArgumentException("Osoba jest niepelnoletnia");
			}
		}
		
	}
	
	public static void WyszukajPracownikaND(int dorobekNaukowy, ArrayList<Osoba> listaOsob) throws IllegalArgumentException
	{
		for(int i=0;i<listaOsob.size();i++)
		{
			if(listaOsob.get(i) instanceof PracownikND && ((PracownikND)listaOsob.get(i)).getDorobek_Naukowy()>dorobekNaukowy)
			{
				System.out.println(listaOsob.get(i));
				if(listaOsob.get(i).getWiek()<18) throw new IllegalArgumentException("Osoba jest niepelnoletnia");
			}
		}
	}
	
	public static void DodajOsobeDoListy(ArrayList<Osoba> listaOsob)

	{
		System.out.println("Wybierz osobe do dodania\n 1.Student \n 2.Pracownik Naukowo Dydaktyczy "
				+ "\n 3.Pracownik Administracyjny");
		
		int typOsoby=0;
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		boolean czyPoprawny=false;
		
		while(!czyPoprawny)
		{
			if(input.hasNextInt())
			{
				
				typOsoby=input.nextInt();
				input.nextLine();
				if(typOsoby>=1 && typOsoby<=3)
				{
					czyPoprawny = true;
				}
				else
				{
					System.out.println("Wprowadzono niepoprawna wartosc");					
				}
				
			}
			else
			{
				System.out.println("Wprowadzono niepoprawna wartosc");
				input.nextLine();
			}
		}
																						
		
		String imie,nazwisko,pesel,stanowiskoPracy,katedra,budynek;

		int wiek,nrIndeksu,dorobekNaukowy;
		wiek=nrIndeksu=dorobekNaukowy=0;
		char plec='-';
		boolean Erasmus=false;
		
	   
		
		switch(typOsoby){
		case 1:
			System.out.println("Podaj imie: ");
			imie=input.nextLine();
			
			System.out.println("Podaj nazwisko: ");
			nazwisko=input.nextLine();
			
			System.out.println("Podaj PESEL: ");
			pesel=input.nextLine();
			
			System.out.println("Podaj wiek: ");
			wiek=0;
			czyPoprawny=false;
			
			while(!czyPoprawny)
			{
				if(input.hasNextInt())
				{					
					wiek=input.nextInt();
					czyPoprawny=true;
				}
				else
				{
					System.out.println("Wprowadzono niepoprawna wartosc");
					input.nextLine();
				}
			}
			
			
			System.out.println("Podaj plec (M/K): ");
			plec=input.next().charAt(0);
			
			System.out.println("Podaj nr indeksu: ");
			
			czyPoprawny=false;
		
			while(!czyPoprawny)
			{
				if(input.hasNextInt())
				{					
					nrIndeksu=input.nextInt();
					czyPoprawny=true;
				}
				else
				{
					System.out.println("Wprowadzono niepoprawna wartosc");
					input.nextLine();
				}
			}
			
			System.out.println("Podaj czy osoba jest na Erasmusie(true/false): ");
			Erasmus=input.nextBoolean();
			
			
			Student student= new Student(imie, nazwisko, pesel, wiek, plec, nrIndeksu, Erasmus);
	
			listaOsob.add(student);
			
			break;
		case 2:
			System.out.println("Podaj imie: ");
			imie=input.nextLine();
			
			System.out.println("Podaj nazwisko: ");
			nazwisko=input.nextLine();
			
			System.out.println("Podaj PESEL: ");
			pesel=input.nextLine();
			
			System.out.println("Podaj wiek: ");
			wiek=0;
			czyPoprawny=false;
			
			while(!czyPoprawny)
			{
				if(input.hasNextInt())
				{					
					wiek=input.nextInt();
					czyPoprawny=true;
				}
				else
				{
					System.out.println("Wprowadzono niepoprawna wartosc");
					input.nextLine();
				}
			}
			
			
			System.out.println("Podaj plec (M/K): ");
			plec=input.next().charAt(0);
			input.nextLine();
			
			System.out.println("Podaj stanowisko pracy: ");
			stanowiskoPracy=input.nextLine();
			
			
			System.out.println("Podaj wartosc dorobku naukowego: ");
			
			czyPoprawny=false;
			while(!czyPoprawny)
			{
				if(input.hasNextInt())
				{					
					dorobekNaukowy=input.nextInt();	
					czyPoprawny=true;
				}
				else
				{
					System.out.println("Wprowadzono niepoprawna wartosc");
					input.nextLine();
				}
			}
			
			System.out.println("Podaj katedre pracownika: ");
			katedra=input.nextLine();
			
			PracownikND pracownikND = new PracownikND(imie, nazwisko, pesel, wiek, plec,stanowiskoPracy, dorobekNaukowy, katedra);
			
			listaOsob.add(pracownikND);
		
			break;
			
		case 3:
			System.out.println("Podaj imie: ");
			imie=input.nextLine();
			
			System.out.println("Podaj nazwisko: ");
			nazwisko=input.nextLine();
			
			System.out.println("Podaj PESEL: ");
			pesel=input.nextLine();
			
			System.out.println("Podaj wiek: ");
			wiek=0;
			czyPoprawny=false;
			
			while(!czyPoprawny)
			{
				if(input.hasNextInt())
				{					
					wiek=input.nextInt();
					czyPoprawny=true;
				}
				else
				{
					System.out.println("Wprowadzono niepoprawna wartosc");
					input.nextLine();
				}
			}
			
			
			System.out.println("Podaj plec (M/K): ");
			plec=input.next().charAt(0);
			input.nextLine();
			
			System.out.println("Podaj stanowisko pracy: ");
			stanowiskoPracy=input.nextLine();
			
			System.out.println("Podaj budynek pracownika: ");
			budynek=input.nextLine();
			
			PracownikA pracownikA = new PracownikA(imie, nazwisko, pesel, wiek, plec,stanowiskoPracy,budynek);
			listaOsob.add(pracownikA);
					
			break;
		
		
		default:
			break;
				
		}
		
		for(int i=0;i<listaOsob.size();i++)
		{
			System.out.println(listaOsob.get(i));
		}
	}

	public static void Zapisz(ArrayList<Osoba> listaOsob)
	{
		ObjectOutputStream so = null;		
		
		try
		{						
			so = new ObjectOutputStream(new FileOutputStream("listaOsob.ser"));
			so.writeObject(listaOsob);		
			
		} catch (Exception e) // moze wyrzucic nam IOException lub FileNotFoundException
		{
			e.printStackTrace();
		}
		
		finally
		{
			if(so!=null)
			{
				try
				{
					so.close();	
				} catch (IOException e)
				{
					e.printStackTrace();
				}
			}			
		}															
	}
		
	@SuppressWarnings("unchecked")
	public static void Odczytaj(ArrayList<Osoba> listaOsob) 
	{
		ObjectInputStream is = null;
		ArrayList<Osoba> listaPomocnicza = new ArrayList<Osoba>();	
		try
		{			
			is = new ObjectInputStream(new FileInputStream("listaOsob.ser"));
			listaPomocnicza=(ArrayList<Osoba>)is.readObject();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(is!=null)
			{
				try
				{
					is.close();
				}catch(IOException e)
				{
					e.printStackTrace();
				}
			}
		}
				
		for(int i=0;i<listaPomocnicza.size();i++)
		{
			System.out.println(listaPomocnicza.get(i));
		}
	}
	
	public static void sortowanieNazwisko(ArrayList<Osoba> listaOsob)
	{
		OsobaCompareNazwisko comparator = new OsobaCompareNazwisko();
		
		Collections.sort(listaOsob,comparator);
		
		for(int i=0;i<listaOsob.size(); i++)
		{
			System.out.println(listaOsob.get(i));
		}
		
	}
		
	public static void sortowanieNazwiskoWiek(ArrayList<Osoba> listaOsob)
	{
		OsobaCompareNazwiskoWiek comparator = new OsobaCompareNazwiskoWiek();
		sortowanieNazwisko(listaOsob);
        
		Collections.sort(listaOsob,comparator);
		
		for(int i=0;i<listaOsob.size(); i++)
		{
			System.out.println(listaOsob.get(i));
		}
		
		
	}
	
	public static void sortowanieNazwiskoImie(ArrayList<Osoba> listaOsob)
	{
		sortowanieNazwisko(listaOsob);
		OsobaCompareNazwiskoImie comparator = new OsobaCompareNazwiskoImie();
		
		Collections.sort(listaOsob,comparator);
		
		for(int i=0;i<listaOsob.size(); i++)
		{
			System.out.println(listaOsob.get(i));
		}
	}
	
	public static void usuwanieNazwisko(ArrayList<Osoba> listaOsob)
	{
		System.out.println("Podaj naziwsko osoby, krora chcesz usunac z listy:");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		String nazwisko = input.next();
		
		for(int i=0; i<listaOsob.size(); i++)
		{
			if(listaOsob.get(i).getNazwisko().equals(nazwisko)) listaOsob.remove(i);
		}
		
		for(int i=0;i<listaOsob.size(); i++)
		{
			System.out.println(listaOsob.get(i));
		}
		
	}
	   
    
}
