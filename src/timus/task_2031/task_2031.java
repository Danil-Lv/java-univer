package timus.task_2031;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class task_2031 {
    public static void main(String[] args) throws Exception {
        switch (Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine())) {
            case 1: System.out.println("16"); return;
            case 2: System.out.println("16 06"); return;
            case 3: System.out.println("16 06 68"); return;
            case 4: System.out.println("16 06 68 88"); return;
            default: System.out.println("Glupenky Pierre");
        }
    }
}