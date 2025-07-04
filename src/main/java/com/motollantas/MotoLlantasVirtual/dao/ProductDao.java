package com.motollantas.MotoLlantasVirtual.dao;

import com.motollantas.MotoLlantasVirtual.domain.Product;
import java.time.LocalDate;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductDao extends JpaRepository<Product, Long> {

    List<Product> findByStatusTrue();

    List<Product> findByStatusFalse();

    List<Product> findAllByOrderByStatusDescNameAsc();

    List<Product> findByNameContainingIgnoreCaseOrCategoryContainingIgnoreCase(String name, String category);

    List<Product> findByExpirationDateBetween(LocalDate start, LocalDate end);

}
