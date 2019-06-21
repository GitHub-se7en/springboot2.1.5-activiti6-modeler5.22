package com.java.boot2activiti6modeletogether0617;

import org.activiti.engine.HistoryService;
import org.activiti.engine.history.HistoricProcessInstance;
import org.activiti.engine.history.HistoricTaskInstance;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @ClassName HistoryServiceTest
 * @Description 第一个是想测试版本是否是兼容的
 * @Author itw_zhaowg
 * @Date 2019/6/17 17:22
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Boot2Activiti6ModeleTogether0617ApplicationTests.class)
public class HistoryServiceTest {
    @Autowired
    private HistoryService historyService;

    @Test
    public void query() {

        List<HistoricProcessInstance> historicProcessInstances = historyService.createHistoricProcessInstanceQuery().list();
        for (HistoricProcessInstance historicProcessInstance : historicProcessInstances) {
            System.out.println(historicProcessInstance);
        }

    }

}
