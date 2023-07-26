public class ReportEntryPoint {

    public Report  create(Document document, Converter format) {


        Report repnew = new Report(document, format);


        //БЕРЕМ ДОКУМЕНТ
        return  repnew;
    }



}
