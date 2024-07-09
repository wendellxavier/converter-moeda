package converter;

import java.util.ArrayList;
import java.util.List;
///class cofre
public class Cofrinho{
   private List<Moeda> listarMoeda;

   public Cofrinho(){
    this.listarMoeda = new ArrayList<>();
   }
///adicionando a moeda
    public void adicionar(Moeda moeda){
        listarMoeda.add(moeda);
    }
///removendo a moeda
    public void remover(Moeda moeda){
        listarMoeda.remove(moeda);
    }
///listando a moeda
    public void listar(){
        if (listarMoeda.isEmpty()){
            System.out.println("Está vazio");
        } else {
            System.out.println("moeda no cofre: ");
            for (Moeda moeda : listarMoeda){
                System.out.println(moeda);
            }
        }
        
    }
//calculo da moeda
    public double calcularTotal(){
        double total = 0;
        for (Moeda moeda: listarMoeda){
            total += moeda.converterParaReal();
        }

        return total;
    }
//pegando a moeda
    public ArrayList<Moeda> getMoedas(){
        return new ArrayList<>(listarMoeda);
    }


}
