package shukupon.designpatterns.facade;

import java.util.List;

/**
 * Facadeとなるクラス.
 * 
 * @author Shukupon
 *
 */
public class Brewer {
    
    private ProcessingRawMaterial processingRawMaterial = new ProcessingRawMaterial();
    
    private MakingKoji makingKoji = new MakingKoji();
    
    private MakingYeast makingYeast = new MakingYeast();
    
    private MakingFermentationMash makingFermentationMash = new MakingFermentationMash();
    
    private Packing packing = new Packing();

    public String brew(String rice) {
        String sake = null;
        try {
        String steamedRice = processingRawMaterial.processing(rice);
        String koji = makingKoji.makingKoji(steamedRice);
        String yeast = makingYeast.makingYeast(List.of("水", koji, "酵母", "醸造用乳酸"));
        String mash = makingFermentationMash.makingFermentationMash(List.of(steamedRice, koji, yeast, "水"));
        sake = packing.packing(mash);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sake;
    }

}
