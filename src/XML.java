public class XML implements  Converter{

    @Override
    public void convert(byte[] biteText) {
        System.out.println( "Байты которые конвертируются в формат XML   " +biteText.toString());
    }
}
