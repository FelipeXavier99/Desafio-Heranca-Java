
package ProjetoPOO;

public class Vendedor extends Concessionaria {
String nome;


  


    

//Carro C = new Carro();
double percentage;

void valorPorcenta(double valor) {
    percentage = ( valor*0.10 );
    comissaoTotal += percentage;
}




void vendedorIpmrime(){
System.out.println("Dos 10% da venda vai ganhar R$ "+percentage+"  de comissao ");

}



    void setNome(String v){
        this.nome=v;
    }

    String getNome(){
        return nome;
    }
}
