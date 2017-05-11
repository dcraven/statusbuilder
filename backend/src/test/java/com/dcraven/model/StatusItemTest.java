package com.dcraven.model;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class StatusItemTest {

    @Test
    public void statusItemGetSummary() {
        StatusItem statusItem = new StatusItem
                ("This is a test summary", "This is a test details", StatusType.New);
        System.out.println(statusItem);

        assertThat(statusItem.getSummary(), is("This is a test summary"));
    }
}
