package com.domain;

public class Constrains {
    private int ConsId;
    private String ConsName;
    private String Expression;
    private String Description;
    private String Alert;
    private int ProductNumber;
    private String ConsType;
    private int IsRelease;

    public int getConsId() {
        return ConsId;
    }

    public void setConsId(int consId) {
        ConsId = consId;
    }

    public String getConsName() {
        return ConsName;
    }

    public void setConsName(String consName) {
        ConsName = consName;
    }

    public String getExpression() {
        return Expression;
    }

    public void setExpression(String expression) {
        Expression = expression;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getAlert() {
        return Alert;
    }

    public void setAlert(String alert) {
        Alert = alert;
    }

    public int getProductNumber() {
        return ProductNumber;
    }

    public void setProductNumber(int productNumber) {
        ProductNumber = productNumber;
    }

    public String getConsType() {
        return ConsType;
    }

    public void setConsType(String consType) {
        ConsType = consType;
    }

    public int getIsRelease() {
        return IsRelease;
    }

    public void setIsRelease(int isRelease) {
        IsRelease = isRelease;
    }
}
