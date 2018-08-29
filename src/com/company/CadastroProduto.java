package com.company;

import java.util.ArrayList;

public class CadastroProduto {
    private ArrayList<Produto> lista;
    public CadastroProduto(){
        lista = new ArrayList<>();
    }
    public void inserir(int umCodigo, String umNome, double umPreco){
      //  lista.add(new Produto(umCodigo,umNome,umPreco)); mesma coisa que o de baixo
        Produto novo = new Produto(umCodigo,umNome,umPreco);
        lista.add(novo);
    }
    public Produto pesquisar(int cod){
//        for (int i = 0; i < lista.size(); i++){
//            Produto p = lista.get(i);
//        }
        for (Produto p: lista) {
            if (p.getCodigo() == cod) {
                return p;
            }
        }
        return null;
    }
}
