package co.kim.generic;

public class Gcalcurator {
	public <T extends Number> int sum(T t1, T t2) {
		int v1 = t1.intValue();
		int v2 = t1.intValue();

		return v1 + v2;

	}

}
