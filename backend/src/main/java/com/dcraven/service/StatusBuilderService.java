package com.dcraven.service;

import com.dcraven.model.Report;
import com.dcraven.model.StatusItem;
import com.dcraven.model.StatusType;
import com.dcraven.repository.ReportRepository;
import com.dcraven.repository.StatusItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StatusBuilderService {

    @Autowired
    private StatusItemRepository statusItemRepository;

    @Autowired
    private ReportRepository reportRepository;

    public List<StatusItem> getAllStatusItems(Long reportId) {
        List<Long> statusItemIds = this.reportRepository.findOne(reportId).getStatusItemIdList();
        return (List<StatusItem>)this.statusItemRepository.findAll(statusItemIds);
    }

    public List<Report> getAllReports() {
        return (List<Report>) this.reportRepository.findAll();
    }

    public List<Report> getAllReportsStub() {
        List<Report> reportList = new ArrayList<>();

        StatusItem item = new StatusItem("Test", "test", StatusType.New);
        StatusItem item2 = new StatusItem("Test2", "test2", StatusType.New);
        List<StatusItem> list = new ArrayList<>();
        list.add(item);
        list.add(item2);

        reportList.add(new Report("Test Title 1", list));
        reportList.add(new Report("Test Title 2", list));
        reportList.add(new Report("Test Title 3", list));

        System.out.println(reportList);
        return reportList;
    }

    public Report getReport(Long id) {
        return this.reportRepository.findOne(id);
    }

    public Report putReport(Report report) {
        return this.reportRepository.save(report);
    }

    public Report updateReport(Long id, Report report) {
        this.reportRepository.delete(id);
        report.setId(id);

        return this.reportRepository.save(report);
    }
}
