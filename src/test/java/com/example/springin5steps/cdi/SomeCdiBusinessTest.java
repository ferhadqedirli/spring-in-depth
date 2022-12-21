package com.example.springin5steps.cdi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class SomeCdiBusinessTest {

    @InjectMocks
    private SomeCDIBusiness business;

    @Mock
    private SomeCDIDAO dao;

    @Test
    public void testBasicScenario() {
        when(dao.getData()).thenReturn(new int[]{2, 4});
        assertEquals(4, business.findGreatest());
    }

    @Test
    public void testBasicScenario_noElements() {
        when(dao.getData()).thenReturn(new int[]{});
        assertEquals(Integer.MIN_VALUE, business.findGreatest());
    }

    @Test
    public void testBasicScenario_equalElements() {
        when(dao.getData()).thenReturn(new int[]{2, 2});
        assertEquals(2, business.findGreatest());
    }

}
