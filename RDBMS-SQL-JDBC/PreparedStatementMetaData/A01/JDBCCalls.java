public class JDBCCalls 
{

    public static void main(String[] args) {
        int option = Integer.parseInt(args[0]);
        DAOClass dao = new DAOClass();

        switch (option) {
        case 1:
              int rollno = Integer.parseInt(args[1]);
              String name = args[2];
              String grade = args[3];
              String dob = args[4];
              int fee = Integer.parseInt(args[5]);
              dao.insert(rollno, name, grade, dob, fee);
              break;

        case 2:
              rollno = Integer.parseInt(args[1]);
              dao.delete(rollno)
              break;

        case 3:
              rollno = Integer.parseInt(args[1]);
              fee = Integer.parseInt(args[2]);
              dao.modify(rollno, fee)
              break;

        case 4:
                  rollno = Integer.parseInt(args[1]);
                  dao.display(rollno);
                  break;
        }

    }

}
