package shukupon.designpatterns.facade;

public class MakingKoji {
    public String makingKoji(String steamedRice) throws Exception {
        if (steamedRice.equals("蒸米")) {
            System.out.println("製麹： 米の澱粉を糊状に分解するために、蒸米に麹菌を繁殖させる製麹作業を2日間かけて行います。");
            return "麹";
        } else {
            throw new Exception("想定される原料ではありません.");
        }
    }
}
