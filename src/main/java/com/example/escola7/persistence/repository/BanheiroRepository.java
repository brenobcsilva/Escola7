package com.example.escola7.persistence.repository;

import com.example.escola7.persistence.model.Banheiro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BanheiroRepository extends JpaRepository<Banheiro, Long> {
}
