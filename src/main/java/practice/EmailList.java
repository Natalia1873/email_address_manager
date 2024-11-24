package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class EmailList {
    private TreeSet<String> emails = new TreeSet<>();

    public void add(String email) {
        if (isValidEmail(email)) {
            emails.add(email.toLowerCase());
        } else {
            System.out.println(Main.WRONG_EMAIL_ANSWER);
        }
    }

    public List<String> getSortedEmails() {
        return new ArrayList<>(emails);
    }

    private boolean isValidEmail(String email) {
        if (email == null || email.isEmpty()) {
            return false;
        }

        int atIndex = email.indexOf('@');
        int dotIndex = email.lastIndexOf('.');

        return atIndex > 0 &&
                dotIndex > atIndex + 1 &&
                dotIndex < email.length() - 1;
    }
}
