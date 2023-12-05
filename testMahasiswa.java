class mahasiswa {
//membuat data member dari class mahasiswa
String nama;
int angkatan;
String asal;


//konstrukter
public mahasiswa(){
    nama = "sumanto";
    angkatan = 1990;
    asal = "banyuwangi";  
}

// method ubah (mengubah nama nama yang berada dalam data member)
void ubah(String nm, int ang, String asl){
    nama = nm;
    angkatan = ang;
    asal = asl;
} 
 //method untuk inisialisasi mahasiswa
void cetak(){
    System.out.println("nama : " +nama);
    System.out.println("angkatan : " + angkatan);
    System.out.println("asal : " +asal);
}

}

//class dengan nama test mahasiswa
public class testMahasiswa {
    public static void main(String[] args) throws Exception {
        //menginisialisasikan mahasiswa dengan "MHS"
        mahasiswa MHS = new mahasiswa();
        System.out.println("IDENTITAS AWAL : ");
        MHS.cetak();

        MHS.ubah( "Stanis",  2023,   "nusa kambangan");
        System.out.println("\nIDENTITAS AKHIR : ");
        MHS.cetak();

    }
}
