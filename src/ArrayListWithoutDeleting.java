import java.util.ArrayList;
import java.util.Collection;

public class ArrayListWithoutDeleting<E> extends ArrayList<E> {

    @Override
    public E remove(int index) {
	throw new UnsupportedOperationException();
    }

    @Override
    public boolean remove(Object o) {
	throw new UnsupportedOperationException();
    }

    @Override
    public void clear() {
	throw new UnsupportedOperationException();
    }

    @Override
    protected void removeRange(int fromIndex, int toIndex) {
	throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeAll(Collection<?> c) {
	throw new UnsupportedOperationException();
    }
}
