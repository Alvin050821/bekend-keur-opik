package com.ujikompotensi.UjikomBeckend.repository;

import com.ujikompotensi.UjikomBeckend.entity.Produk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdukRepository extends JpaRepository<Produk, Long> {
}
