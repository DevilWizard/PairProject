package utils;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Calculator的测试类
 *
 * @author wizardk
 * @email ozx1341530199@gmail.com
 */
public class CalculatorTest {
    @Test
    public void calculateTest() {
        List<String> exps = getExps();
        List<String> ans = getRealAns();
        for (int i = 0; i < exps.size(); i++) {
            Assert.assertEquals(Calculator.calculate(exps.get(i)), ans.get(i));
        }
    }

    public List<String> getExps() {
        List<String> list = new ArrayList<>();
        list.add("0 ÷ 3 = ");
        list.add("1'1/2 ÷ 0 = ");
        list.add("3 - 5 = ");
        list.add("7/7 - 8/8 = ");
        list.add("3/4 × 0 = ");
        list.add("1'7/8 × 1 = ");
        list.add("77/89 ÷ 77 + (2 ÷ 0) = ");
        list.add("66/80 ÷ 66/80 = ");
        list.add("77 × 1/77 = ");
        list.add("95 + 1'2/3 = ");
        return list;
    }

    public List<String> getRealAns() {
        List<String> list = new ArrayList<>();
        list.add("0");
        list.add(Calculator.ERROR_DIVIDE_BY_ZERO);
        list.add("-2");
        list.add("0");
        list.add("0");
        list.add("1'7/8");
        list.add(Calculator.ERROR_DIVIDE_BY_ZERO);
        list.add("1");
        list.add("1");
        list.add("96'2/3");
        return list;
    }

}
