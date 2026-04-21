<<<<<<< HEAD
//Overriding
	

class Book{
	String title="Java Programming";

	static void pages(){
		System.out.println("Total Pages in Book:"+111);
	}
	static void display(){
		System.out.println("Hi Book Here..!");
	} 
}

class Author extends Book{
	String name="Mr.Kanetkar";

	static void totalBooks(){
		System.out.println("Total Books Written:"+15);
	}
	static void display(){
		System.out.println("Hi Author Here..!");
	}

public static void main(String[] args){
	Author a=new Author();
	a.display();
	}
=======
//Overriding
	

class Book{
	String title="Java Programming";

	static void pages(){
		System.out.println("Total Pages in Book:"+111);
	}
	static void display(){
		System.out.println("Hi Book Here..!");
	} 
}

class Author extends Book{
	String name="Mr.Kanetkar";

	static void totalBooks(){
		System.out.println("Total Books Written:"+15);
	}
	static void display(){
		System.out.println("Hi Author Here..!");
	}

public static void main(String[] args){
	Author a=new Author();
	a.display();
	}
>>>>>>> 17e715c23443bcba1805495944db943f2831d153
}