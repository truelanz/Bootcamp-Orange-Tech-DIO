package padroesgof;

/**
 * Singleton Eager "Apressado".
 * Instancia antes de retornar;
 */

public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia() {
        return instancia;
    }
    
}
