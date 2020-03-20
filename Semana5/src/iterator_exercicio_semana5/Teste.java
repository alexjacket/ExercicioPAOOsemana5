package iterator_exercicio_semana5;

public class Teste {

	public static void main(String[] args) {
		PancakeHouseMenu phm = new PancakeHouseMenu();
		DinerMenu dm = new DinerMenu();
		Atendente atendente = new Atendente (phm, dm);
		atendente.printMenu();
	}

}
