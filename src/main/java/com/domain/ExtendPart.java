package com.domain;

import java.util.List;

public class ExtendPart {
    private Part part;
    private List<Parameters> parametersList;
    private List<ExtendPart> subExtendPartList;
    private List<Constrains> constrainsList;

    public List<Constrains> getConstrainsList() {
        return constrainsList;
    }

    public void setConstrainsList(List<Constrains> constrainsList) {
        this.constrainsList = constrainsList;
    }

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

    public List<ExtendPart> getSubExtendPartList() {
        return subExtendPartList;
    }

    public void setSubExtendPartList(List<ExtendPart> subExtendPartList) {
        this.subExtendPartList = subExtendPartList;
    }

}
