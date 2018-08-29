package com.company;

public class Main {

    public static void main(String[] args) {
	    CadastroProduto cadProd = new CadastroProduto();
	    cadProd.inserir(21,"Lápis 1hb",1.50);
        cadProd.inserir(22,"Caneta Vermelha",3);
        cadProd.inserir(23,"Recarga Caneta",10);

        Venda venda1 = new Venda();
        Produto prod = cadProd.pesquisar(22);

        if(prod != null){
            venda1.inserir2(3,prod);
        }

        prod = cadProd.pesquisar(21);

        if (prod != null) {
            venda1.inserir(prod);
        }
        //System.out.println(); falta escrever isso aqui

    }
}
