package com.dcraven.model;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ReportTest {

    @Test
    public void reportTestStatusList() {
        Report report = new Report();
        report.addStatusItem(new StatusItem("Test summary", "This is test details", StatusType.New));
        report.addStatusItem(new StatusItem("Test summary again", "This is test details again", StatusType.New));

        System.out.println(report);
        assertThat(report.isEmpty(), is(false));
        assertThat(report.getStatusItemList().get(1).getSummary(), is("Test summary again"));
    }
}
