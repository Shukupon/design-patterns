package shukupon.designpatterns.builder;

public class YamahaimotoBuilder implements SakeBuilder {

	@Override
	public void processingRawMaterial() {
		System.out.println("原料処理： 40%米を削って精米し、2~3週間冷暗所で保管したのちに、洗米・浸漬・水切り・蒸し・放冷を行い、" + "蒸米を準備します。");

	}

	@Override
	public void makingKoji() {
		System.out.println("製麹： 米の澱粉を糊状に分解するために、蒸米に麹菌を繁殖させる製麹作業を2日間かけて行います。");

	}

	@Override
	public void makingYeast() {
		System.out.println("酒母造り: アルコール発酵に必要な酵母を培養します。山廃酛で製造するため、水・麹・酵母・醸造用乳酸を投入したのちに、蒸米を投入します。");

	}

	@Override
	public void makingFermentationMash() {
		System.out.println("醪造り： 本格的なアルコール発酵を行います。原料となる蒸米、麹、水、酒母を4日間で3回に分けて投入する三段仕込みを行います。");

	}

	@Override
	public void packing() {
		System.out.println("上槽および瓶詰め： 酒粕と液体に分離し、瓶詰めを行います。濾過(1回目)、火入れ(1回目)、貯蔵、割水、濾過(2回目)、火入れ(2回目)、瓶詰めの順に作業を行います。");

	}

}
