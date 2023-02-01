package shukupon.designpatterns.builder;

/**
 * Brewerが利用するBuilderクラス.
 * 
 * @author Shukupon
 *
 */
public interface SakeBuilder {

	public void processingRawMaterial();

	public void makingKoji();

	public void makingYeast();

	public void makingFermentationMash();

	public void packing();
}
