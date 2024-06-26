package one.digitalinnovation.gof.singleton;

/**
 * Singleton "Lazy Holder"
 * 
 * @see <@ href="https://stackoverflow.com/a/24018148">Referencia</a>
 * @author Rogério
 */
public class SingletonLazyHolder {
    private static class InstanceHolder {
    private static SingletonLazyHolder instancia = new SingletonLazyHolder();
}
    public SingletonLazyHolder(){
        super();
    } 

    public static SingletonLazyHolder getInstancia(){
        return InstanceHolder.instancia;
        }
}