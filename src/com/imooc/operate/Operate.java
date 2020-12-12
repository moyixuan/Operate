package com.imooc.operate;

public class Operate {

	public static void main(String[] args) {
		// Java加法运算符
		int result;
		int num1 = 10, num2 = 5;
		result = num1 + num2;
		
		System.out.println("Java加法："+num1+"+"+num2+"=" + result);
		//字符串链接  105
		System.out.println(""+num1+num2);
		
		//减法
		result = num1 - num2;
		System.out.println("Java减法："+num1 +"-"+num2+"="+result);
		
		//乘法
		result = num1 * num2;
		System.out.println("Java乘法：" + num1+"*" + num2+"="+result);
		
		//除法
		result = num1 / num2;
		//分子分母都是整型时，结果为整除后的结果
		System.out.println("Java除法：" + num1+"/" + num2+"="+result);
		//分子分母都是小数时，结果为小数后的结果
		System.out.println("13.0/5=" + 13.0/5);
		
		//求余数
		result = 13 % num2;
		System.out.println("13%"+num2+"="+result);
		System.out.println("13.5%5="+(13.5%5));
	}

}
