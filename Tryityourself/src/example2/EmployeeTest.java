package example2;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class EmployeeTest {
    public static void main(String[] args) {

        Employee e = new Employee(1, "Phan", "Mai", 10000);
        System.out.println(e.toString());
    }
}
