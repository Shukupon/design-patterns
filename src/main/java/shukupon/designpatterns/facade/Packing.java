package shukupon.designpatterns.facade;

public class Packing {
    public String packing(String mash) throws Exception {
        if (mash.equals("醪")) {
            System.out.println("上槽および瓶詰め： 酒粕と液体に分離し、瓶詰めを行います。濾過(1回目)、火入れ(1回目)、貯蔵、割水、濾過(2回目)、火入れ(2回目)、瓶詰めの順に作業を行います。");
            return "日本酒";
        } else {
            throw new Exception("想定される原料ではありません.");
        }
    }

}
