public class Singleton {
    //Singleton sınıfının tek örneği
    private static Singleton instance;

    //Özel constructor, böylece sınıf dışından bu sınıfın örneği oluşturulamaz
    private Singleton(){
        //Özel yapıcı
    }

    //Tek örneği almak için kullanılan metod

    public static Singleton getInstance(){
        if(instance == null){
            synchronized (Singleton.class) {
                if(instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
    //Örnek metod
    public void showMessage(){
        System.out.println("This is Singleton.");
    }
}
