
public class PerfectSquares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 29, temp = n, count = 0, nextSqrt, nextSq;
		for(int square = n; square >= 1; square--) {
			double dSqrt = Math.sqrt(square);
			double floorSqrt = Math.floor(dSqrt);
			if(floorSqrt - dSqrt == 0) {
				count = 1;
				temp = (int) (n - square);
				nextSqrt = (int) floorSqrt;
				while(temp > 0 && nextSqrt > 0) {
					nextSq = nextSqrt * nextSqrt;
					if(temp >= nextSq) {
						temp = temp - nextSq;
						if(nextSqrt == 1)
							nextSqrt = 0;
						count++;
					}
					else {
						nextSqrt--;
					}
				}
				if(temp == 0)
					break;
			}
		}
		System.out.println(count);
	}

}
