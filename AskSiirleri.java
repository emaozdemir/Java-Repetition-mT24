public class AskSiirleri extends Siirler{
    public AskSiirleri() {
        super(); // Siirler sınıfının constructor'ını çağırır
        System.out.println("Ask Siirleri constructor çağrıldı");
    }

    public void askSiiriMetodu() {
        super.yeniSiirMetodu(); // Siirler sınıfındaki metodu çağırır
    }

    // Main metodu

    public static void main(String[] args) {
        AskSiirleri askSiirleri = new AskSiirleri();
        askSiirleri.askSiiriMetodu();
    }
}

