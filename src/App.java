
import entidades.Assento;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Assento ass = new Assento();
        System.out.println(ass.mostraLugares());
        System.out.println(ass.venda(1, 1));
        System.out.println(ass.mostraLugares());
    }
}
