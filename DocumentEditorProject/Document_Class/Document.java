package Document_Class;

import java.util.ArrayList;

import Document_Element_type.DocumentElement;

public class Document {
    ArrayList<DocumentElement> elements = new ArrayList<>();

    public void addElement(DocumentElement e) {
        elements.add(e);
    }

    public String render() {
        String result = "";
        for (DocumentElement d : elements) {
            result += d.render();
        }
        return result;
    }

}
