import java.util.UUID;

public class Document {

    private UUID id;
    private String name;

    private String text;


    // ...

    public Document(String name, String text) { // конструтор нового студента  в аргумент идет название группы
        this.id = UUID.randomUUID();
        this.name = name;
        this.text= text;
        int buba=10;

    }

    //это прваильно
    public String getTextfromDoc(){
        kolobok
        String text=this.text;
        return  text;
    }

    @Override
    public String toString() {
        return "[" + id + "] (" + name + ") text = {" + text + "}";
    }




}
