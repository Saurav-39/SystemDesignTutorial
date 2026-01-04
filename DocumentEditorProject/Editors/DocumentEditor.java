package Editors;

import Document_Class.Document;
import Document_Element_type.ImageElement;
import Document_Element_type.NewLineElement;
import Document_Element_type.TabSpaceElement;
import Document_Element_type.TextElement;
import Persistence_elements.Persistence;

public class DocumentEditor {

    private Document document;
    private Persistence storage;
    private String renderedDocument;
    
    public DocumentEditor(Document document , Persistence storage)
    {
        this.document=document;
        this.storage=storage;
    }

    public void addText(String text)
    {
        document.addElement(new TextElement(text));
    }

    public void addImage(String imagePath)
    {
        document.addElement(new ImageElement(imagePath));
    }

    public void addNewLine()
    {
        document.addElement(new NewLineElement());
    }

    public void addTabSpace()
    {
        document.addElement(new TabSpaceElement()); 
    }

    public String renderDocument()
    {
       if(renderedDocument==null)
       {
        renderedDocument=document.render();
       }
       return renderedDocument;
    }

    public void saveDocument()
    {
        storage.save(renderDocument());
    }
    
}
