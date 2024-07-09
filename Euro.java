package converter;
///class euro
public class Euro  extends Moeda{

    public Euro(double valor){
        super(valor);
    }
    ///retornando e somando o valor com 5.55
    @Override
    public double converterParaReal(){
        return valor * 5.55;
    }
    
}
