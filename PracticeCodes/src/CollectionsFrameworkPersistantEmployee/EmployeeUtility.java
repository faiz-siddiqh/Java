package CollectionsFrameworkPersistantEmployee;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeUtility implements java.io.Serializable {

	
	public  boolean  addEmployee(String fileName,ArrayList<Employee>  employeeList) {
		try {
			FileOutputStream file=new FileOutputStream(fileName);
			ObjectOutputStream out=new ObjectOutputStream(file);
			out.writeObject(employeeList);
			out.close();
			file.close();
			return true;
		}catch(IOException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public Employee viewEmployeeById(String fileName,int employeeId) {
		try{
			FileInputStream fileIn = new FileInputStream(fileName);
        ObjectInputStream in = new ObjectInputStream(fileIn);
        
    ArrayList<Employee> e = (ArrayList<Employee>)in.readObject();
    Iterator itr= e.iterator();
    while(itr.hasNext()) {
    	Employee emp=(Employee)itr.next();
    	if(emp.getEmployeeId()==employeeId){
    		return emp;
    	}
    }
    in.close();
    fileIn.close(); 
        
        return null;
        
     } catch (IOException i) {
        i.printStackTrace();
     } catch (ClassNotFoundException c) {
        System.out.println("Employee class not found");
        c.printStackTrace();
        
     }
		return null;
	}
}

