package converter;
///class dolar
public class Dolar  extends Moeda{
    
    public Dolar(double valor){
        super(valor);
    }
    /// retornando o valor e somando 5.0 a conta
    @Override
    public double converterParaReal(){
        return valor * 5.0;
    }
}
