package boot.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import boot.spring.Entity.Department;
import boot.spring.error.departmentNotFoundException;
import boot.spring.repository.DepartmentRepository;

@Service
public class serviceImplementation implements DepartmentService{
	
	@Autowired
       private DepartmentRepository repo;	
	@Override

	 public Department saveDepartment(Department department) {
		repo.save(department);
		 return department;
	 }
	
	
	@Override
	public List<Department> findAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	

	@Override
	public Department getDepartment(Integer id) {
		// TODO Auto-generated method stub
		return 	repo.findById(id).get();	
	}


	@Override
	public Department deleteDepartment(Integer id) throws departmentNotFoundException {
		// TODO Auto-generated method stub
		Optional< Department> dept = repo.findById(id);
		if(!dept.isPresent()) {
			throw new departmentNotFoundException("Department not found");
		}
		 repo.deleteById(id);
		 return dept.get();
	}


	@Override
	public Department updateDepartment(Integer id, Department department) {
		// TODO Auto-generated method stub
		Department dept  = null;
		
		dept = repo.findById(id).get();
		
//		if(!dept.getDepartmentName().equals(department.getDepartmentName())) {
//			dept.setDepartmentName(department.getDepartmentName());
//		}
//		if(!dept.getDepartmentCode().equals(department.getDepartmentCode())) {
//			dept.setDepartmentCode(department.getDepartmentCode());
//		}
		
			repo.save(dept);
		
		return dept;
		
	}


	@Override
	public List<Department> getDepartmentByName(String deptName) {
		// TODO Auto-generated method stub
	
		return repo.findByDepartmentNameIgnoreCase(deptName);
	}


	
	
	

}
