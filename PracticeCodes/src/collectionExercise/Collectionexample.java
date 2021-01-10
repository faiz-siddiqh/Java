package collectionExercise;
import java.util.ArrayList;
import java.util.Iterator;
public class Collectionexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		list.add("ajay");
		list.add("mohan");
		list.add("ajil");
		Iterator<String> itr=list.iterator();
		while (itr.hasNext())
		{
		System.out.println(itr.next());
		}
		
		
	}

}
