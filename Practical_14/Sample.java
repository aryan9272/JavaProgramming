import java.util.Scanner;

interface Library {
    void issue(String name) throws BookException;
    void returnBook(String name);
}

class BookException extends Exception {
    BookException(String msg) {
        super(msg);
    }
}

abstract class BaseLibrary implements Library {
    int count;

    BaseLibrary(int c) {
        count = c;
    }

    public void returnBook(String name) {
        count++;
        System.out.println(name + " returned");
    }

    abstract void type();
}

class School extends BaseLibrary {

    School(int c) {
        super(c);
    }

    public void issue(String name) throws BookException {
        if (count == 0)
            throw new BookException("No books available");
        
        count--;
        System.out.println(name + " issued");
    }

    void type() {
        System.out.println("School Library");
    }
}

public class Sample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        School lib = new School(3);
        int ch;

        do {
            System.out.println("\n1.Issue 2.Return 3.Check 4.Type 5.Exit");
            ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1:
                    System.out.print("Book: ");
                    try {
                        lib.issue(sc.nextLine());
                    } catch (BookException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2:
                    System.out.print("Book: ");
                    lib.returnBook(sc.nextLine());
                    break;

                case 3:
                    System.out.println("Books left: " + lib.count);
                    break;

                case 4:
                    lib.type();
                    break;
            }

        } while (ch != 5);

        sc.close();
    }
}