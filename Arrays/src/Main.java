public class Main {
    public static void main(String[] args) {

        /*
        String[] cars = new String[3];

        cars[0] = "TOYOTA";
        cars[1] = "HONDA";
        cars[2] = "SUBARU";

        for (int i = 0; i < cars.length; i++){
            System.out.println(cars[i]);
        }

         */

        String[][] cars =   {
                                {"NISSAN","MIATA","LEXUS"},
                                {"KIA","HYUNDAI","TATA"},
                                {"MITSUBISHI","BMW","SILVIA"}
                            };
        for(int i = 0; i < cars.length; i++){
            System.out.println();
            for(int j = 0; j < cars[i].length; j++){
                System.out.print(cars[i][j]+" ");
            }
        }

    }
}