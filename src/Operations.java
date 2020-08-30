import java.util.LinkedHashMap;


public class Operations {

        public static void main(String a[])
        {
            LinkedHashMap<String, Integer> courses =
                    new LinkedHashMap<String, Integer>();
            courses.put(myMethod(), 3);
            courses.put("Cloud Courses", 7);
            courses.put("Programming Courses", 8);
            courses.put("Data Science Courses", 2);



            // It prints the elements in same order
            // as they were inserted
            System.out.println(courses);
            System.out.println("Total courses: " + courses.size());
            System.out.println("Contains key 'Hadoop'? "+  courses.containsKey("Hadoop"));

            System.out.println("Getting value for key 'Programming Courses': " + courses.get("Programming Courses"));
            System.out.println("Is map empty? " + courses.isEmpty());

            System.out.println("delete element 'Cloud Courses': " +  courses.remove("Cloud Courses"));

            System.out.println(courses);
        }
    static String myMethod() {
        System.out.println("I just got executed!");
        return null;
    }


}
