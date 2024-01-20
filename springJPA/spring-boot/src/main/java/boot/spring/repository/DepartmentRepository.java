package boot.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import boot.spring.Entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Integer> {
public List<Department> findByDepartmentName(String deptName);
public List<Department> findByDepartmentNameIgnoreCase(String deptName);//Ignore case for PathVariable

}
