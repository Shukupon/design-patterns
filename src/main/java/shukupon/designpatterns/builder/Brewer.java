package shukupon.designpatterns.builder;

/**
 * Builderを操作するクラス.
 * 
 * @author Shukupon
 *
 */
public class Brewer {

	private SakeBuilder sakeBuilder;

	public Brewer(SakeBuilder sakeBuilder) {
		this.sakeBuilder = sakeBuilder;
	}

	public void brew() {

		sakeBuilder.processingRawMaterial();
		sakeBuilder.makingKoji();
		sakeBuilder.makingYeast();
		sakeBuilder.makingFermentationMash();
		sakeBuilder.packing();
	}
}
