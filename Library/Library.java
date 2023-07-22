package Library;

public class Library {

    // var
    // instance var
    public String name = "Default Library Name";
    public int numOfBooksAvail = 100;

    // static var
    public static int numOfOpenLib = 0;
    public static int numOfBooksInDistrict = 0;

    public void loanBook() {
        // this obj will decrement var value
        numOfBooksAvail--;
        // this obj will decrement class static value
        Library.numOfBooksInDistrict--;
        System.out.println("Loaned Book" + name);
    }

    public void returnBook() {
        // increment var value
        numOfBooksAvail++;
        // incremnt class static var value
        Library.numOfBooksInDistrict++;
        System.out.println("Returned book to library: " + name);
    }

    public void openPublic() {
        // increament var value
        numOfOpenLib++;
        // change class static var value
        Library.numOfBooksInDistrict += numOfBooksAvail;
        System.out.println(name + " is Open for Public");
    }

    // static mebthod allways belongh to class
    public static void checkDistLibStatus() {
        System.out.println("There's" + " " + numOfOpenLib + " " + "libraries open right now" + " " +
                Library.numOfBooksInDistrict + " " + "books available throughout the district");
    }
}
