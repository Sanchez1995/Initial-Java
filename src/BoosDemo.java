public class BoosDemo {

    public static void main(String[] args) {
        String [] books = new String[5];
        books [0] = "Effective Java";
        books [1] = "Head First Java";
        books [2] = "Java: All-In-One Java";
        books [3] = "Java: The Ultimate Guide to Learn";
        books [4] = "Learn Java in One Day";
        for (String book: books) {
            System.out.println(book);
        }
    }
}
