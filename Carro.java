package ProjetoPOO;

public class Carro {

   public  Carro() {

   }


   private String descricao, marca;
	private double preco;
	


    void imprimir(){

   System.out.println("  Modelo: "+getDescricao()+
    "\n  Marca: "+getMarca()+
    "\n  Preço Atual: "+getPreco ()   );

    }

    void  setDescricao(String desc){

        this.descricao=desc;
    }

    String getDescricao(){
        return descricao;
    }


    void  setMarcar(String marc){

        this.marca=marc;
    }

    String getMarca(){
        return marca;
    }



void setPreco(double prec ){
    this.preco=prec;

}

double getPreco(){

    return preco; 
}



    
}
