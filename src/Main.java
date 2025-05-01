import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Forma> lista = new ArrayList<>();
        lista.add(new Circulo(6, 8, 5));
        lista.add(new Circulo(-2, 10, 7.5));
        lista.add(new Cilindro(8, -12, 6, 10));
        lista.add(new Cilindro(5, -5, 4, 6));

        for (Forma f : lista) {
            if (f instanceof Circulo) {
                System.out.println("Ciruculo: ");
            } else {
                System.out.println("Cilindro: ");
            }
            System.out.println(f);
            System.out.println("Área: " + f.calcularArea());
            if (f instanceof Cilindro) {
                System.out.println("Volume: " + ((Cilindro) f).calcularVolume());
            }
            System.out.println("--------------------------------------------------------------");
        }
    }
}