package Client_Person;
import java.util.Scanner;

import Document_Class.Document;
import Editors.DocumentEditor;
import Persistence_elements.Persistence;
import Persistence_elements.SaveTofile;


public class Client {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Document document = new Document();
    Persistence persistence = new SaveTofile();
    DocumentEditor editor = new DocumentEditor(document, persistence);
    System.out.println("Please Enter String");
    String S1 = sc.nextLine();
    editor.addText(S1);
    System.out.println("Please Enter Second String");
    System.out.println();
    String S2 = sc.nextLine();
    editor.addText(S2);
    System.out.println();
    editor.addNewLine();
    editor.addTabSpace();
    editor.addText("Indented text after tab space.");
    editor.addNewLine();
    System.out.println("Please Insert Image type element");
    String S3 = sc.nextLine();
    editor.addImage(S3);
    System.out.println("Please Insert Second Image type element");
    String S4 = sc.nextLine();
    editor.addImage(S4);
     System.out.println("Please Insert Second Image type element");
    String S5 = sc.nextLine();
    editor.addImage(S5);
    sc.close();

    System.out.println(editor.renderDocument());
    
    for(int i = 0 ; i<5 ; i++)
    {
      System.out.println(S1);
      System.out.println("-----------------Next---------------------------------");
      System.out.println(S2);
      System.out.println("Next2----------------------------------------------------");
      System.out.println(S3);
      System.out.println("Next3-----------------------------------------------------");
      System.out.println(S4);
    }


    editor.saveDocument();

   }
}
