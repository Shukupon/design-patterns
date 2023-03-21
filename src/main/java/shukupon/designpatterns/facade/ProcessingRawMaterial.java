package shukupon.designpatterns.facade;

public class ProcessingRawMaterial {
    public String processing(String rice) throws Exception {
        if (rice.equals("米")) {
            System.out.println("原料処理： 40%米を削って精米し、2~3週間冷暗所で保管したのちに、洗米・浸漬・水切り・蒸し・放冷を行い、" + "蒸米を準備します。");
            return "蒸米";
        } else {
            throw new Exception("想定される原料ではありません.");
        }

    }
}
