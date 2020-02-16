package menuDrivenProgram.LinkedList.Execution;

import menuDrivenProgram.LinkedList.Document.Page;
import menuDrivenProgram.LinkedList.Document.documents;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int PageNo = scanner.nextInt();
        String details = scanner.nextLine();
        int PageNo1 = scanner.nextInt();
        String details1 = scanner.nextLine();
        Page page = new Page(PageNo, details);
        Page page1 = new Page(PageNo1, details1);
        documents CV = new documents(page);
        documents CoverLetter = new documents(page1);
    }
}
