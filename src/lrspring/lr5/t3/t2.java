import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;

import static org.junit.jupiter.api.Assumptions.assumeTrue;

class QuarterlyBonusTest {

    @Test
    public void testCalculateQuarterlyBonusForManagers() {
        Employee manager = new Employee(true);
        Employee nonManager = new Employee(false);

        Assertions.assertEquals(calculateQuarterlyBonus(manager), 10000.0, "Премиум для менеджеров");
        Assertions.assertEquals(calculateQuarterlyBonus(nonManager), 0.0, "Нет бонуса для простых сотрудников");
    }

    @Test
    public void testCalculateQuarterlyBonusForNonManagers() {
        Employee nonManager = new Employee(false);

        Assertions.assertEquals(calculateQuarterlyBonus(nonManager), 0.0, "Нет бонуса для простых сотрудников");
    }

    @Test
    public void testCalculateQuarterlyBonusForManagersWithDifferentSalaries() {
        Employee highPaidManager = new Employee(true, 200_000);
        Employee lowPaidManager = new Employee(true, 100_000);

        Assertions.assertEquals(calculateQuarterlyBonus(highPaidManager), 20_000.0, "Премиум для высокооплачиваемых менеджеров");
        Assertions.assertEquals(calculateQuarterlyBonus(lowPaidManager), 10_000.0, "Премиум для менее оплачиваемых менеджеров");
    }
}