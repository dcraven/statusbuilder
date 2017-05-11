package com.dcraven.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Entity
@Table(name = "Reports")
public class Report {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @OneToMany
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

    public boolean addStatusItem(StatusItem statusItem) {
        return this.statusItemList.add(statusItem);
    }

    public boolean isEmpty() {
        return statusItemList.isEmpty();
    }

    @Override
    public String toString() {
        return "Report{" +
                "statusItemList=" + statusItemList +
                '}';
    }
}
