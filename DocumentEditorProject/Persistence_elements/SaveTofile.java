package Persistence_elements;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SaveTofile implements Persistence {

    @Override
    public void save(String data) {
        // TODO Auto-generated method stub
        try {
            BufferedWriter file = new BufferedWriter(
                    new FileWriter("document.txt"));

            file.write(data);
            file.close();
            System.out.println("Document saved to document.txt");

        } catch (IOException e) {
            System.out.println("Error: Unable to open file for writing.");
        }

    }

}
