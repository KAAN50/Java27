public class Main {
    public static void main(String[] args) {



        for (int i = 2; i <= 101; i++) {
            int sayac=0;
            for (int j = 1; j <= 101; j++) {


                if (i % j == 0) {
                    sayac++;

                }

            }
            if (sayac<=2){
                System.out.println(i);
            }
        }

    }
}