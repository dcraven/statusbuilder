package com.dcraven.controller;

import com.dcraven.model.Report;
import com.dcraven.service.StatusBuilderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class StatusBuilderController {

    @Autowired
    private StatusBuilderService statusBuilderService;

    @RequestMapping(value = "reports", method = RequestMethod.GET)
    public List<Report> getAllReports() {
        return this.statusBuilderService.getAllReportsStub();
    }

    @RequestMapping(value = "reports/:id", method = RequestMethod.GET)
    public Report getReport(@PathVariable Long id) {
        return this.statusBuilderService.getReport(id);
    }

    @RequestMapping(value = "reports/:id", method = RequestMethod.PUT)
    public Report updateReport(@PathVariable Long id, @RequestBody Report report) {
        return this.statusBuilderService.updateReport(id, report);
    }
}
