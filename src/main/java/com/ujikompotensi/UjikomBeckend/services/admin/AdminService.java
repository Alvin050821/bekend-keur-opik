package com.ujikompotensi.UjikomBeckend.services.admin;

import com.ujikompotensi.UjikomBeckend.dto.ProdukDto;

import java.io.IOException;
import java.util.List;

public interface AdminService {

    boolean postProduk(ProdukDto produkDto) throws IOException;

    List<ProdukDto> getAllProduk();

    void deleteProduk(Long id);

    ProdukDto getProdukById(Long id);

}
