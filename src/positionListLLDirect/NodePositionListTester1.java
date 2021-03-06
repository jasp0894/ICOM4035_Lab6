package positionListLLDirect;

import positionInterfaces.Position;

/**
 * Testing backward iterator without altering NodePositionList class
 * @author J.A. Sanchez Perez
 *
 */
public class NodePositionListTester1 {

	public static void main(String[] args) {
		
		NodePositionList<Integer> w = new NodePositionList_2<Integer> (); 
		NodePositionList<Integer> q = new NodePositionList_2<Integer> (); 
		q.addFirst(10); 
		
		w.addFirst(5); 
		w.addFirst(3); 
		
		w.addLast(10); 
		w.addLast(13); 
		try {
			Position<Integer> p = w.first();
			w.addAfter(p, 2); 
			p = w.next(p); 
			w.addAfter(p, 34); 
			w.addBefore(p, 40); 
//			p = q.first(); 
//			w.addAfter(p, 89); 
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		showElements(w); 

	}

	private static <E> void showElements(NodePositionList<E> w) {
		for(E p : w) 
			System.out.println(p); 
	}
	
	

}