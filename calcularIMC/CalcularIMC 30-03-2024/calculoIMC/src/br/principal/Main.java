package br.principal;
import java.util.List;
import br.model.Pessoa;
import br.model.Pessoa;

import java.util.ArrayList;

public class Main {
    public static void main(String [] args){
        List<Pessoa> list = new ArrayList<Pessoa>();
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        Pessoa p3 = new Pessoa();
        Pessoa p4 = new Pessoa();

        p1.setNome("Halisson");
        p1.setPeso(80);
        p1.setIdade(20);
        p1.setAltura(1.8);
        p1.clasificaSaude();

        p2.setNome("franca");
        p2.setPeso(75);
        p2.setIdade(20);
        p2.setAltura(1.9);
        p2.clasificaSaude();

        p3.setNome("martins");
        p3.setPeso(50);
        p3.setIdade(20);
        p3.setAltura(1.5);
        p3.clasificaSaude();



        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);

        for(int i = 0; i < list.size(); i++){
            list.remove(p2);
            System.out.println(list.get(i).getNome());
            System.out.println(list.get(i).getIdade());
            System.out.println(list.get(i).getPeso());
            System.out.println(list.get(i).getAltura());
            System.out.println(list.get(i).getImc());
            System.out.println(list.get(i).getEstadoSaude());
        }

        /*for (Pessoa x: list) {
            list.remove(p2); //remover
            System.out.println(x.getNome());
            System.out.println(x.getIdade());
            System.out.println(x.getPeso());
            System.out.println(x.getImc());
            System.out.println(x.getEstadoSaude());
        }*/
    }
}