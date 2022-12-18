package shukupon.designpatterns.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * iteratorを持つiterableなクラス.
 * 
 * @author Shukupon
 *
 */
public class LiquorShelf implements Iterable<Liquor> {

	private List<Liquor> liquors = new ArrayList<Liquor>();
	private int last = 0;

	public Liquor getLiquorAt(int index) {
		return liquors.get(index);
	}
	
	public void appendLiquor(Liquor liquor) {
		liquors.add(liquor);
		last++;
	}
	
	public int getLength() {
		return last;
	}
	
	@Override
	public Iterator<Liquor> iterator() {
		return new LiquorShelfIterator(this);
	}

}
