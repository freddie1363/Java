package co.kim.overloading;

public class Calcurator {
	public int sum(int n, int m) {
		return n + m;
	}
	
	public int sum(int n, int m, int c) {
		return n + m + c;
	}
	
	public float sum(float x, float y) {
		return x + y;
	}
	
	
	public float multy(float x, float y) {
		return x*y;
	}
//	@Override
//	public int sum(int n, int m) {
//		return n+m+10;
//	}

	public double sum(double d, double e) {
		// TODO Auto-generated method stub
		return d+e;
		
	}

}
