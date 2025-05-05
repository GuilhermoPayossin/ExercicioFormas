import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Forma> lista = new ArrayList<>();
        lista.add(new Circulo(6, 8, 5));
        lista.add(new Circulo(-2, 10, 7.5));
        lista.add(new Cilindro(8, -12, 6, 10));
        lista.add(new Cilindro(5, -5, 4, 6));

        for (Forma f : lista) {
            System.out.println(f.getClass().getSimpleName());
            System.out.println("Área: " + f.calcularArea());
            if (f instanceof IVolume) {
                System.out.println("Volume: " + ((IVolume) f).calcularVolume());
            }
            System.out.println("--------------------------------------------------------------");
        }
    }
}