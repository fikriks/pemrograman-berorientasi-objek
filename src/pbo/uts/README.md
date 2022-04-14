# Ujian Tengah Semester 2 (Genap) (14 April 2022)

## Soal

    Buat penggunaan inheritance dan polimorphisme menggunakan java!

    a. Untuk input atribut gunakan konstraktor
    b. Class Fakultas (class parent) dimana didalamnya terdapat
    atribut : kode_fakultas, nama_fakultas

    method : kerja() dengan behavior : “memonitoring penyelenggaraan kegiatan di program studi”, tampil_data() dengan behavior : tampilkan seluruh isi atribut dari class Fakultas

    c. Class Prodi (class child) dimana didalamnya terdapat
    Atribut : kode_prodi, nama_prodi, akreditasi_prodi

    method : kerja() dengan behavior : “penyelenggara teknis kegiatan KBM di lingkungan program studi”, tampil_data() dengan behavior : tampilkan seluruh isi atribut dari class Fakultas

    d. Buat 2 objek dari class prodi dengan isian sebagai berikut :
    Objek 1 dengan nama data_prodi_1 : Kode Fakultas : 1, Nama Fakultas : FKOM, Kode Prodi : 08, Nama Prodi : Teknik Informatika, Akreditasi : B

    Objek 2 dengan nama data_prodi_2 : Kode Fakultas : 1, Nama Fakultas : FKOM, Kode Prodi : 09, Nama Prodi : Sistem Informasi, Akreditasi : B

    e. Dari kasus di atas, tuliskan yang termasuk ke dalam polymorphisme dan jelaskan!

## Jawaban

    b. public class Fakultas {

    public String kode_fakultas, nama_fakultas;

    public Fakultas(String kode_fakultas, String nama_fakultas) {

         this.kode_fakultas = kode_fakultas;

         this.nama_fakultas = nama_fakultas;

    }

    public String getKodeFakultas() {

        return kode_fakultas;

    }

    public String getNamaFakultas() {

        return nama_fakultas;

    }

    public void kerja() {

        System.out.println("Memonitoring penyelenggaraan kegiatan program studi");

    }

    public void tampil_data() {

        System.out.println("Kode Fakultas : "+ this.getKodeFakultas());

        System.out.println("Nama Fakultas : "+ this.getNamaFakultas());

    }

    }

    c. public class Prodi extends Fakultas {
        public String kode_prodi, nama_prodi, akreditasi_prodi;

        public Prodi(String kode_fakultas, String nama_fakultas, String kode_prodi, String nama_prodi, String akreditasi_prodi) {

        super(kode_prodi, nama_prodi);

        this.kode_prodi = kode_prodi;

        this.nama_prodi = nama_prodi;

        this.akreditasi_prodi = akreditasi_prodi;

    }

    public String getKodeProdi() {

        return kode_prodi;

    }

    public String getNamaProdi() {

        return nama_prodi;

    }

    public String getAkreditasiProdi() {

        return akreditasi_prodi;

    }

    public void kerja() {

        System.out.println("Penyelenggara teknis kegiatan KBM di lingkungan program studi");

    }

    public void tampil_data() {

        super.tampil_data();

        super.kerja();

        System.out.println("Kode Program Studi : "+ this.getKodeProdi());

        System.out.println("Nama Program Studi : "+ this.getNamaProdi());

        System.out.println("Akreditasi Program Studi : "+ this.getAkreditasiProdi());

        this.kerja();

    }

    }

    d. public class Data {

        public static void main(String args[]){

        Prodi data_prodi_1 = new Prodi("1", "FKOM", "08", "Teknik Informatika", "B");

        data_prodi_1.tampil_data();

        

        System.out.println("");

        

        Prodi data_prodi_2 = new Prodi("1", "FKOM", "09", "Sistem Informasi", "B");

        data_prodi_2.tampil_data();

    }

    }

    e. Polimorphisme dari class diatas adalah : kerja() Dimana behaviour kerja pada class fakultas dan prodi masing-masing berbeda. Walaupun class prodi merupakan class turunan dari class fakultas
