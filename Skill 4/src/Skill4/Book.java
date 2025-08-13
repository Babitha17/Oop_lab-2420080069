package Skill4;

public class Book {

	
		private String title;
	    private String author;
	    private double price;
		// TODO Auto-generated method stub
	    public void setTitle(String title) {
	    	this.title=title;
	    }
	    public String getTitle() {
	        return title;
	    }
	    public void setAuthor(String author) {
	        this.author = author;
	    }
	    public String getAuthor() {
	        return author;
	    }
	    public void setPrice(double price) {
	        this.price = price;
	    }
	    public double getPrice() {
	        return price;
	    }
	    public String toString() {
	        return "Book Title: " + title + "\nAuthor: " + author + "\nPrice: ₹" + price;
	    }
	    public static void main(String[] args) {
	    	Book myBook = new Book();
	    	 myBook.setTitle("Java Programming");
	         myBook.setAuthor("James Gosling");
	         myBook.setPrice(499.99);
	         System.out.println(myBook);


	}

}
