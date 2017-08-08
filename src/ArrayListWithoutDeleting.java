import java.util.ArrayList;
import java.util.Collection;

public class ArrayListWithoutDeleting<E> extends ArrayList<E> {

    @Override
    public E remove(int index) {
	System.out.println("Can`t remove");
	return null;
    }

    @Override
    public boolean remove(Object o) {
	System.out.println("Can`t remove");
	return false;
    }

    @Override
    public void clear() {
	System.out.println("Can`t clear");
    }

    @Override
    protected void removeRange(int fromIndex, int toIndex) {
	System.out.println("Can`t remove");
    }

    @Override
    public boolean removeAll(Collection<?> c) {
	System.out.println("Can`t remove");
	return false;
    }
}
