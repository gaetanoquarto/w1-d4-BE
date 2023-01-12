package Esercizio1;

public class Dipendente {
	private  double stipendioBase = 1000.00;
	private  int matricola;
	private  double stipendio;
	double importoOrarioStraordinario;
	private Livello jobTitle;
	Dipartimento jobArea;
	
	public Dipendente(int matricola, Dipartimento jobArea) {
		this.stipendio = stipendioBase;
		this.importoOrarioStraordinario = 30;
		this.jobTitle = Livello.OPERAIO;
		this.jobArea = jobArea;
		this.matricola = matricola;
	}
	
	public Dipendente(int matricola, Livello jobTitle, Dipartimento jobArea) {
		this.importoOrarioStraordinario = 30;
		this.stipendio = stipendioBase;
		this.matricola = matricola;
		this.jobTitle = jobTitle;
		this.jobArea = jobArea;
	}
	
	
	
	public Livello getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(Livello jobTitle) {
		this.jobTitle = jobTitle;
	}

	public  Dipartimento getJobArea() {
		return jobArea;
	}

	public void setJobArea(Dipartimento jobArea) {
		this.jobArea = jobArea;
	}

	public double getStipendioBase() {
		return stipendioBase;
	}

	public int getMatricola() {
		return matricola;
	}

	public double getStipendio() {
		return stipendio;
	}

	public double getImportoOrarioStraordinario() {
		return importoOrarioStraordinario;
	}

	public void stampaDipendente() {
		checkTitle();
		
		System.out.println("DIPENDENTE: ");
		System.out.println("Matricola: " + matricola);
		System.out.println("Stipendio: " + stipendio);
		System.out.println("Livello: " + jobTitle);
		System.out.println("Dipartimento: " + jobArea);
		System.out.println("---------------------------------------");
		
		
	}
	
	public void checkTitle() {
		
		switch(this.jobTitle) {
		
		case IMPIEGATO:
			this.stipendio = stipendioBase * 1.2;
			break;
		case QUADRO:
			this.stipendio = stipendioBase * 1.5;
			break;
		case DIRIGENTE:
			this.stipendio = stipendioBase * 2;
			break;
		default:
			this.jobTitle = Livello.OPERAIO;
			this.stipendio = stipendioBase;
			break;
		}
		
	}
	
	public void promuovi() {
		
		switch(this.jobTitle) {
		case OPERAIO:
			this.jobTitle = Livello.IMPIEGATO;
			this.stipendio = stipendioBase * 1.2;
			break;
		case IMPIEGATO:
			this.jobTitle = Livello.QUADRO;
			this.stipendio = stipendioBase * 1.5;
			break;
		case QUADRO:
			this.jobTitle = Livello.DIRIGENTE;
			this.stipendio = stipendioBase * 2;
			break;
		case DIRIGENTE:
			System.out.println("SEI GIA' IL MASSIMO ESPONENTE DI QUESTA AZIENDA!!");
			stampaDipendente();
			break;
		default:
			this.jobTitle = Livello.OPERAIO;
			this.stipendio = stipendioBase;
			break;
		}
		System.out.printf("il Dipendente è stato promosso a: " + this.jobTitle + " con lo stipendio di: €%.2f %n", this.stipendio);
		stampaDipendente();
		
	}
	
	public void calcolaPaga() {
		System.out.printf("Stipendio corrente: €%.2f %n", stipendio);
		System.out.println("---------------------------------------");
	}
	
	public void calcolaPaga(int a) {
		System.out.println("DIPENDENTE: ");
		System.out.println("matricola: " + matricola);
		System.out.println("ore di straordinari: " + a);
		System.out.printf("Stipendio complessivo di straordinari: €%.2f %n", (stipendio + (importoOrarioStraordinario * a)));
		System.out.println("---------------------------------------");
	}
	
	public double calcoloStipendioTotale() {
	return (stipendio + (importoOrarioStraordinario*5));
	}

}
