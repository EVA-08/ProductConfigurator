package com.domain;

public class Parameters {
    private int ParaId;
    private String ParaName;
    private String ParaInfo;
    private String ParaType;
    private String paraValue;
    private String paraValField;
    private String paraValExp;
    private int SuperId;
    private int ProductNumber;
    private int IsInput;
    private String UserPrompt;
    private int IsRelease;

    public int getIsRelease() {
        return IsRelease;
    }

    public void setIsRelease(int isRelease) {
        IsRelease = isRelease;
    }

    public int getParaId() {
        return ParaId;
    }

    public void setParaId(int paraId) {
        ParaId = paraId;
    }

    public String getParaName() {
        return ParaName;
    }

    public void setParaName(String paraName) {
        ParaName = paraName;
    }

    public String getParaInfo() {
        return ParaInfo;
    }

    public void setParaInfo(String paraInfo) {
        ParaInfo = paraInfo;
    }

    public String getParaType() {
        return ParaType;
    }

    public void setParaType(String paraType) {
        ParaType = paraType;
    }

    public String getParaValue() {
        return paraValue;
    }

    public void setParaValue(String paraValue) {
        this.paraValue = paraValue;
    }

    public String getParaValField() {
        return paraValField;
    }

    public void setParaValField(String paraValField) {
        this.paraValField = paraValField;
    }

    public String getParaValExp() {
        return paraValExp;
    }

    public void setParaValExp(String paraValExp) {
        this.paraValExp = paraValExp;
    }

    public int getSuperId() {
        return SuperId;
    }

    public void setSuperId(int superId) {
        SuperId = superId;
    }

    public int getProductNumber() {
        return ProductNumber;
    }

    public void setProductNumber(int productNumber) {
        ProductNumber = productNumber;
    }

    public int getIsInput() {
        return IsInput;
    }

    public void setIsInput(int isInput) {
        IsInput = isInput;
    }

    public String getUserPrompt() {
        return UserPrompt;
    }

    public void setUserPrompt(String userPrompt) {
        UserPrompt = userPrompt;
    }
}
