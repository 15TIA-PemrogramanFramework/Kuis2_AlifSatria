/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.kuis_1007.entity;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.ManyToOne;

/**
 *
 * @author Hendro Steven
 */
@Entity
@Table(name = "ipk_1007")
public class Ipk implements Serializable {    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 100, nullable = false, unique = true)
    
    private String name;
    @Column(length = 255, nullable = true)
    private String jurusan;
    private String prodi;
  
    private String ipk;
    
    @ManyToOne 
    private Identitas Identitas;

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the jurusan
     */
    public String getJurusan() {
        return jurusan;
    }

    /**
     * @param jurusan the jurusan to set
     */
    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    /**
     * @return the prodi
     */
    public String getProdi() {
        return prodi;
    }

    /**
     * @param prodi the prodi to set
     */
    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    /**
     * @return the ipk
     */
    public String getIpk() {
        return ipk;
    }

    /**
     * @param ipk the ipk to set
     */
    public void setIpk(String ipk) {
        this.ipk = ipk;
    }

    /**
     * @return the Identitas
     */
    public Identitas getIdentitas() {
        return Identitas;
    }

    /**
     * @param Identitas the Identitas to set
     */
    public void setIdentitas(Identitas Identitas) {
        this.Identitas = Identitas;
    }
    


}
