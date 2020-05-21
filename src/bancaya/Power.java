package bancaya;

public class Power {

	public static void main(String[] args) {
		System.out.println("what is going on");
		int res = powrFun(3,4);
		System.out.println(res);
		System.out.println("Done");
	}

	static int powrFun(int x,int exp ) {
		int i = 0;
		int j = 0;
		int res = 1;
		int temp = x;
		while (i < exp-1) {
			j = 0;
			res = 0;
			while (j < x) {
				res = res + temp;
				j++;
			}
			temp = res;
			i++;
		}
		return res;
	}
}
// 3^2
// 3 + 3 + 3 = 9
// 
// 3^3
// 3 + 3 + 3 = 0
// 9 + 9 + 9 = 27
// 
//
// 2 + 2 = 4
// 4 + 4 = 8
//
// 
// 3 + 3 + 3 = 9
// 9 + 9 + 9 = 27
// 27 + 27 +27 = 81
// 