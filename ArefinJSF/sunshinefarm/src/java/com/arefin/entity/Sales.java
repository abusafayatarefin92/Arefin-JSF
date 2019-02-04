/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arefin.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author User
 */
@Entity
@Table(name = "sales")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sales.findAll", query = "SELECT s FROM Sales s")
    , @NamedQuery(name = "Sales.findById", query = "SELECT s FROM Sales s WHERE s.id = :id")
    , @NamedQuery(name = "Sales.findByPerUnitSalesPrice", query = "SELECT s FROM Sales s WHERE s.perUnitSalesPrice = :perUnitSalesPrice")
    , @NamedQuery(name = "Sales.findByProductCode", query = "SELECT s FROM Sales s WHERE s.productCode = :productCode")
    , @NamedQuery(name = "Sales.findByProductName", query = "SELECT s FROM Sales s WHERE s.productName = :productName")
    , @NamedQuery(name = "Sales.findBySalesDate", query = "SELECT s FROM Sales s WHERE s.salesDate = :salesDate")
    , @NamedQuery(name = "Sales.findByCropsId", query = "SELECT s FROM Sales s WHERE s.cropsId = :cropsId")})
public class Sales implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "per_unit_sales_price")
    private Double perUnitSalesPrice;
    @Size(max = 255)
    @Column(name = "product_code")
    private String productCode;
    @Size(max = 255)
    @Column(name = "product_name")
    private String productName;
    @Column(name = "sales_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date salesDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "crops_id")
    private long cropsId;

    public Sales() {
    }

    public Sales(Long id) {
        this.id = id;
    }

    public Sales(Long id, long cropsId) {
        this.id = id;
        this.cropsId = cropsId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPerUnitSalesPrice() {
        return perUnitSalesPrice;
    }

    public void setPerUnitSalesPrice(Double perUnitSalesPrice) {
        this.perUnitSalesPrice = perUnitSalesPrice;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Date getSalesDate() {
        return salesDate;
    }

    public void setSalesDate(Date salesDate) {
        this.salesDate = salesDate;
    }

    public long getCropsId() {
        return cropsId;
    }

    public void setCropsId(long cropsId) {
        this.cropsId = cropsId;
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
        if (!(object instanceof Sales)) {
            return false;
        }
        Sales other = (Sales) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.arefin.entity.Sales[ id=" + id + " ]";
    }
    
}
