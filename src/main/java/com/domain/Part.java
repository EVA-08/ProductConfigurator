package com.domain;

public class Part {
    private int partId;
    private String partName;
    private String partInfo;
    private String partUnit;
    private String partVersion;
    private int SuperId; //SuperId值为0，则是顶层零部件，值为-1，则为独立零部件

    public int getPartId() {
        return partId;
    }

    public void setPartId(int partId) {
        this.partId = partId;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public String getPartInfo() {
        return partInfo;
    }

    public void setPartInfo(String partInfo) {
        this.partInfo = partInfo;
    }

    public String getPartUnit() {
        return partUnit;
    }

    public void setPartUnit(String partUnit) {
        this.partUnit = partUnit;
    }

    public String getPartVersion() {
        return partVersion;
    }

    public void setPartVersion(String partVersion) {
        this.partVersion = partVersion;
    }

    public int getSuperId() {
        return SuperId;
    }

    public void setSuperId(int superId) {
        SuperId = superId;
    }

    public String getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(String productNumber) {
        this.productNumber = productNumber;
    }

    public int getIsRelease() {
        return IsRelease;
    }

    public void setIsRelease(int isRelease) {
        IsRelease = isRelease;
    }

    private String productNumber;
    private int IsRelease;
}
