public class List{
	public static void main(String[] args){
		int prise1,prise2,prise3;
		prise1=245;//T恤单价
		prise2=570;//网球鞋单价
		prise3=320;//网球拍单价
		int num1,num2,num3;
		num1=2;//T恤数量
		num2=1;//网球鞋数量
		num3=1;//网球拍数量
		int discount=8;//折扣：8折
		double total=(prise1*num1+prise2*num2+prise3*num3)*discount/10;//总金额
		int payment=1500;//实付金额
		double change=payment-total;//找零
		int score=(int)(total/100*3);//积分：100元3分
		System.out.println("********消费单********");
		System.out.println("购买物品\t单价\t个数\t金额");
		System.out.println("T恤\t￥"+prise1+"\t￥"+num1+"\t￥"+prise1*num1);
		System.out.println("网球鞋\t￥"+prise2+"\t￥"+num2+"\t￥"+prise2*num2);
		System.out.println("网球拍\t￥"+prise3+"\t￥"+num3+"\t￥"+prise3*num3);
		System.out.println("");
		System.out.println("折扣:\t"+discount+"折");
		System.out.println("消费总金额:\t￥"+total);
		System.out.println("实际交费:\t￥"+payment);
		System.out.println("找钱:\t￥"+change);
		System.out.println("本次购物所获得积分是：\t"+score);
	}
}
		