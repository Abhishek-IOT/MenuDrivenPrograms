package menuDrivenProgram.LinkedList.Execution;

import menuDrivenProgram.LinkedList.Defination.defination;
import menuDrivenProgram.LinkedList.Document.Page;
import menuDrivenProgram.LinkedList.Document.documents;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        defination defination = new defination();
        System.out.println("Press one for adding Pages in the CV");
        System.out.println("Press two for removing Pages in the CV");
        System.out.println("Press three for searching Pages in the CV");
        System.out.println("Press four for printing  in the CV");
        int choice2 = scanner.nextInt();

        int PageNo = scanner.nextInt();
        String details = scanner.nextLine();
        Page page = new Page(PageNo, details);
        documents CV = new documents(page);
        System.out.println(CV.toString());

        if (choice2 == 1) {
            defination.add(PageNo);
            System.out.println("document added");
        }
        if (choice2 == 2) {
            defination.remove(PageNo);
            System.out.println("element removed");
        }
        if (choice2 == 3) {
            defination.search(PageNo);
            System.out.println("element searched");

        } else if (choice2 == 4) {
            defination.print();


        }
    }
}


