package Esercizio1;

public class GestioneDipendenti{

	public static void main(String[] args) {
		Dipendente d1 = new Dipendente(1, Livello.OPERAIO, Dipartimento.PRODUZIONE);
		Dipendente d2 = new Dipendente(2, Livello.OPERAIO, Dipartimento.PRODUZIONE);
		Dipendente d3 = new Dipendente(3, Livello.IMPIEGATO, Dipartimento.AMMINISTRAZIONE);
		Dipendente d4 = new Dipendente(4, Livello.IMPIEGATO, Dipartimento.VENDITE);
		
		d1.promuovi();
		d3.promuovi();
		
		System.out.println("--------STAMPO TUTTI I DIPENDENTI----------");
		d1.stampaDipendente();
		d2.stampaDipendente();
		d3.stampaDipendente();
		d4.stampaDipendente();
		
		System.out.println("CALCOLO TOTALE STIPENDI: ");
		System.out.printf("€%.2f %n", (d1.calcoloStipendioTotale() + d2.calcoloStipendioTotale() + d3.calcoloStipendioTotale() + d4.calcoloStipendioTotale()));
		
		
		}

	}

