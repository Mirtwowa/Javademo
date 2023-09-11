package Exam;

import java.util.HashSet;
import java.util.Scanner;

public class pwdCheck {

    public static void main(String[] args) {

        Scanner In = new Scanner(System.in);
        String recode = In.next();
        if (recode.length() < 8) {
            System.out.println("NG");
        } else {
            HashSet<Integer> recheck = new HashSet<>();
            for (int i = 0; i < recode.length(); i++) {
                char check = recode.charAt(i);
                if (check >= '0' && check <= '9') {
                    recheck.add(1);
                } else if (check >= 'a' && check <= 'z') {
                    recheck.add(2);
                } else if (check >= 'A' && check <= 'Z') {
                    recheck.add(3);
                } else {
                    recheck.add(4);
                }

            }
            if (recheck.size() == 1) {
                System.out.println("NG");
            } else if (recheck.size() == 2) {
                System.out.println("MG");
            } else if (recheck.size() == 3) {
                System.out.println("VG");
            } else if (recheck.size() == 4) {
                System.out.println("EG");
            }
        }
    }
}
