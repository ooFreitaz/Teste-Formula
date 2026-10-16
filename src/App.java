public class App {
    public static void main(String[] args) throws Exception {
        Camisas c1 = new Camisas('M');
        System.out.println("Tamanho da camisa: " + c1.getTamanho());

        Bones b1 = new Bones("Azul");
        System.out.println("Cor do boné: " + b1.getCor());
    }
}
