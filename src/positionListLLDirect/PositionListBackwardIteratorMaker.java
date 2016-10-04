package positionListLLDirect;

import java.util.Iterator;

import positionInterfaces.PositionList;

public class PositionListBackwardIteratorMaker<E> implements PositionListIteratorMaker<E> {

	@Override
	public Iterator<E> makeIterator(PositionList<E> pl) {
		// TODO Auto-generated method stub
		return new PositionListElementsBackwardIterator<>(pl);
	}

}
