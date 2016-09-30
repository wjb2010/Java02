
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 逻辑类型
		// 只关心真假两种情况
		boolean b = true;
		b = false;

		boolean ret = true;
		// 判断结果只有成立和不成立
		// 所以结果存在布尔类型变量中
		int a = 3;
		int c = 3;

		ret = 5 > 3;

		// 重要的编码规范,比较中常量在前变量在后
		ret = 2 == a;
		String as = "3";
		String bs = "3";

		boolean res = as.equals(bs);
		System.out.println(res);

		// 并行判断的写法
		// 与,或,非
		ret = a > 3 && a < 10;
		ret = a > 3 || a < 47;
		ret = a > 9;
		// 自定义一个变量a
		// 1,判断a是否满足大于50,小于100
		// 2,判断a是否满足大于50或者小于100
		// 3,判断a是否满足大于50,小于100及不等于60
		int a0 = 3;
		// 短路效应:与,表达式1为假,不会执行表达式2
		// 短路效应:或,表达式1为真,不会执行表达式2
		// 逻辑非:注意优先级,与谁优先结合

		ret = a0 > 50 && a0 < 100;
		ret = a0 > 50 || a0 < 100;
		ret = a0 > 50 && a0 < 100 && a0 != 60;
		System.out.println(ret);

		// ret=;
		System.out.println(ret);
		// 逻辑非
		boolean ret2 = true;
		// 结果取反
		ret2 = !ret2;
		System.out.println(ret2);
		// !优先级大,必要时需加括号

		// 分支结构if
		if (a < 5) {
			System.out.println("a小");
		}
		System.out.println("Point");

		// 练习1:自定义两个变量,找到两个变量中最大的数.
		// 练习2:有一个字符,如果是m,则输出男性.
		// 注意字符如何比较?

		// 1.
		int a1 = 1;
		int b1 = 2;

		if (a1 > b1 || a1 < b1) {

			if (a1 < b1) {
				System.out.println("b1大");
			}

			if (a1 > b1) {
				System.out.println("a1大");
			}

		}

		// 2
		char c1 = 'm';
		if (c1 == 'm') {
			System.out.println("男性");
		} else {
			System.out.println("女性");
		}

		// if else语句
		if (a < b1) {
			System.out.println("a<b1");
		} else {
			System.out.println("a>=b1");
		}

		// if else if ,else

		if ('n' == c1) {
			System.out.println("女性");
		} else if ('m' == c1) {
			System.out.println("男性");
		} else {
			System.out.println("中性");
		}

		int x = 10;
		int y = 0;
		if (x < 2) {
			y = x * 2;

			System.out.println(y);
		} else if (x >= 2 && x < 10) {
			y = x * x;
			System.out.println(y);
		} else {
			y = x * 3 + 1;
			System.out.println(y);
		}

		if (x < y) {
			System.out.println("y大");
		} else if (x > y) {
			System.out.println("x大");
		} else {
			System.out.println("xy相等");
		}

		// 练习1:年龄45岁,20,40,60三挡输出,青年,中年,老年
		int age = 45;
		if (age > 20 && age <= 40) {
			System.out.println("青年");
		} else if (age > 40 && age <= 60) {
			System.out.println("中年");
		} else if (age > 60) {
			System.out.println("老年");
		} else {
			System.out.println("少年");
		}

		// 练习2:判断一个字符是大写,小写字母或数字中的一种
		char c2 = '6';

		if (c2 >= 'A' && c2 <= 'Z') {
			System.out.println("大写字母");
		} else if (c2 >= 'a' && c2 <= 'z') {
			System.out.println("小写字母");
		} else if (c2 >= '0' && c2 <= '9') {
			System.out.println("数字");
		} else {
			System.out.println("其他字符");
		}

		int g = b ? c2++ : c;
		System.out.println(g);
		// 练习1,求a和b中的最小值
		// 练习2,求a,b,c中的最大值
		int a5 = 6;
		int b5 = 4;
		int max = 0;
		int min = a5 > b5 ? b5 : a5;
		// 使用结果与其他值比对
		System.out.println(min);

		int day = 3;
		if (day == 1) {
			System.out.println("星期一");
		} else if (day == 2) {
			System.out.println("星期二");
		} else if (day == 3) {
			System.out.println("星期三");
		} else if (day == 4) {
			System.out.println("星期四");
		} else if (day == 5) {
			System.out.println("星期五");
		} else if (day == 6) {
			System.out.println("星期六");
		} else if (day == 7) {
			System.out.println("星期日");
		}

		// switch case结构

		switch (day) {
		case 1:
			System.out.println("星期一");
			break;
		case 2:
			System.out.println("星期二");
			break;
		case 3:
			System.out.println("星期三");
			break;
		case 4:
			System.out.println("星期四");
			break;
		case 5:
			System.out.println("星期五");
			break;
		case 6:
			System.out.println("星期六");
			break;
		case 7:
			System.out.println("星期日");
			break;
		default:
			System.out.println();
			break;
		}

		// 练习:1~4春夏秋冬
		// 1.与case顺序无关(正常使用时)
		// 2.若所有case都无法匹配,会进入Default中执行.
		// 3.break代表中断退出的意思,不加break的时候程序会继续向下一个case执行.直到遇到下一个break或者执行完整个switch为止.
		// 4.case后面只能加常量,不能加变量
		// 5. keyValue支持byte,short,int,char ,String
		int season = 3;
		switch (season) {
		case 1:
			System.out.println("春");
			break;
		case 2:
			System.out.println("夏");
			break;
		case 3:
			System.out.println("秋");
			break;
		case 4:
			System.out.println("冬");
			break;
		default:
			System.out.println("无数据");
			break;
		}

	}

}
