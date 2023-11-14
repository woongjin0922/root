package Test;

public class Test {

	public static void main(String[] args) {
		Buyer buyer = new Buyer();
		buyer.buy(new Video());
		buyer.buy(new Audio());

	}

}

class Buyer {
    void buy (Product p) {
    	System.out.println(p);
     }
}

class Product{

}

class Video extends Product{
	public String toString() {
		return "Video";
	}
}

class Audio extends Product{
	public String toString() {
		return "Audio";
	}
}


