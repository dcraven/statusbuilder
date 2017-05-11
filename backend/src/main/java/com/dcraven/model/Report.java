package com.dcraven.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Report {
    List<StatusItem> statusItemList = new ArrayList<>();

    public List<Long> getStatusItemIdList(Long id) {
        return statusItemList.stream().map(statusItem -> statusItem.getId()).collect(Collectors.toList());
    }

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
