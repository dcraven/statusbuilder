package com.dcraven.service;

import com.dcraven.model.StatusItem;
import com.dcraven.repository.ReportRepository;
import com.dcraven.repository.StatusItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatusBuilderService {

    @Autowired
    private StatusItemRepository statusItemRepository;

    @Autowired
    private ReportRepository reportRepository;

    public List<StatusItem> getAllStatusItems(Long reportId) {
        List<Long> statusItemIds = this.reportRepository.findOne(reportId).getStatusItemIdList(reportId);
        return (List<StatusItem>)this.statusItemRepository.findAll(statusItemIds);
    }
}
