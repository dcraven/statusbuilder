package com.dcraven.service;

import com.dcraven.model.Report;
import com.dcraven.model.StatusItem;
import com.dcraven.model.StatusType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.validation.constraints.NotNull;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;

@SpringBootTest
@RunWith(SpringRunner.class)
public class StatusBuilderServiceTest {

    @Autowired
    private StatusBuilderService statusBuilderService;

    @Test
    public void testGetAllStatusItems() {
        Report report = new Report();
        report.addStatusItem(new StatusItem("Test summary", "This is test details", StatusType.New));
        report.addStatusItem(new StatusItem("Test summary again", "This is test details again", StatusType.New));

        report = this.statusBuilderService.putReport(report);

        assertThat(report.getId(), not(0));
    }
}
