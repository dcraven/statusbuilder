package com.dcraven.service;

import com.dcraven.model.Report;
import com.dcraven.model.StatusItem;
import com.dcraven.model.StatusType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

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

    @Test
    public void testStatusItemCreation() {
        StatusItem statusItem = new StatusItem("Test summary", "This is new test details.", StatusType.New);

        assertThat(statusItem.getCreationDate(), not(nullValue()));
        assertThat(statusItem.getModificationDate(), not(nullValue()));
        assertThat(statusItem.getStatus(), is(StatusType.New));
    }
}
