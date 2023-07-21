class MainLibrary {
  public static void main(String[] args) {
    Library library1 = new Library();
    Library library2 = new Library();

    System.out.println("---------Lib 1 info------------");
    System.out.print(library1.name); // prints the details
    System.out.print(library1.numOfBooksAvail); // prints the details

    System.out.println("---------Lib 2 info------------");
    System.out.print(library2.name); // prints the details
    System.out.print(library2.numOfBooksAvail); // prints the details

    System.out.println("---------Lib Class Info------------");
    System.out.println(Library.numOfBooksInDistrict);
    System.out.println(Library.numOfOpenLib);

  }
}