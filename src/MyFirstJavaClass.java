public class MyFirstJavaClass {

    public static void main(String[] args) {
        String s="This is my first time on IntelliJ" , st="   kumar   ";
        System.out.println("Testing"+" Abhishek");
        System.out.println(17085004);
        for(String s1:s.split("\\s",4))
            System.out.println(s1);
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(st);
        System.out.println(st.trim());
        char ch[]=s.toCharArray();
        for (char c:ch)
            System.out.print(c+" ");
        System.out.println();
        System.out.println(String.valueOf(ch));



    }

}
