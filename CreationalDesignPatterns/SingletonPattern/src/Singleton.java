public class Singleton {
    // Singleton sınıfının tek örneği
    private static Singleton instance;

    // Constructor'ı private yaparak dışarıdan erişimi engelliyoruz
    private Singleton() {}

    // Singleton örneğini döndüren public bir metod
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}