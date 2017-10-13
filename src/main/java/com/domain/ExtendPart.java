package com.domain;

import java.util.List;

public class ExtendPart {
    private Part part;
    private List<Parameters> parametersList;
    private List<Part> subPartList;

    public Part getPart() {
        return part;
    }

    public void setPart(Part part) {
        this.part = part;
    }

    public List<Parameters> getParametersList() {
        return parametersList;
    }

    public void setParametersList(List<Parameters> parametersList) {
        this.parametersList = parametersList;
    }

    public List<Part> getSubPartList() {
        return subPartList;
    }

    public void setSubPartList(List<Part> subPartList) {
        this.subPartList = subPartList;
    }


}
