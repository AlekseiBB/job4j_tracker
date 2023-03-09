package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book poetry = new Book("Poetry", 101);
        Book code = new Book("Clean code", 510);
        Book novel = new Book("Novel", 705);
        Book story = new Book("Story", 180);
        Book[] books = new Book[4];
        books[0] = poetry;
        books[1] = code;
        books[2] = novel;
        books[3] = story;
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            System.out.println(bk.getName() + " - " + bk.getCount() + " pages");
         }

        System.out.println("Swap books with index 0 and 3");
        books[0] = story;
        books[3] = poetry;
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            System.out.println(bk.getName() + " - " + bk.getCount() + " pages");
        }

        System.out.println("Shown only Clean code book");
        for (int i = 0; i < books.length; i++) {
             Book bk = books[i];
            if (bk.getName().equals("Clean code")) {
                System.out.println(bk.getName() + " - " + bk.getCount() + " pages");
            }
        }
    }
}

