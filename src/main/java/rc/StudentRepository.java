package rc;

import org.springframework.data.mongodb.repository.MongoRepository;
//import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.stereotype.Repository;

//import java.util.List;

@Repository
public interface StudentRepository extends MongoRepository<Student,String>, QueryDslPredicateExecutor<Student> {
//	Student findById(String id);
//    List<Student> findByPricePerNightLessThan(int maxPrice);

//    @Query(value = "{address.city:?0}")
//    List<Student> findByCity(String city);
}
