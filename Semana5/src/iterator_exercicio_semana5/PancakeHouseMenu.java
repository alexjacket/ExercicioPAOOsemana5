package iterator_exercicio_semana5;

import java.util.ArrayList;
import java.util.List;

public class PancakeHouseMenu implements Menu {
	private List<MenuItem> items = new ArrayList <> ();
	
	public Iterator createIterator() {
		return new PancakeMenuIterator(this.items);
	}

	private void addItem(String nome, String descricao, boolean vegetariano, double preco) {
		MenuItem item = new MenuItem(nome, descricao, vegetariano, preco);
		items.add(item);
	}
	public PancakeHouseMenu() {
		addItem("K&B's Pancake Breakfast", "Pancakes with Scrambled eggs and toast", true, 2.99);
		addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99);
		addItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49);
		addItem("Waffles", "Waffles, with your choice of blueberries or strawberries", true, 3.59);
	}

}
