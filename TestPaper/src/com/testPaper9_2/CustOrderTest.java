package com.testPaper9_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*Create a hashmap of Customer and Order and sort by ordrer price.
 * 
 */
class Customer {
	private int custId;
	private String custName;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int custId, String custName) {
		super();
		this.custId = custId;
		this.custName = custName;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + "]";
	}
}

class Order {
	private int oId;
	private String item;
	private float price;

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order(int oId, String item, float price) {
		super();
		this.oId = oId;
		this.item = item;
		this.price = price;
	}

	public int getoId() {
		return oId;
	}

	public void setoId(int oId) {
		this.oId = oId;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Order [oId=" + oId + ", item=" + item + ", price=" + price + "]";
	}
//	@Override
//	public int compareTo(Order o) {
//		// TODO Auto-generated method stub
//	    return (int) (this.price - o.price);
//	}
//	

}

class OrderPriceComparator implements Comparator<Map.Entry<Customer, Order>> {

	public int compare(Map.Entry<Customer, Order> o1, Map.Entry<Customer, Order> o2) {
        return (int) (o1.getValue().getPrice() - o2.getValue().getPrice());
    }
}

public class CustOrderTest {

	

	public static void main(String[] args) {

		HashMap<Customer, Order> custLog = new HashMap<>();

		custLog.put(new Customer(101, "John"), new Order(23, "Ink bottle", 60.0f));
		custLog.put(new Customer(104, "Mary"), new Order(13, "Tape", 45.0f));
		custLog.put(new Customer(102, "Sam"), new Order(24, "Pencil Case", 160.0f));
		custLog.put(new Customer(103, "Sandip"), new Order(63, "Stencil", 90.0f));

		System.out.println("Before sort  = ");
		for (Map.Entry<Customer, Order> co : custLog.entrySet()) {
			System.out.println(co.getKey() + " : " + co.getValue());
		}
		 List<Map.Entry<Customer, Order>> list = new ArrayList<>(custLog.entrySet());
		Collections.sort(list, new OrderPriceComparator());
		System.out.println("After sort  = ");
		 for (Map.Entry<Customer, Order> entry : list) {
	            System.out.println("Customer: " + entry.getKey().getCustName() + ", Order Price: " + entry.getValue().getPrice());
	        }

	}

}
