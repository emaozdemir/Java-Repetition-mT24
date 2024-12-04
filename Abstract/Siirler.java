package Abstract;
public class Siirler extends TurkKlasikleri {

    public Siirler(){
        super(); // Üst sınıfın constructor'ını çağırır
        super.enCokOkunanlar();
        super.enCokSatanlar();
    }
    public void yeniSiirMetodu() {
        System.out.println("Yeni bir şiir metodu");
    }
    
}
