package tech.chauncy.demo.spbprofile;

public class Item {

	private int total;
	private String name;

	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Item [total=" + total + ", name=" + name + "]";
	}

}
