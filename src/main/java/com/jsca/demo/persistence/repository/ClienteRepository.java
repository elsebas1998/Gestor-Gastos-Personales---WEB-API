package com.jsca.demo.persistence.repository;

import com.jsca.demo.persistence.entity.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface ClienteRepository extends JpaRepository<ClienteEntity, Integer> {

    public Optional<ClienteEntity> findByDocumento(String documento);

}
