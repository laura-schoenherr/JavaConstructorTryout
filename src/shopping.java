public class shopping {
    //unveränderliche Instanzvariablen
    float weight;
    float price;

    //Standardkonstruktor
    /* shopping(){
        System.out.println("Dies ist der Standardkonstruktor");
    }

     */

    //Initialisierungskonstruktor - parametrisierter Konstruktor (ähnlich Setter methode)
    shopping(float weightvalue, float pricevalue){
        weight = weightvalue;
        price = pricevalue;
        System.out.println("Dies ist der Initialisierungskonstruktor");
    }

    //test method to show values from the object
    void getValues(){
        System.out.println("Weight: " + weight + "\n" + "Price: " + price);
    }
}
