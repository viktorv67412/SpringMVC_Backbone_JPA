package com;


import com.backbone.user.test.entity.User;
import com.backbone.user.test.repository.UserRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.Test;
import org.mockito.Spy;
import org.mockito.stubbing.OngoingStubbing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

/**
 * Created by viktor on 1/10/17.
 */

@RunWith(JUnit4.class)
public class TestClass {

    private UserRepository mock;
    private User user;

    @Before
    public void init() {
        this.mock = mock(UserRepository.class);
        this.user = new User();
    }

    @Test
    public void findAll() {
        List list = mock.findAll();
        List spy = spy(list);
        doReturn(user).when(spy).get(0);
        Assert.assertEquals(spy.get(0), user);
    }

    @Test
    public void findById() {
        doReturn(user).when(mock).findOne(0);
        Assert.assertEquals(mock.findOne(0), user);
    }
}
