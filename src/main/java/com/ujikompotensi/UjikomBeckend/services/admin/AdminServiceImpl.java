package com.ujikompotensi.UjikomBeckend.services.admin;


import com.ujikompotensi.UjikomBeckend.dto.ProdukDto;
import com.ujikompotensi.UjikomBeckend.entity.Produk;
import com.ujikompotensi.UjikomBeckend.repository.ProdukRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class AdminServiceImpl implements AdminService{

    private final ProdukRepository produkRepository;


    @Override
    public boolean postProduk(ProdukDto produkDto) throws IOException {
        try {
            Produk produk = new Produk();
            produk.setNama(produkDto.getNama());
            produk.setMerek(produkDto.getMerek());
            produk.setWarna(produkDto.getWarna());
            produk.setHarga(produkDto.getHarga());
            produk.setTahun(produkDto.getTahun());
            produk.setJenis(produkDto.getJenis());
            produk.setDeskripsi(produkDto.getDeskripsi());
            produk.setProsesor(produkDto.getProsesor());
            produk.setImage(produkDto.getImage().getBytes());
            produkRepository.save(produk);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    @Override
    public List<ProdukDto> getAllProduk() {
        return produkRepository.findAll().stream().map(Produk::produkDto).collect(Collectors.toList());
    }

    @Override
    public void deleteProduk(Long id) {
        produkRepository.deleteById(id);
    }

    @Override
    public ProdukDto getProdukById(Long id) {
        Optional<Produk> optionalProduk = produkRepository.findById(id);
        return optionalProduk.map(Produk::getProdukDto).orElse(null);
    }
}
