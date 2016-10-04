/**
 * 
 */
package positionListLLDirect;

import java.util.Iterator;

/**
 * @author J.A. Sanchez Perez
 *
 */
public class NodePositionList_2<E> extends NodePositionList<E> {

	/**
	 * 
	 */
	public NodePositionList_2() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	/**
	 * Overriding method to comply with Iterable...
	 */
	public Iterator<E> iterator() {
		return new PositionListElementsBackwardIterator<>(this);
	}

	
	

}
