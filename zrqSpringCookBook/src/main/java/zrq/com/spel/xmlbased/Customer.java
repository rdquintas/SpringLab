package zrq.com.spel.xmlbased;

public class Customer {

	private Item item;
	private String itemName;

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	@Override
	public String toString() {
		return this.item.getName() + " | " + this.itemName;
	}

}