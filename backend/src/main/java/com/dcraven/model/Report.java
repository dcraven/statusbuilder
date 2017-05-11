package com.dcraven.model;

import java.util.List;

public class Report {
    List<StatusItem> statusItemList;

    public List<StatusItem> getStatusItemList() {
        return statusItemList;
    }

    public void setStatusItemList(List<StatusItem> statusItemList) {
        this.statusItemList = statusItemList;
    }

    @Override
    public String toString() {
        return "Report{" +
                "statusItemList=" + statusItemList +
                '}';
    }
}
