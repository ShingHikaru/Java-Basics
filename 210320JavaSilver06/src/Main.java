public class Main {

    public static void main(String[] args) {
	    Item a = new Item();
	    Item b = new Item();
	    a.name = "apple";
	    b.price = 100;
	    a.price = 200;
	    b.name = "banana";
	    b = a;
	    a.printInfo();

	    Object obj = null;
		System.out.println(obj);
    }
}
