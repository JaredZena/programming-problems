package decoder;

public class SwappingMaster {

	public static void main(String[] args) {
		int[] sampleInput = {1,2,3,4,5,6};
		solver(sampleInput);
	}

	private static void solver(int[] sample) {
		int[] output = new int[sample.length];
		System.out.println(sample.length);
		for (int i = 0;i<sample.length;i++) {
			output[i] = sample[sample.length - i - 1];
			System.out.print(output[i] + " ");
		}
	}
    
    
}
