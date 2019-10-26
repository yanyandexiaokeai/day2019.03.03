import java.util.Scanner;
public class TestFactory{
	public static void main(String[] args){
		//定义客户端
		Client client =new Client();
		System.out.println("请输入您想购买的计算机类型：mac,surface,alienware");
		Scanner scanner =new Scanner(System.in);
		String type = scanner.next();
		Computer computer = ComputerFactory.createComputer(type);
		if(computer == null){
			System.out.println("工厂不能生产指定类型的计算机："+type);
		}else{
			client.buyComputer(computer);
		}
	}
}
class Client{
	public void buyComputer(Computer computer){
		computer.printComputer();
	}
}
/**
简单工厂
1.客户端创建对象的逻辑，放到了一个静态方法中，简单工厂类
2.缺点：新增类型，需要修改工程类的判断逻辑 ocp
3.优点：客户端和具体的接口实现类的实例对象逻辑解耦
*/
class ComputerFactory{
	public static Computer createComputer(String type){
		switch(type){
			case"mac":{
				return new MacproComputer();
			}
			case"surface":{
				return new SurfaceBookComputer();
			}
			case"alienware":{
				return new AlienwareComputer();
			}
			default :
			return null;
		}
	}
}
	interface Computer{
	/**
	打印具体的计算机信息
	*/
	void printComputer();
}
class MacproComputer implements Computer{
	public void printComputer(){
		System.out.println("Mac pro漂亮，贵，好用");
	}
} 
class SurfaceBookComputer implements Computer{
        public void printComputer(){
		System.out.println("Surface 屏幕可旋转，微软出品，必是精品");
	}
} 
class AlienwareComputer implements Computer{
        public void printComputer(){
		System.out.println("Alienware 配置很高，性能好");
	}
} 
