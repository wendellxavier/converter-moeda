package converter;
/// class moeda
abstract class Moeda {

    protected double valor;

    public Moeda(double valor){
        this.valor = valor;
    }

    ///pegando o valor
    public double getValor(){
        return valor;
    }

    public abstract double converterParaReal();

    @Override
    public String toString(){
        return String.format("moeda{valor=%.2f}", valor);
    }
    

}
