package positionListLLDirect;

import java.util.Iterator;

import positionInterfaces.PositionList;

public class PositionListForwardIteratorMaker<E> implements PositionListIteratorMaker<E> {

	@Override
	public Iterator<E> makeIterator(PositionList<E> pl) {
		// TODO Auto-generated method stub
		return new PositionListElementsIterator<>(pl);
	}

}
