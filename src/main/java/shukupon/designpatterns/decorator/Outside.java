package shukupon.designpatterns.decorator;

/**
 * Riceを修飾するためのクラス.
 * 
 * @author Shukupon
 *
 */
public class Outside extends Rice {

    private Rice inside;
    private String text;

    public Outside(String name, Rice inside) {
        text = name;
        this.inside = inside;
    }

    @Override
    public int getRow() {
        return 1 + inside.getRow() + 1;
    }

    @Override
    public int getColomn() {
        return 1 + inside.getColomn() + 1;
    }

    @Override
    public String getText(int row) {
        if(row == 0) {
            return getUpperLine();
        }else if(row == getRow() - 1) {
            return getLowerLine();
        }else {
            return "|" + inside.getText(row - 1) + "|";
        }
    }
    
    private String getUpperLine() {
        String line = text;
        for(int i = 0; i < inside.getColomn() + 2 - text.length(); i++) {
            line += "-";
        }
        return line;
    }
    
    private String getLowerLine() {
        String line = "";
        for(int i = 0; i < inside.getColomn() + 2; i++) {
            line += "-";
        }
        return line;
    }
}
