package com.ujikompotensi.UjikomBeckend.entity;

import com.ujikompotensi.UjikomBeckend.dto.ProdukDto;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "produk")
public class Produk {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String merek;

    private String nama;

    private String jenis;

    private String prosesor;

    private String warna;

    private Date tahun;

    private Long harga;

    private String deskripsi;

    @Lob
    private byte[] image;

    public ProdukDto produkDto() {
        ProdukDto produkDto = new ProdukDto();
        produkDto.setId(id);
        produkDto.setNama(nama);
        produkDto.setMerek(merek);
        produkDto.setWarna(warna);
        produkDto.setHarga(harga);
        produkDto.setDeskripsi(deskripsi);
        produkDto.setJenis(jenis);
        produkDto.setProsesor(prosesor);
        produkDto.setTahun(tahun);
        produkDto.setReturnedImage(image);
        return produkDto;
    }

    public ProdukDto getProdukDto() {
        return null;
    }
}
