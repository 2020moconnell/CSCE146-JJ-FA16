
public class Runner 
{
	public static void main(String[] args)
	{
		//new heap
		Heap heap = new Heap();
		//add jeeps
		heap.addJeep(new Jeep(100, 40, "Jeep1"));
		heap.addJeep(new Jeep(621, 123, "Jeep2"));
		heap.addJeep(new Jeep(1120, 460, "Jeep3"));
		heap.addJeep(new Jeep(6421, 1223, "Jeep4"));
		heap.addJeep(new Jeep(1360, 49870, "Jeep5"));
		heap.addJeep(new Jeep(62791, 19723, "Jeep6"));
		heap.addJeep(new Jeep(11220, 47960, "Jeep7"));
		heap.addJeep(new Jeep(642091, 1227893, "Jeep8"));
		heap.addJeep(new Jeep(1009, 490, "Jeep9"));
		heap.addJeep(new Jeep(6921, 1293, "Jeep10"));
		heap.addJeep(new Jeep(19120, 4690, "Jeep11"));
		heap.addJeep(new Jeep(4921, 193, "Jeep12"));
		heap.addJeep(new Jeep(13690, 499870, "Jeep13"));
		heap.addJeep(new Jeep(629791, 199723, "Jeep14"));
		heap.addJeep(new Jeep(119220, 947960, "Jeep15"));
		//removing jeeps
		heap.removeJeep();
		heap.removeJeep();
		heap.removeJeep();
		heap.removeJeep();
		heap.removeJeep();
		
		System.out.println("Jeep roll call.  Breadth order");
		heap.jeepRollCall();
		System.out.println();
		System.out.println("Jeep heap Sort");
		heap.jeepHeapSort();
		
	}
}
