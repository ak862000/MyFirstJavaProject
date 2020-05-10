import java.util.LinkedHashSet;

class Book {
    int id,quantity;
    String author,name,publisher;

    Book(int id,int quantity,String name,String author,String publisher){
        this.name=name;
        this.id=id;
        this.quantity=quantity;
        this.author=author;
        this.publisher=publisher;
    }
}

public class LinkedHashSetExp{
    public static void main(String[] args) {
        Book one=new Book(17085001,100,"Let US C","Yashwant Kanetkar","BPB");
        Book two=new Book(17085002,150,"Data Communications & Networking","Forouzan","Mc Graw Hill");
        Book three=new Book(17085003,200,"Operating System","Galvin","Wiley");

        LinkedHashSet<Book> list=new LinkedHashSet<Book>();
        list.add(one);
        list.add(two);
        list.add(three);

        for(Book b:list){
            System.out.println("id: "+b.id+", name: "+b.name+", author: "+b.author+", publisher: "+b.publisher+", quantity: "+b.quantity);
        }
    }
}
