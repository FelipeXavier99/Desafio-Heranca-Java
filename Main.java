package ProjetoPOO;

public class Main {

    public static void main(String[] args) {

        Vendedor v1 = new Vendedor();

        Carro carro1 = new Carro();
        carro1.setDescricao("Ford ká");
        carro1.setMarcar("FORD");
        carro1.setPreco(7000);

        Carro carro2 = new Carro();
        carro2.setDescricao("Celta");
        carro2.setMarcar("CHEVROLET");
        carro2.setPreco(10000);
      
       

       // carro1.imprimir();
        v1.valorPorcenta(carro1.getPreco());
        v1.vendedorIpmrime();
        System.out.println(" ");
        // carro2.imprimir();

    }

}
