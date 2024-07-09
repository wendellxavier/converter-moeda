package converter;
/// class real
public class Real extends Moeda {
    public Real(double valor){
        super(valor);
    }

    /// retornando o valor
    @Override
    public double converterParaReal(){
        return valor;
    }
}
