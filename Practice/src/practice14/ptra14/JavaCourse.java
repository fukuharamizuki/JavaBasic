package practice14.ptra14;

import practice14.common.Course;

public class JavaCourse implements Course{

	public String getCourseName() {
		String getCourseName = PREFIX+"Java";
		return getCourseName;
	}
	public String[] getCourseUnit() {
		String[] getCouseUnit = {"式と演算","制御構文","メソッド","配列","オブジェクト指向","継承","高度な継承"};
		return getCouseUnit;
	}
}
