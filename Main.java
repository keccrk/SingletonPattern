public class Main {
    public static void main(String[] args) {
        //Singleton sınıfının tek örneğini alın
        Singleton singleton = Singleton.getInstance();

        //Singleton sınıfının metodunu çağırın
        singleton.showMessage();
    }
}