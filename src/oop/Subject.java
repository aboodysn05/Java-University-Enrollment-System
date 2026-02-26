package partOOP;

import java.util.ArrayList;

public class Subject {
    private String subjectName;
    private int subjectCreditHours;
    private double subjectCreditHoursCost;
	public Subject(String subjectName, int subjectCreditHours, double subjectCreditHoursCost) {
		super();
		this.subjectName = subjectName;
		this.subjectCreditHours = subjectCreditHours;
		this.subjectCreditHoursCost = subjectCreditHoursCost;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public int getSubjectCreditHours() {
		return subjectCreditHours;
	}
	public void setSubjectCreditHours(int subjectCreditHours) {
		this.subjectCreditHours = subjectCreditHours;
	}
	public double getSubjectCreditHoursCost() {
		return subjectCreditHoursCost;
	}
	public void setSubjectCreditHoursCost(double subjectCreditHoursCost) {
		this.subjectCreditHoursCost = subjectCreditHoursCost;
	}
    
	public static void insertionSort(ArrayList<String> list1, ArrayList<Integer> list2) {
	    for (int i = 1; i < list1.size(); i++) {
	        int key = list2.get(i);
	        String subject = list1.get(i);
	        int j = i - 1;

	        while (j >= 0 && list2.get(j) < key) {
	            list2.set(j + 1, list2.get(j));
	            list1.set(j + 1, list1.get(j));
	            j = j - 1;
	        }
	        list2.set(j + 1, key);
	        list1.set(j + 1, subject);
	    }
	}

}
