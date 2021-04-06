import java.util.ArrayList;
import java.util.List;

class MyArrayList<E> extends ArrayList<E> {
	@Override
	public void add(E e) {
		if (e instanceof Integer || e instanceof Float || e instanceof Double)
    {
			super.add(e);
		}
    else 
    {
			throw new ClassCastException("Only Integer, Float, and Double are allowed.");
		}
	}
}

public class A04 {

	public static void main(String[] args) {
		List<Object> list = new MyArrayList<>();
		
		try {
			list.add(5315);
			list.add(14.24F);
			list.add(323.153415D);
			list.add("A");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(list);
	}

}
