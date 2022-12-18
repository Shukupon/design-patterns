package shukupon.designpatterns.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * LiquorShelf用にiteratorを実装するクラス.
 * 
 * @author Shukupon
 *
 */
public class LiquorShelfIterator implements Iterator<Liquor> {

	private LiquorShelf liquorShelf;
	private int index;

	public LiquorShelfIterator(LiquorShelf liquorShelf) {
		this.liquorShelf = liquorShelf;
		index = 0;
	}

	@Override
	public boolean hasNext() {
		if (liquorShelf.getLength() > index) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Liquor next() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
		Liquor liquor = liquorShelf.getLiquorAt(index);
		index++;
		return liquor;
	}

}
