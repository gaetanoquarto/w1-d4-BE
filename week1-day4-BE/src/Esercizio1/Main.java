package Esercizio1;

public class Main {

	public static void main(String[] args) {
		
		Dipendente d1 = new Dipendente(1, Dipartimento.PRODUZIONE);
		
		
		
		d1.stampaDipendente();
		d1.promuovi();
		d1.calcolaPaga(20);
		d1.stampaDipendente();

		
	}

}
