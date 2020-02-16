package menuDrivenProgram.LinkedList.Execution;

import menuDrivenProgram.LinkedList.Document.Page;
import menuDrivenProgram.LinkedList.Document.documents;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your choice \n 1 for cv\n 2 for CoverLetter");
        int choice = scanner.nextInt();
        if (choice == 1) {
            int PageNo = scanner.nextInt();
            String details = scanner.nextLine();
            Page page = new Page(PageNo, details);
            documents CV = new documents(page);
        } else {
            int PageNo1 = scanner.nextInt();
            String details1 = scanner.nextLine();

            Page page1 = new Page(PageNo1, details1);
            documents CoverLetter = new documents(page1);
        }
    }
}
