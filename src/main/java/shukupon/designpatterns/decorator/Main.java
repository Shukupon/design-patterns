package shukupon.designpatterns.decorator;

/**
 * 実行クラス.
 * 
 * @author Shukupon
 *
 */
public class Main {

    public static void main(String[] args) {

        Rice rice = new Outside("もみ殻", 
                new Outside("果皮", 
                        new Outside("種皮", 
                                new Outside("糊粉層", 
                                        new Endosperm()
                                        )
                                )
                        )
                );
        
        rice.show();
    }
}
