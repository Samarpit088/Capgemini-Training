package JSON_Data;

import org.json.JSONObject;
import org.json.JSONArray;

public class Q1 {
    public static void main(String[] args) {
        JSONArray subjects = new JSONArray();
        subjects.put("Java");
        subjects.put("AWS");
        subjects.put("SQL");
        JSONObject student = new JSONObject();
        student.put("name", "Samarpit");
        student.put("age", 21);
        student.put("subjects", subjects);
        System.out.println(student.toString());
    }
}
