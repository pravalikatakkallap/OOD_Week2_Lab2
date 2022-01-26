import java.io.Serializable;

class SerializableSingleton implements Serializable {
    private static final long serialVersionUID = 8806820726158932906L;

    private static SerializableSingleton instance;

    private SerializableSingleton() {}

    public static synchronized SerializableSingleton getInstance() {
        if(instance == null) {
            instance = new SerializableSingleton();
        }
        return instance;
    }

    // implement readResolve method to return the existing instance
    protected Object readResolve() {
        return instance;
    }
}