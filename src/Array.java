public class Array {

    public static void main(String[] args) {


//        manual
        String [] stringArray;
        stringArray = new String[3];

        stringArray [0] = "bagus";
        stringArray [1] = "aja";
        stringArray [2] = "yi";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        //cara cepet
        String [] namaNama = {
                "bagus", "aja", "yi"
        };

        namaNama[0] = null; // mengosongkan data contoh

        int [] arrayInt = new int[] {
                1,2,3,4,5,6,7,8,9,10
        };

        long[] arrayLong = {
                10L, 20L, 30L
        };

        arrayLong [0] = 0; // mengosongkan data contoh
        System.out.println(arrayLong.length); //mengukur panjang
        String[][] members = {
                {"bagus", "iyo"},
                {"budi","ns"},
                {"jokoiyo"},
        };
        System.out.println(members[0][1]);
        System.out.println(members[1][0]);




    }
}
