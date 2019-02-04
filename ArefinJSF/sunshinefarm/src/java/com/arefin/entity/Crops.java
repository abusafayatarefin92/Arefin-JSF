/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arefin.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author User
 */
@Entity
@Table(name = "crops")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Crops.findAll", query = "SELECT c FROM Crops c")
    , @NamedQuery(name = "Crops.findById", query = "SELECT c FROM Crops c WHERE c.id = :id")
    , @NamedQuery(name = "Crops.findByDuration", query = "SELECT c FROM Crops c WHERE c.duration = :duration")
    , @NamedQuery(name = "Crops.findByName", query = "SELECT c FROM Crops c WHERE c.name = :name")
    , @NamedQuery(name = "Crops.findByPerUnitSellingPrice", query = "SELECT c FROM Crops c WHERE c.perUnitSellingPrice = :perUnitSellingPrice")
    , @NamedQuery(name = "Crops.findByProductCode", query = "SELECT c FROM Crops c WHERE c.productCode = :productCode")
    , @NamedQuery(name = "Crops.findByQuantity", query = "SELECT c FROM Crops c WHERE c.quantity = :quantity")})
public class Crops implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Size(max = 255)
    @Column(name = "duration")
    private String duration;
    @Size(max = 255)
    @Column(name = "name")
    private String name;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "per_unit_selling_price")
    private Double perUnitSellingPrice;
    @Size(max = 255)
    @Column(name = "product_code")
    private String productCode;
    @Column(name = "quantity")
    private Integer quantity;

    public Crops() {
    }

    public Crops(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPerUnitSellingPrice() {
        return perUnitSellingPrice;
    }

    public void setPerUnitSellingPrice(Double perUnitSellingPrice) {
        this.perUnitSellingPrice = perUnitSellingPrice;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Crops)) {
            return false;
        }
        Crops other = (Crops) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.arefin.entity.Crops[ id=" + id + " ]";
    }
    
}
