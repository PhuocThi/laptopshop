package vn.thi14.laptopshop.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import vn.thi14.laptopshop.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
    User save(User hoidanit);
}
