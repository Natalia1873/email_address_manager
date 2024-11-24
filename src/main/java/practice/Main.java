package practice;
import java.util.Scanner;

public class Main {
    public static final String WRONG_EMAIL_ANSWER = "Неверный формат email";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmailList emailList = new EmailList();

        while (true) {
            System.out.println("Insert ADD or LIST: ");
            String input = scanner.nextLine();
            if (input.equals("0")) {
                break;
            } else{
                switch(input){
                    case "ADD":
                        System.out.println("Insert email: ");
                        String email = scanner.nextLine();
                        if (email.contains("@") && email.contains(".")) {
                            emailList.add(email);
                        } else {
                            System.out.println(WRONG_EMAIL_ANSWER);
                        }
                        break;
                    case "LIST":
                        for (String mail : emailList.getSortedEmails()) {
                            System.out.println(mail);
                        }
                        break;

                    default:
                        System.out.println("Неверная команда");
                        break;
                }
            }
        }
    }
}

