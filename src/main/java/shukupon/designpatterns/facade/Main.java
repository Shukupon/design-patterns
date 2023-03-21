package shukupon.designpatterns.facade;

public class Main {

    public static void main(String[] args) {

        Brewer brewer = new Brewer();

        System.out.println("米を投入します.");
        String rice = "米";
        String sake = brewer.brew(rice);
        System.out.println(sake + "ができました.");
    }
}
