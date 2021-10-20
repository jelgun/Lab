import java.util.ArrayList;

public class StudentSearch {
    public boolean studentExists(ArrayList<Student> students, String id) throws Exception {
<<<<<<< HEAD
        if (students.isEmpty()) {
            throw new Exception("Students list should not be empty!");
=======
        if (students.size() == 0) {
            throw new Exception("Students array should not be empty!");
>>>>>>> bug-fix
        }
        for (Student student: students)
            if (student.getId().equals(id))
                return true;

        return false;
    }
	
	public Student findOne(ArrayList<Student> students, String name) throws Exception {
		for (Student student: students)
			if (student.getName().equals(name))
				return student;
		throw new Exception("There is no student with the given name!");
	}

}
