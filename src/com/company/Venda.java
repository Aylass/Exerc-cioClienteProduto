package com.company;

import java.util.ArrayList;

public class Venda {
    private Cliente comprador;
    //private Date data;
    ArrayList<ItemVenda> itens;

    public Venda(){
        itens = new ArrayList<>();
    }
    public void inserir(Produto prod){
        this.inserir2(1,prod);
    }
    public void inserir2(int umaQtde, Produto prod){
        itens.add(new ItemVenda(umaQtde,prod));
    }
    public double valorTotal(){
        double total = 0;
        for (ItemVenda item: itens) {
            total = total + item.getValor();
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder rel = new StringBuilder("");
        for (ItemVenda item: itens) {
            rel.append(item.toString());
            rel.append("\n");
        }
        rel.append("\n");
        rel.append("Total : " + this.valorTotal());
        return super.toString();
    }
}
