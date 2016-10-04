package positionListLLDirect;

import java.util.Iterator;

import positionInterfaces.PositionList;

public interface PositionListIteratorMaker<E> {
	/**
	 * Makes an iterator for a given position list. 
	 * @param pl the position list
	 * @return reference to the iterator
	 */
	Iterator<E> makeIterator(PositionList<E> pl); 

}
