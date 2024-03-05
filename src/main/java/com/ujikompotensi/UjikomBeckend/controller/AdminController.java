package com.ujikompotensi.UjikomBeckend.controller;

import com.ujikompotensi.UjikomBeckend.dto.ProdukDto;
import com.ujikompotensi.UjikomBeckend.services.admin.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/api/admin")
@RequiredArgsConstructor
public class AdminController {

    private final AdminService adminService;

    @PostMapping("/produk")
    public ResponseEntity<?> postProduk(@ModelAttribute ProdukDto produkDto) throws IOException {
       boolean success = adminService.postProduk(produkDto);
       if (success){
           return ResponseEntity.status(HttpStatus.CREATED).build();
       } else {
           return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
       }
    }

    @GetMapping("/produks")
    public ResponseEntity<?> getAllProduk() {
        return ResponseEntity.ok(adminService.getAllProduk());
    }

    @DeleteMapping("/produk/{id}")
    public ResponseEntity<Void> deleteProduk(@PathVariable Long id){
        adminService.deleteProduk(id);
        return ResponseEntity.ok(null);
    }

    @GetMapping("/produk/{id}")
    public ResponseEntity<ProdukDto> getProdukById(@PathVariable Long id) {
        ProdukDto produkDto = adminService.getProdukById(id);
        return ResponseEntity.ok(produkDto);
    }

}

