public class Main {

    public static void main(String[] args) {
        House house = new House();
        int a;
        byte b;
        b = 4;
        a = (byte) b;
        System.out.println(a);

        double d;
        int c;
        d = 4.3;
        c = (int) d;
        System.out.println(c);

        int i = 1000010000 + 2000050000;{             //переполнение
            System.out.println(i);
        }

    }

    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    static {
    String str = "Добрый день";

    str = reverse(str);

    System.out.println("Реверс: "+str);
    }
}

