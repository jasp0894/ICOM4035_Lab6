package linkedLists;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class DLDHDTListIterableL2F<E> extends DLDHDTList<E> 
									  implements Iterable<E> 
{
	public Iterator<E> iterator() {
		return new LLIteratorF2L<E>(this);
	}

	private static class LLIteratorF2L<E> 
	implements Iterator<E> 
	{ 
		private LinkedList<E> theList;   // the list to iterate over
		// ... other internal fields ...
		private Node<E> current; 
		private boolean hasMoreElements; 

		public LLIteratorF2L(LinkedList<E> list) {
			theList = list; 
			// ... initialize other internal fields ...
			try{
				current = theList.getLastNode();
				hasMoreElements = true;
			}catch(Exception e){
				current = null;
				hasMoreElements = false;
			}
		}

		public boolean hasNext() {
			// Write the new code and substitute next statement ....
			return hasMoreElements;
		}

		public E next() throws NoSuchElementException {
			// Write the new code and substitute next statement ...
			if(!hasNext())
				throw new NoSuchElementException();
			E etr = current.getElement();
			try{
				current = theList.getNodeBefore(current);
				hasMoreElements = true;
			}catch(Exception e){
				current = null;
				hasMoreElements = false;
			}
			
			return etr;
			
	
		}
		

		public void remove() throws UnsupportedOperationException 
		{
			throw new UnsupportedOperationException("Remove is not implemented.");

		}
	}

}
