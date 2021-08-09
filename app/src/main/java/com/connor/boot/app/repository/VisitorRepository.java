package com.connor.boot.app.repository;


import com.connor.boot.app.entity.Visitor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  VisitorRepository extends JpaRepository<Visitor, Long> {
    Visitor findByIp(String ip);
}

