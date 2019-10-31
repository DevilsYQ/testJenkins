package com.devil;

import static org.junit.Assert.assertTrue;

import com.devil.dao.UserMapper;
import com.devil.domian.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * Unit test for simple App.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class AppTest
{

    @Autowired
    UserMapper mapper;
    /**
     * Rigorous Test :-)
     */
    @Test
    @Rollback(false)
    public void shouldAnswerWithTrue()
    {
        System.out.println("------");
        User user = new User();
        user.setName("haha");
        mapper.insertUser(user);
    }
}
