class Lingkaran{
    double L;
    double K;
    double phi = 3.14;
    double r;
    
    //mengambl nilai r
    void setR(double r){
        this.r = r;
    }

    //menghitung rumus luas lingkaran
    double Luas(){
        return this.L = this.phi * this.r * this.r;
    }
    double Keliling(){
        return 2*phi*r;
    }
}
//
public class LuasKeliling {
    public static void main(String[] args) {
        Lingkaran ling = new Lingkaran();
        ling.setR(25.0);
        System.out.println("Luas Lingkaran = " + ling.Luas());   
        System.out.println("\n Keliling Lingkaran = " + ling.Keliling()); 
    }

}