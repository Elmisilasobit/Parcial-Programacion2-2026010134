public class Main {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("Daniel", 1000.0, new ComisionEstandar());
        vendedor.mostrarDetalle();
    }
}
