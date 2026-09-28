public class Main {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("Daniel", 2000.0, new ComisionEstandar());
        vendedor.mostrarDetalle();
    }
}
