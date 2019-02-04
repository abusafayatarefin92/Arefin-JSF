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
@Table(name = "pesticides")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pesticides.findAll", query = "SELECT p FROM Pesticides p")
    , @NamedQuery(name = "Pesticides.findById", query = "SELECT p FROM Pesticides p WHERE p.id = :id")
    , @NamedQuery(name = "Pesticides.findByName", query = "SELECT p FROM Pesticides p WHERE p.name = :name")
    , @NamedQuery(name = "Pesticides.findByProductCode", query = "SELECT p FROM Pesticides p WHERE p.productCode = :productCode")
    , @NamedQuery(name = "Pesticides.findByPurchasePrice", query = "SELECT p FROM Pesticides p WHERE p.purchasePrice = :purchasePrice")
    , @NamedQuery(name = "Pesticides.findByQuantity", query = "SELECT p FROM Pesticides p WHERE p.quantity = :quantity")})
public class Pesticides implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Size(max = 255)
    @Column(name = "name")
    private String name;
    @Size(max = 255)
    @Column(name = "product_code")
    private String productCode;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "purchase_price")
    private Double purchasePrice;
    @Column(name = "quantity")
    private Integer quantity;

    public Pesticides() {
    }

    public Pesticides(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public Double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(Double purchasePrice) {
        this.purchasePrice = purchasePrice;
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
        if (!(object instanceof Pesticides)) {
            return false;
        }
        Pesticides other = (Pesticides) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.arefin.entity.Pesticides[ id=" + id + " ]";
    }
    
}
