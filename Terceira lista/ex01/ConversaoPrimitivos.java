package ex01;

/*1 - Crie um arquivo chamado ConversaoPrimitivos.java. Para eliminar os erros de compilação,
complete os espaços marcados por “xxxxx” do código abaixo quando necessário.

public class ConversaoPrimitivos {
 public static void main(String[] args) {
 int a = 10;
 long b = xxxxx a;
 int c = xxxxx b;
 float d = xxxxx b;
 short e = xxxxx a;
 double f = xxxxx d;
 Long g = xxxxx b;
 long h = xxxxx g;

 System.out.println(a);
 System.out.println(b);
 System.out.println(c);
 System.out.println(d);
 System.out.println(e);
 System.out.println(f);
 System.out.println(g);
 System.out.println(h);
 }
}
 */

// Gabriel Apolinário Fabrício
public class ConversaoPrimitivos {
    public static void main(String[] args) {
        int a = 10;
        long b = (long) a;
        int c = (int) b;
        float d = (float) b;
        short e = (short) a;
        double f = (double) d;
        long g = (long) b;
        long h = (long) g;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
    }
}
