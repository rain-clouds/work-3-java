public class main {
    public static void main(String args[]) {
        System.out.println("Hello world!");
        String[] languages ={"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"};

        int n = (int) (Math.random() * 1_000_000);

        System.out.println(n);
        n*=3;
        System.out.println(n);
        n+=0b10101;//adauga 21 la el
        System.out.println(n);
        n+=0xff;//adauga 255
        System.out.println(n);
        n*=6;
        System.out.println(n);
        int suma;
        suma =0;
        while (n!=0)
        {
            suma=suma+n%10;
            n/=10;
            if(n==0&&suma>9){n=suma;suma=0;}
        }
        System.out.println(suma);

        System.out.println("Willy-nilly, this semester I will learn " + languages[suma]);
    }

}
