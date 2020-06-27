public class DataTypesJava {

    public static void main(String[] args){

     int n = 1234567890;
     long nL = 12345678901L;

     double nD = 123.456;
     float nF = 123.456F;


     var salary = 1000; // int
     //pension 3%
     var pension = salary * 0.03; // double
        var totalSalary = salary - pension;

        System.out.println("Salario: " + salary + " Pension: " + pension + ". Salario total: " + totalSalary);

      var employeeName = "Luis Salas";

        System.out.println("Empleado: " + employeeName + ". Salario: " + totalSalary);


    }

}
