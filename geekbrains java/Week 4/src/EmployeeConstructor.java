public class EmployeeConstructor {
    public static void main(String[] args) {

        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Ivanov Ivan", "Engineer", " ivivan@mailbox.com ", "892312312", 30000, 30);
        empArray[1] = new Employee("Stepanov Stepan", "Engineer", " st@mailbox.com ", "892512312", 31000, 43);
        empArray[2] = new Employee("Petrov Petr", "Engineer", " pt@mailbox.com ", "892552312", 32000, 79);
        empArray[3] = new Employee("Alexeev Alexey", "Engineer", " al@mailbox.com ", "891512312", 33000, 26);
        empArray[4] = new Employee();

        for (Employee e: empArray){
            if (e.getAge() > 40){
                e.getInfo();
            }
        }
    }
}
