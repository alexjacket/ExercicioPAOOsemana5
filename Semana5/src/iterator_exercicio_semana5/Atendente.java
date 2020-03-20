package iterator_exercicio_semana5;

public class Atendente {
	private Menu pancakeHouseMenu;
	private Menu dinerMenu;

	public Atendente(Menu pancakeHouseMenu, Menu dinerMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
	}

	public void printMenu (Iterator iterator) {
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	
	public void printMenu () {
		printMenu (pancakeHouseMenu.createIterator());
		printMenu (dinerMenu.createIterator());
	}
}
	
	
	
	
	
	
	

	
	
	
	
	
	

