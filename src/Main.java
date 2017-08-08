public class Main {

    public static void main(String[] args) {
	ArrayListWithoutDeleting<Integer> array = new ArrayListWithoutDeleting<>();

	array.add(1);
	array.clear();
	System.out.println(array.toString());
    }
}
