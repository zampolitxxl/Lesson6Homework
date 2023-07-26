public class JSON implements Converter {


    @Override
    public void convert(byte[] biteText) {
        System.out.println( "Байты которые конвертируются в формат JSON   " +biteText.toString());


    }
}
