import java.util.ArrayList;

public class StudentSearch {
    public boolean studentExists(ArrayList<Student> students, String id) throws Exception {
//<<<<<<< //bug-fix
        //if (students.size() == 0) {
            //throw new Exception("Students array should not be empty!");
//=======
        if (students.isEmpty()) {
            throw new Exception("Students list should not be empty!");
//>>>>>>> //master
        }
        for (Student student: students)
            if (student.getId().equals(id))
                return true;

        return false;
    }
}
