import mypack.One;

public class Two {
    public static void main(String[] args) {
        One obj= One.builder().id(123).build();
        System.out.println(obj.getId());
    }
}
