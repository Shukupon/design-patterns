package shukupon.designpatterns.decorator;

/**
 * Decoratorで修飾する最終対象となるクラス.
 * 
 * @author Shukupon
 *
 */
public class Endosperm extends Rice {

    private String text = "胚乳";

    @Override
    public int getRow() {
        return 1;
    }

    @Override
    public int getColomn() {
        return 2;
    }

    @Override
    public String getText(int row) {
        if (row != 0) {
            throw new IndexOutOfBoundsException();
        }
        return text;
    }

}
