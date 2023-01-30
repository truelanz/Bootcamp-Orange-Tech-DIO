package edu.truelanz.padroesgof;

/**
 * Singleton "Lazy Holder".
 * @see <a href = "https://stackoverflow.com/a/24018148">Referencia<\a>
 */

public class SingletonHolder {
    
    private static class InstanceHolder {
    public static SingletonHolder instancia = new SingletonHolder();
    }

    private SingletonHolder() {
        super();
    }

    public static SingletonHolder getInstancia() {
        return InstanceHolder.instancia;
    }
    
}
