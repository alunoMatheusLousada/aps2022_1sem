package negocio.estrategias;

/**
 *
 * @author iapereira
 */
public class PAC implements CalculoDeFrete{

    @Override
    public double calculaFrete(int distancia) {
        return distancia*0.5 + 100;
    }
    
}
