package lt.viko.eif.GJ;

/**
 * Class for creating data of libraries elements
 */
public class Data {

    private Libraries libraries = new Libraries();

    /**
     * Method which creates Objects author, book, employee, library.
     * Add authors to Book objects, books and employees' to Library objects and library to libraries list
     * @return libraries   object with edited list of library
     */
    public Libraries create(){

        try{
            Author author1 = new Author("Dovydas", "Dovydaitis");
            Author author2 = new Author("Lukas", "Lukaitis");
            Author author3 = new Author("Domas", "Domaitis");
            Author author4 = new Author("Vytenis", "Vytauskas");
            Author author5 = new Author("Juozapas", "Juozapaitis");
            Author author6 = new Author("Minde", "Mindaugas");

            Book book1 = new Book("Isradimai", "1995/11/11", 200, "Moksline");
            book1.addAuthor(author1);
            book1.addAuthor(author2);
            Book book2 = new Book("Atradimai", "2001/01/13", 200, "Mistine");
            book2.addAuthor(author3);
            book2.addAuthor(author4);
            Book book3 = new Book("Praradimai", "2011/09/21", 200, "Fantastine");
            book3.addAuthor(author5);
            book3.addAuthor(author6);

            Employee emp1 = new Employee("Petras", "Petraitis", "Male", 38);
            Employee emp2 = new Employee("Jonas", "Jonaitis", "Male", 48);
            Employee emp3 = new Employee("Ona", "Onute", "Female", 45);
            Employee emp4 = new Employee("Lina", "Linute", "Female", 51);

            Library lib1 = new Library("M.K.Ciurlionio bib.", "Varena", "Lasives g. 1");
            lib1.addBook(book1);
            lib1.addBook(book3);
            lib1.addEmployee(emp1);
            lib1.addEmployee(emp3);

            Library lib2 = new Library("Miesto bib.", "Vilnius", "Gedimino g. 91A");
            lib2.addBook(book2);
            lib2.addBook(book3);
            lib2.addEmployee(emp2);
            lib2.addEmployee(emp4);

            libraries.addLibrary(lib1);
            libraries.addLibrary(lib2);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        return libraries;
    }
}
