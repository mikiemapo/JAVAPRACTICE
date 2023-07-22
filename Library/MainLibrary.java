package Library;

class MainLibrary {
  public static void main(String[] args) {
    Library library1 = new Library();
    Library library2 = new Library();

    library2.openPublic();
    library2.openPublic();

    System.out.println("---------Lib 1 info------------");
    System.out.println(library1.name); // prints the details
    System.out.println(library1.numOfBooksAvail); // prints the details

    System.out.println("---------Lib 2 info------------");
    System.out.println(library2.name); // prints the details
    System.out.println(library2.numOfBooksAvail); // prints the details

    System.out.println("--------Loan Out Books ---------");
    library1.loanBook();
    library2.loanBook();
    library2.loanBook();
    library2.loanBook();
    library2.loanBook();
    library1.loanBook();
    library1.loanBook();

    System.out.println("--------Returned Books ---------");
    library1.returnBook();
    library1.returnBook();

    System.out.println("---------Lib Class Info------------");
    Library.checkDistLibStatus();

  }
}