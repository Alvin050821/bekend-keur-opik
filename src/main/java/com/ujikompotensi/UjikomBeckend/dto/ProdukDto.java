package com.ujikompotensi.UjikomBeckend.dto;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

@Data
public class ProdukDto {

    private Long id;

    private String merek;

    private String nama;

    private String jenis;

    private String prosesor;

    private String warna;

    private Date tahun;

    private Long harga;

    private String deskripsi;

    private MultipartFile image;

    private byte[] returnedImage;

}
