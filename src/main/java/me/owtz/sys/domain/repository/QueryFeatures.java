package me.owtz.sys.domain.repository;

import me.owtz.sys.domain.models.Features;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QueryFeatures extends JpaRepository<Features,Integer> {

}
