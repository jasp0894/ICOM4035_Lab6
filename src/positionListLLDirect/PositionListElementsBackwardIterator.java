package positionListLLDirect;

import java.util.Iterator;
import java.util.NoSuchElementException;

import positionInterfaces.Position;
import positionInterfaces.PositionList;

public class PositionListElementsBackwardIterator<T> implements Iterator<T>{

	protected Position<T> current;
	protected PositionList<T> theList;
	
	public PositionListElementsBackwardIterator() {
		//for inheritance purposes
	}
	public PositionListElementsBackwardIterator(PositionList<T> list) {
		// TODO Auto-generated constructor stub
		theList = list;
		if(theList.isEmpty())
			current = null;
		else
			current = theList.last();
		
		
	}
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return current!=null;
		
	}

	@Override
	public T next() throws NoSuchElementException {
		// TODO Auto-generated method stub
		if(!hasNext()) throw new NoSuchElementException();
		Position<T> ptr = current;
		try{	
		
			current = theList.prev(current);
			
		}catch(Exception e){
			
			current = null;
		}
		
		return ptr.element();
	}

}
