package test.disc;

import java.lang.reflect.Field;

import aims.disc.DigitalVideoDisc;

public class TestPassingParameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
		DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");

		swap(jungleDVD, cinderellaDVD);
		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
		System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());

		changeTitle(jungleDVD, cinderellaDVD.getTitle());
		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
	}

	// real swap
	public static void swap(Object o1, Object o2) {
		try {
			Class<? extends Object> cls = o1.getClass();
			// returns the array of Field objects
			Field[] fields = cls.getDeclaredFields();
			for (int i = 0; i < fields.length; i++) {
				// System.out.println("Field = " + fields[i].toString());
				fields[i].setAccessible(true);
				Object tmp = fields[i].getType().getConstructor(new Class[] {}).newInstance();
				tmp = fields[i].get(o1);
				fields[i].set(o1, fields[i].get(o2));
				fields[i].set(o2, tmp);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void changeTitle(DigitalVideoDisc dvd, String title) {
		String oldTitle = dvd.getTitle();
		dvd.setTitle(title);
		dvd = new DigitalVideoDisc(oldTitle);
	}

//	public static void swap(Object o1, Object o2) {
//		Object tmp = o1;
//		o1 = o2;
//		o2 = tmp;
//	}
}
