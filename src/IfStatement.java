public class IfStatement {

    public static void main(String[] args) {

    var nilai = 60;
    var absen = 90;

    var lulusNilai = nilai >= 75;
    var lulusAbsen = nilai >= 75;

    var lulus = lulusAbsen && lulusNilai;

    if (nilai >= 75 && absen  >= 75) {
        System.out.println("selamat anda Lulus");
        } else {
        System.out.println("silahkan coba lagi tahun depan ");
    }


    }
}

