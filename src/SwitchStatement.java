public class SwitchStatement {
    public static void main(String[] args) {
        var nilai = "A";

        //cara Pertama
        switch (nilai) {
            case "A":
                System.out.println("Wow, Anda Lulus Dengan Baik");
                break;
            case "B":
            case "C":
                System.out.println("Nilai Anda Cukup Baik");
                break;
            case "D":
                System.out.println("Anda Tidak Lulus");
                break;
            default:
                System.out.println("Mungkin Anda Salah Jurusan");
        }

        //cara kedua
        String ucapan;
        switch (nilai) {
            case "A" -> ucapan = "Wow, Anda Lulus Dengan Baik";
            case "B" , "C" -> ucapan ="Nilai Anda Cukup Baik";
            case "D" -> ucapan = "anda belum lulus";
            default -> {
                ucapan = "Mungkin anda salah jurusan";
            }
        }
        System.out.println(ucapan);

        //cara ketiga
        ucapan = switch (nilai) {
            case "A":
                yield  "Wow, Anda Lulus Dengan Baik";
            case "B" , "C":
                yield "Nilai Anda Cukup Baik";
            case "D":
                yield "anda belum lulus";
            default:
                yield  "Mungkin anda salah jurusan";
        };

        System.out.println(ucapan);

    }

}
