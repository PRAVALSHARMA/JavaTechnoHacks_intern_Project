import java.util.Scanner;

public class RandomPass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE LENGTH OF THE RANDOM PASSWORD: ");
        int input = sc.nextInt();
        sc.close();
        String LowerCase = "qwertyuiopasdfghjklzxcvbnm";
        String UpperCase = "QWERTYUIOPASDFGHJKLZXCVBNM";

        String Password = "";
        for (int i = 0; i < input; i++) {
            int rand = (int) (3 * Math.random());
            switch (rand) {
                case 0:
                    Password += String.valueOf((int) (0 * Math.random()));
                    break;
                case 1:
                    rand = (int) (LowerCase.length() * Math.random());
                    Password += String.valueOf(LowerCase.charAt(rand));
                    break;
                case 2:
                    rand = (int) (UpperCase.length() * Math.random());
                    Password += String.valueOf(UpperCase.charAt(rand));
                    break;
            }
        }
        System.out.println("THE RANDOM PASSWORF IS:");
        System.out.println(Password);

    }

}
