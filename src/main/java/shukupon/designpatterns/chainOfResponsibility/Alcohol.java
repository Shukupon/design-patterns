package shukupon.designpatterns.chainOfResponsibility;

/**
 * 処理を行う対象のクラス.
 * 
 * @author Shukupon
 *
 */
public class Alcohol {
    private String name;
    private Kind kind;

    public Alcohol(String name, Kind kind) {
        this.name = name;
        this.kind = kind;
    }

    public String getName() {
        return name;
    }

    public Kind getKind() {
        return kind;
    }
}
