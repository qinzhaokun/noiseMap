package zqin.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import zqin.model.testTable;

@Repository
public interface ITestTableDao extends CrudRepository<testTable, Long> {
	
}
