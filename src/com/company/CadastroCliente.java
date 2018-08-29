package com.company;
import java.util.ArrayList;
public class CadastroCliente {
    // fazer os metedos de inserir alterar deletar basicos do arraylist
    ArrayList<Cliente> lista;
    public CadastroCliente(){
        lista = new ArrayList<>();
    }
    public void inserir(Cliente c){
        lista.add(c);
    }
    public Cliente getCliente(Cliente c){ //procura o cliente pelo nome e devolve a posiçao dele na lista
        int x = lista.indexOf(c);
        if (x != -1){
          return lista.get(x);
        }else{return null;}
    }
    public Cliente pesquisaCliente(int posicao){  //perquisa o cliente em determinada posição
        return lista.get(posicao);
    }
    public int quantidadeCliente(){  //pesquisa a quantidade de clientes na lista
       return lista.size();
    }
    public void setNomeCliente(int posicao, String nome){ // Altera o nome do cliente em determinada posição
        Cliente c1 = lista.get(posicao);
        c1.setNome(nome);
        lista.set(posicao,c1);
    }
    public void setCodCliente(int posicao, int cod){// Altera o cpf do cliente em determinada posição
        Cliente c1 = lista.get(posicao);
        c1.setCod(cod);
        lista.set(posicao,c1);
    }
    public void setIdadeCliente(int posicao, int idade){// Altera a idade do cliente em determinada posição
        Cliente c1 = lista.get(posicao);
        c1.setIdade(idade);
        lista.set(posicao,c1);
    }
    public void setSexoCliente(int posicao, String sexo){// Altera o sexo do cliente em determinada posição
        Cliente c1 = lista.get(posicao);
        c1.setSexo(sexo);
        lista.set(posicao,c1);
    }
    public void removeCliente(int posicao){ //remove o objeto de uma determinada posição
        lista.remove(posicao);
    }
}
