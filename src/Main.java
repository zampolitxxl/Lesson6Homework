public class Main {
    public static void main(String[] args) {


        //Не нрафится что формат надо создавать в ручную хотя можно заранее создать
        //давай в байты переведем
        // 1. Сначала сделаем нормальный конструтор для DOC с информацией
        // 2.  А потом попробуем передать в байты DOC ,  это все куда? в REP как преподаватель сказал
        // 3.   В идеале эти байты вернуть , вместо надписис пдф файл готов
        // 4. Сделать аналогию  для других форматов


        ReportEntryPoint point = new ReportEntryPoint();//cоздали точку от куда все идет

        Document docOne=new Document("Отчет по налогам", "Налоговая декларация за 2025 год"); //создали новый документ
        System.out.println("docOne для проверки  "+ docOne);



        //Тут "создаются форматы"
        PDF pdf = new PDF(); //создали новый формат PDF
        JSON json = new JSON(); //создали новый формат json
        XML xml=new XML(); //создали новый формат xml


 //PDF
        Report reportPDF=point.create(docOne, pdf); //  запустили метод который берет формат
        reportPDF.workWithDoc(); //запустили "работу" с документом

        //JSON


        Report reportJSON=point.create(docOne, json); //  запустили метод который берет формат
        reportJSON.workWithDoc(); //запустили "работу" с документом



        //XML


        Report reportXML=point.create(docOne, xml); //  запустили метод который берет формат
        reportXML.workWithDoc(); //запустили "работу" с документом



    }
}