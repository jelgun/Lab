import java.util.ArrayList;

public class StudentSearch {
    public boolean studentExists(ArrayList<Student> students, String id) throws Exception {
        if (students.size() == 0) {
            throw new Exception("Students array should not be empty!");
        }
        for (Student student: students)
            if (student.getId().equals(id))
                return true;

        return false;
    }
}
// comment 2
public Student findOne(ArrayList<Student> students, String name) throws Exception {
for (Student student: students)
if (student.getName().equals(name))
return student;
throw new Exception("There is no student with the given name!");
}
public ArrayList<Student> findAll(ArrayList<Student> students, String name) throws
Exception {
ArrayList<Student> result = new ArrayList<Student>();
for (Student student: students)
if (student.getName().equals(name)) {
result.add(student);
}
if (result.isEmpty()) {
throw new Exception("There is no student with the given name!");
}
//comment 1
return result;
}
