

class motor{
    String merk;
    int tahun;
    String noPolisi;
    String warna;
//konstruktor (menginisialisasi variabel-variabel instans dimiliki oleh objek)
    motor(String merk, int tahun, String noPolisi, String warna){
        this.merk=merk;
        this.tahun=tahun;
        this.noPolisi=noPolisi;
        this.warna=warna;
    }
//method dengan parameter tanpa return(nilai balik)
void showInfoMotor(){
    System.out.println("merk : "+this.merk);
    System.out.println("tahun : "+this.tahun);
    System.out.println("noPolisi : "+this.noPolisi);
    System.out.println("warna : "+this.warna);
    }
}

public class KelasMotorKu {
//inisialisasi dengan nama MotorKU
    public static void main(String[] args) {
        motor motorku = new motor("Suzuki", 1999, "CD 6666","pink");
        motorku.showInfoMotor();
        
    }
}