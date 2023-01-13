package Ex8_work;

public class Graph {

	public void graph(int[] arr) {
		for (int i = 0; i < arr.length; i++) {

			System.out.print(i + "ÀÇ °¹¼ö : ");

			for (int j = 0; j < arr[i]; j++) {

				System.out.print("#");

			} // inner

			System.out.println(" " + arr[i]);

		} // outer
	}//graph

}
