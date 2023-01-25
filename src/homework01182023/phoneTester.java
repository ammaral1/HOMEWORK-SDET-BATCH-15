package homework01182023;

public class phoneTester {
    public static void main(String[] args) {

        Phone iphone=new Phone ();

        iphone.type="Apple";
        iphone.color="Black";
        iphone.size="Multiple sizes";
        iphone.speed="fast";
        iphone.price=1000.5;

        iphone.call();
        iphone.takePictures();
        iphone.record();

        Phone pixel=new Phone();
        pixel.type="Pixel type phone";
        pixel.color="Black and White";
        pixel.size="small";
        pixel.speed="not that fast";
        pixel.price=500;

        pixel.call();
        pixel.takePictures();
        pixel.record();

        Phone samsung=new Phone();

        samsung.type="Samsung phones";
        samsung.color="Grey";
        samsung.size="many sizes for the Samsung";
        samsung.speed="fast";
        samsung.price=750;

        samsung.call();
        samsung.takePictures();
        samsung.record();








    }
}
