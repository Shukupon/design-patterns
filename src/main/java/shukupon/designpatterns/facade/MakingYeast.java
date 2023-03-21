package shukupon.designpatterns.facade;

import java.util.List;

public class MakingYeast {
    public String makingYeast(List<String> ingredient) throws Exception {
        if (ingredient.containsAll(List.of("水", "麹", "酵母", "醸造用乳酸"))) {
            System.out.println("酒母造り: アルコール発酵に必要な酵母を培養します。山廃酛で製造するため、水・麹・酵母・醸造用乳酸を投入したのちに、蒸米を投入します。");
            return "酒母";
        } else {
            throw new Exception("想定される原料ではありません.");
        }
    }

}
