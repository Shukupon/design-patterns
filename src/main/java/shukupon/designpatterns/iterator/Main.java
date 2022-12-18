package shukupon.designpatterns.iterator;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/**
 * 実行クラス.
 * 
 * @author Shukupon
 *
 */
public class Main {

	public static void main(String[] args) {

		// setup
		LiquorShelf liquorShelf = new LiquorShelf();
		liquorShelf.appendLiquor(new Liquor("Wine"));
		liquorShelf.appendLiquor(new Liquor("Whiskey"));
		liquorShelf.appendLiquor(new Liquor("Sake"));
		liquorShelf.appendLiquor(new Liquor("Shochu"));
		
		// 明示的にIteratorを利用
		Iterator<Liquor> it = liquorShelf.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().getName());
		}
		
		System.out.println();
		
		// 明示的にIteratorを利用(stream)		
		Iterator<Liquor> its = liquorShelf.iterator();
		Spliterator<Liquor> spliterator = Spliterators.spliteratorUnknownSize(its, Spliterator.ORDERED);
		Stream<Liquor> stream = StreamSupport.stream(spliterator, false);
		stream.forEach(t -> System.out.println(t.getName()));
		
		System.out.println();
		
		// 拡張for文を利用
		for(Liquor liquor: liquorShelf) {
			System.out.println(liquor.getName());
		}
	}

}
