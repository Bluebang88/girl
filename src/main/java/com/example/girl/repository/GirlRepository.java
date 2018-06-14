package com.example.girl.repository;

import com.example.girl.domain.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Blue
 * @date 2018/6/12 14:18
 */
public interface GirlRepository extends JpaRepository<Girl,Integer> {
}
