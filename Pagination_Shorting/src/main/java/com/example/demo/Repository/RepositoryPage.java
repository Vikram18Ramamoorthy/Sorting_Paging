package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.PojoPage;
@Repository
public interface RepositoryPage extends JpaRepository<PojoPage,Integer>{

}
