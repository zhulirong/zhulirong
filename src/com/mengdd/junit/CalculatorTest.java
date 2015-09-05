package com.mengdd.junit;

import junit.framework.Assert;
import junit.framework.TestCase;

public class CalculatorTest extends TestCase
{
    public void testAdd()
    {
        Calculator calculator = new Calculator();
        int result = calculator.add(1, 2);
        // �жϷ����ķ��ؽ��
        Assert.assertEquals(3, result);// ��һ������������ֵ���ڶ���������Ҫ��֤��ֵ
    }

    public void testSubtract()
    {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(1, 2);
        // �жϷ����ķ��ؽ��
        Assert.assertEquals(-1, result);// ��һ������������ֵ���ڶ���������Ҫ��֤��ֵ

    }

    public void testMultiply()
    {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(2, 3);
        // �жϷ����ķ��ؽ��
        Assert.assertEquals(6, result);// ��һ������������ֵ���ڶ���������Ҫ��֤��ֵ

    }

    public void testDivide()
    {
        Calculator calculator = new Calculator();
        int result = calculator.divide(12, 3);
        // �жϷ����ķ��ؽ��
        Assert.assertEquals(4, result);// ��һ������������ֵ���ڶ���������Ҫ��֤��ֵ

    }


}