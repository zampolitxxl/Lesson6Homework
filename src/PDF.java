public class PDF implements  Converter{

    @Override
    public void convert(byte[] biteText) {
        System.out.println( "Байты которые конвертируются в формат PDF   " +biteText.toString());


    }


}
