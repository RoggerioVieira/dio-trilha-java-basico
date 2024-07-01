package one.digitalinnovation.gof.singleton;

/**
 * Singleton "apressado"
 * 
 * @author Rogério
 */
public class SingletonEagers {

    private static SingletonEagers instancia = new SingletonEagers();

    private SingletonEagers() {
        super();
    }

    public static SingletonEagers getInstancia() {
        return instancia;
    }
}