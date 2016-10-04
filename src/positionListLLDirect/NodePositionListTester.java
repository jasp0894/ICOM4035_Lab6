package positionListLLDirect;

import positionInterfaces.Position;

/**
 * Testing last excercise, adding a positionListIteratorMaker
 * @author J.A. Sanchez Perez
 *
 */
public class NodePositionListTester {

	public static void main(String[] args) {
		
		NodePositionListCopy_1<Integer> w = new NodePositionListCopy_1<Integer> (); 
		NodePositionListCopy_1<Integer> q = new NodePositionListCopy_1<Integer> (); 
		
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
		System.out.println("testing for backwards iterator");
		
		NodePositionListCopy_1<Integer> w1 = new NodePositionListCopy_1<Integer> ( new PositionListBackwardIteratorMaker<>()); 
		NodePositionListCopy_1<Integer> q1 = new NodePositionListCopy_1<Integer> (new PositionListBackwardIteratorMaker<>()); 
		
		q1.addFirst(10); 
		
		w1.addFirst(5); 
		w1.addFirst(3); 
		
		w1.addLast(10); 
		w1.addLast(13); 
		try {
			Position<Integer> p = w1.first();
			w1.addAfter(p, 2); 
			p = w1.next(p); 
			w1.addAfter(p, 34); 
			w1.addBefore(p, 40); 
//			p = q1.first(); 
//			w1.addAfter(p, 89); 
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		showElements(w1); 
		
		
		System.out.println("Testing fowad iterator");
		NodePositionListCopy_1<Integer> w2 = new NodePositionListCopy_1<Integer> (new PositionListForwardIteratorMaker<>()); 
		NodePositionListCopy_1<Integer> q2 = new NodePositionListCopy_1<Integer> (); 
		
		q2.addFirst(10); 
		
		w2.addFirst(5); 
		w2.addFirst(3); 
		
		w2.addLast(10); 
		w2.addLast(13); 
		try {
			Position<Integer> p = w2.first();
			w2.addAfter(p, 2); 
			p = w2.next(p); 
			w2.addAfter(p, 34); 
			w2.addBefore(p, 40); 
//			p = q.first(); 
//			w2.addAfter(p, 89); 
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		showElements(w2);

	}

	private static <E> void showElements(NodePositionListCopy_1<E> w) {
		for(E p : w) 
			System.out.println(p); 
	}
	
	

}
