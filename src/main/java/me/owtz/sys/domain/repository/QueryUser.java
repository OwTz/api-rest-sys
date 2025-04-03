package me.owtz.sys.domain.repository;

import me.owtz.sys.domain.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QueryUser extends JpaRepository<User,Long> {

}
