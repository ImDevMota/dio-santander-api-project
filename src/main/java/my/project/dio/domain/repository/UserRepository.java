package my.project.dio.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import my.project.dio.domain.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
}
