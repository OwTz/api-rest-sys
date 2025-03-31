package me.owtz.sys.repository;

import me.owtz.sys.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QueryUser extends JpaRepository<User,Integer> {

}
