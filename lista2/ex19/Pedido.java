package ex19;

import java.util.ArrayList;

public class Pedido {
	private ArrayList<Item> itens;

	public Pedido() {
		this.itens = new ArrayList<Item>();
	}
	
	public void adicionaItem(Item item) {
		this.itens.add(item);
	}

}
