public class Report  {

    Converter format;

    Document document;

    private byte[] data;

    public  Report(Document document, Converter format){ //работает с отчетами разных форматов
        this.format=format;
        this.document=document;

    }

    public Document GetDocument(){
        Document documentGet=this.document;
        return  documentGet;
    }

//метолж стринг ту байт

//метод конвертации в байты данных



    //метод работы с документом
    public void workWithDoc() {
        Document doc= this.GetDocument();


        String stringTobyte= doc.getTextfromDoc();

        byte[] byteArrray = stringTobyte.getBytes();
        format.convert(byteArrray);
    }

    @Override
    public String toString() {
        return "[" + format + "] (" + document ;
    }







}
