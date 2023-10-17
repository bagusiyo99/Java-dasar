public class ForEach {
    public static void main(String[] args) {

        String[] names = {
                "bagus", "aja", "iyo",
                "belajar", "aja"
        };

        // cara lama
        for (var i = 0; i <names.length; i++){
            System.out.println(names[i]);
        }

        System.out.println("For Each");

        //cara simple
        for (var name: names){
            System.out.println(name);
        }
    }
}
