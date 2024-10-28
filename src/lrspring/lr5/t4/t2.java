package com.example.test;

import org.junit.jupiter.api.Test;

import com.example.Employee;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.platform.runner.JUnitPlatformRunner;

import java.util.List;

import java.math.BigDecimal;

import java.time.Instant;

import lombok.Value;

import javax.validation.ValidationException;
import org.springframework.boot.test.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ApplicationContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@RunWith(SpringBootRunner::className(JUnitPlatformRunner.class))
public class QuarterlyBonusTest {

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @After
    public void teardown() {
        clearCache();
    }

    private Employee manager;
    private Employee nonManager;

    // Setup employees
    {
        manager = new Employee(true);
        nonManager = new Employee(false);
    }

    /**
     * Тестируемый метод
     */
    @Test
    public void testCalculateQuarterlyBonusForManagers() {
        Assertions.assertEquals(QuarterlyBonus.calculateQuarterlyBonus(manager), BigDecimal.valueOf(10_000));
        Assertions.assertFalse(QuarterlyBonus.calculateQuarterlyBonus(nonManager) > 0);
    }

    /** Тест для сотрудников, которые не менеджеры */
    @Test
    public void testCalculateQuartelyBonusForNonManagers(){
        Assertions.assertThrows(ValidationException.class, () -> QuarterlyBonus.calculateQuartelyBonus(nonManager));
    }

    /* Другие тесты */
}