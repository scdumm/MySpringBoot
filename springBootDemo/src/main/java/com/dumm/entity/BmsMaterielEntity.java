package com.dumm.entity;


import java.math.BigDecimal;
import java.util.Date;

/**
 * @ProjectName: HT-OMS-Project-BMS
 * @Package: com.hongtu.slps.bms.entity.materiel
 * @ClassName: BaseMapper
 * @Description: 物料基础数据
 * @Author: xiaLin
 * @Version: 1.0
 */
public class BmsMaterielEntity  {

    /**
     * 主键
     */
    private String id;
    /**
     * 物料编码
     */
    private String materielCode;
    /**
     * 物料名称
     */
    private String materielName;
    /**
     * 类型编码
     */
    private String materielType;
    /**
     * 类型
     */
    private String materielTypeName;
    /**
     * 默认单位编码
     */
    private String defaultUnit;
    /**
     * 默认单位
     */
    private String defaultUnitName;
    /**
     * 默认单位转换重量
     */
    private BigDecimal conversionWeight;
    /**
     * 默认单位转换体积
     */
    private BigDecimal conversionVolume;
    /**
     * 品牌ID
     */
    private String brandId;
    /**
     * 品牌名称
     */
    private String brandName;
    /**
     * 包重编码
     */
    private String packetWeight;
    /**
     * 包重
     */
    private String packetWeightName;
    /**
     * 颜色编码
     */
    private String colourCode;
    /**
     * 颜色
     */
    private String colourName;
    /**
     * 工艺编码
     */
    private String technologyCode;
    /**
     * 工艺
     */
    private String technologyName;
    /**
     * 托盘堆码数
     */
    private Integer palletNumber;
    /**
     * 净重
     */
    private BigDecimal netWeight;
    /**
     * 毛重
     */
    private BigDecimal grossWeight;
    /**
     * 折算重量
     */
    private BigDecimal convertedWeight;
    /**
     * 长
     */
    private BigDecimal materielLong;
    /**
     * 宽
     */
    private BigDecimal materielWide;
    /**
     * 高
     */
    private BigDecimal materielHigh;
    /**
     * 状态（1：正常状态，0：禁用）默认为：1
     */
    private Integer status;
    /**
     * 所在组织
     */
    private String organizationName;
    /**
     * 组织编码
     */
    private String organizationCode;
    /**
     * 所在组织ID
     */
    private String organizationId;
    /**
     * 所在组织顶级名称
     */
    private String topOrganizationName;
    /**
     * 顶级组织编码
     */
    private String topOrganizationCode;
    /**
     * 所在组织顶级ID
     */
    private String topOrganizationId;
    /**
     * 添加时间
     */
    private Date addTime;
    /**
     * 添加用户ID
     */
    private String addAccountId;
    /**
     * 添加用户名
     */
    private String addAccountName;
    /**
     * 修改时间
     */
    private Date editTime;
    /**
     * 修改用户ID
     */
    private String editAccountId;
    /**
     * 修改用户
     */
    private String editAccountName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMaterielCode() {
        return materielCode;
    }

    public void setMaterielCode(String materielCode) {
        this.materielCode = materielCode;
    }

    public String getMaterielName() {
        return materielName;
    }

    public void setMaterielName(String materielName) {
        this.materielName = materielName;
    }

    public String getMaterielType() {
        return materielType;
    }

    public void setMaterielType(String materielType) {
        this.materielType = materielType;
    }

    public String getMaterielTypeName() {
        return materielTypeName;
    }

    public void setMaterielTypeName(String materielTypeName) {
        this.materielTypeName = materielTypeName;
    }

    public String getDefaultUnit() {
        return defaultUnit;
    }

    public void setDefaultUnit(String defaultUnit) {
        this.defaultUnit = defaultUnit;
    }

    public String getDefaultUnitName() {
        return defaultUnitName;
    }

    public void setDefaultUnitName(String defaultUnitName) {
        this.defaultUnitName = defaultUnitName;
    }

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getPacketWeight() {
        return packetWeight;
    }

    public void setPacketWeight(String packetWeight) {
        this.packetWeight = packetWeight;
    }

    public String getPacketWeightName() {
        return packetWeightName;
    }

    public void setPacketWeightName(String packetWeightName) {
        this.packetWeightName = packetWeightName;
    }

    public String getColourCode() {
        return colourCode;
    }

    public void setColourCode(String colourCode) {
        this.colourCode = colourCode;
    }

    public String getColourName() {
        return colourName;
    }

    public void setColourName(String colourName) {
        this.colourName = colourName;
    }

    public String getTechnologyCode() {
        return technologyCode;
    }

    public void setTechnologyCode(String technologyCode) {
        this.technologyCode = technologyCode;
    }

    public String getTechnologyName() {
        return technologyName;
    }

    public void setTechnologyName(String technologyName) {
        this.technologyName = technologyName;
    }

    public Integer getPalletNumber() {
        return palletNumber;
    }

    public void setPalletNumber(Integer palletNumber) {
        this.palletNumber = palletNumber;
    }

    public BigDecimal getNetWeight() {
        return netWeight;
    }

    public void setNetWeight(BigDecimal netWeight) {
        this.netWeight = netWeight;
    }

    public BigDecimal getGrossWeight() {
        return grossWeight;
    }

    public void setGrossWeight(BigDecimal grossWeight) {
        this.grossWeight = grossWeight;
    }

    public BigDecimal getConvertedWeight() {
        return convertedWeight;
    }

    public void setConvertedWeight(BigDecimal convertedWeight) {
        this.convertedWeight = convertedWeight;
    }

    public BigDecimal getMaterielLong() {
        return materielLong;
    }

    public void setMaterielLong(BigDecimal materielLong) {
        this.materielLong = materielLong;
    }

    public BigDecimal getMaterielWide() {
        return materielWide;
    }

    public void setMaterielWide(BigDecimal materielWide) {
        this.materielWide = materielWide;
    }

    public BigDecimal getMaterielHigh() {
        return materielHigh;
    }

    public void setMaterielHigh(BigDecimal materielHigh) {
        this.materielHigh = materielHigh;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getOrganizationCode() {
        return organizationCode;
    }

    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public String getTopOrganizationName() {
        return topOrganizationName;
    }

    public void setTopOrganizationName(String topOrganizationName) {
        this.topOrganizationName = topOrganizationName;
    }

    public String getTopOrganizationCode() {
        return topOrganizationCode;
    }

    public void setTopOrganizationCode(String topOrganizationCode) {
        this.topOrganizationCode = topOrganizationCode;
    }

    public String getTopOrganizationId() {
        return topOrganizationId;
    }

    public void setTopOrganizationId(String topOrganizationId) {
        this.topOrganizationId = topOrganizationId;
    }


    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public String getAddAccountId() {
        return addAccountId;
    }

    public void setAddAccountId(String addAccountId) {
        this.addAccountId = addAccountId;
    }

    public String getAddAccountName() {
        return addAccountName;
    }

    public void setAddAccountName(String addAccountName) {
        this.addAccountName = addAccountName;
    }

    public Date getEditTime() {
        return editTime;
    }

    public void setEditTime(Date editTime) {
        this.editTime = editTime;
    }

    public String getEditAccountId() {
        return editAccountId;
    }

    public void setEditAccountId(String editAccountId) {
        this.editAccountId = editAccountId;
    }

    public String getEditAccountName() {
        return editAccountName;
    }

    public void setEditAccountName(String editAccountName) {
        this.editAccountName = editAccountName;
    }

    public BigDecimal getConversionWeight() {
        return conversionWeight;
    }

    public void setConversionWeight(BigDecimal conversionWeight) {
        this.conversionWeight = conversionWeight;
    }

    public BigDecimal getConversionVolume() {
        return conversionVolume;
    }

    public void setConversionVolume(BigDecimal conversionVolume) {
        this.conversionVolume = conversionVolume;
    }

    @Override
    public String toString() {
        return "BmsMateriel{" +
                "id=" + id +
                ", materielCode=" + materielCode +
                ", materielName=" + materielName +
                ", materielType=" + materielType +
                ", materielTypeName=" + materielTypeName +
                ", defaultUnit=" + defaultUnit +
                ", defaultUnitName=" + defaultUnitName +
                ", brandId=" + brandId +
                ", brandName=" + brandName +
                ", packetWeight=" + packetWeight +
                ", packetWeightName=" + packetWeightName +
                ", colourCode=" + colourCode +
                ", colourName=" + colourName +
                ", technologyCode=" + technologyCode +
                ", technologyName=" + technologyName +
                ", palletNumber=" + palletNumber +
                ", netWeight=" + netWeight +
                ", grossWeight=" + grossWeight +
                ", convertedWeight=" + convertedWeight +
                ", materielLong=" + materielLong +
                ", materielWide=" + materielWide +
                ", materielHigh=" + materielHigh +
                ", status=" + status +
                ", organizationName=" + organizationName +
                ", organizationCode=" + organizationCode +
                ", organizationId=" + organizationId +
                ", topOrganizationName=" + topOrganizationName +
                ", topOrganizationCode=" + topOrganizationCode +
                ", topOrganizationId=" + topOrganizationId +
                "}";
    }
}
