package boot.spring.service;

import java.util.List;

import boot.spring.Entity.Department;
import boot.spring.error.departmentNotFoundException;

public interface DepartmentService {
	 public Department saveDepartment(Department department);
	 public Department getDepartment(Integer id);
	 public List<Department> findAll();
	 public Department deleteDepartment(Integer id) throws departmentNotFoundException;
	 public Department updateDepartment(Integer id, Department department);
	 public List<Department> getDepartmentByName(String deptName);

	 
}
