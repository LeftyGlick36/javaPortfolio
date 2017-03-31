package javaPortfolio.BasicJava;

public class MyBook extends Book {
	String t1;
	String a1;
	int price1;

	MyBook(String t, String a, int price) {
		super(t, a);
		t1 = t;
		a1 = a;
		price1 = price;
	}

	void display() {
		// TODO Auto-generated method stub
		System.out.println("Title:" + " " + t1);
		System.out.println("Author:" + " " + a1);
		System.out.println("Price:" + " " + price1);

	}

}
