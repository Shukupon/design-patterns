package shukupon.designpatterns.facade;

import java.util.List;

public class MakingFermentationMash {

    public String makingFermentationMash(List<String> ingredient) throws Exception {
        if(ingredient.containsAll(List.of("蒸米", "麹", "水", "酒母"))) {
            System.out.println("醪造り： 本格的なアルコール発酵を行います。原料となる蒸米、麹、水、酒母を4日間で3回に分けて投入する三段仕込みを行います。");
            return "醪";
        }else {
            throw new Exception("想定される原料ではありません.");
        }
    }
}
