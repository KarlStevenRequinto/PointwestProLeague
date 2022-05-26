package pointwestproleague.pointwestpowerhouse.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import pointwestproleague.pointwestpowerhouse.model.Employee;

public interface EmpRepository extends JpaRepository<Employee, Integer>{

	void deleteEmployeeById(Integer id);

	Optional<Employee> findEmployeeById(Integer id);

}
