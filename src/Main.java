import java.util.Random;


public class Main {
    public static void main(String[] args) {
        System.out.println(permission(25, 22));
        System.out.println(permission(15, -40));
        System.out.println(permission(35, -1));
        System.out.println(permission(50, -15));
        System.out.println(permission(60, 10));
        System.out.println(permission(generateRandomAge(), 10));
        System.out.println(generateRandomAge());

    }


    public static String permission(int age, int temperature) {
        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) {
            return "можно идти гулять";
        } else if (age < 20 && temperature >= -20 && temperature <= 30) {
            return "можно идти гулять";
        } else if (age > 45 && temperature >= -10 && temperature <= 25) {
            return "можно идти гулять";
        } else {
            return "оставайтесь дома";
        }

    }


    public static int generateRandomAge() {
        Random run = new Random();
        return run.nextInt(101);
    }


}

