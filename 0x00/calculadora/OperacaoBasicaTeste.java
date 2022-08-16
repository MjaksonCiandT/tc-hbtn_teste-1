public class OperacaoBasicaTeste {

    static double resultado = OperacaoBasica.somar(5, 3);

    public static boolean testar_soma() {
        if (resultado == 8) {
            return true ;
        }
        return false ;
    }

    public static  boolean testar_subtracao(){
        resultado = OperacaoBasica.subtrair(5,3);
        if (resultado ==2 ){
            return true ;
        }
        return false ;
    }

    public static  boolean testar_multiplicacao(){
        resultado = OperacaoBasica.multiplicar(5,3);
        if (resultado == 15){
            return true ;
        }
        return false ;
    }
    public static  boolean testar_divisao(){
        resultado = OperacaoBasica.dividir(9,3);
        if (resultado == 3){
            return true ;
        }
        return false ;
    }
}
