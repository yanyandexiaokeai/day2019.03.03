public class Test {
    public static void main(String[] args) {
		int[] data = new int[]{1,4,3,4,55,77,6,9,8} ; 
		int max = data[0] ; // 假定第一个元素为最大值
		int min = data[0] ; // 假定第一个元素为最小值
		int sum = data[0] ;
       for (int i = 1 ; i< data.length; i++){
           sum += data[i] ;
           if (data[i]>max){
               max = data[i] ;
           }
           if (data[i]<min){
               min = data[i] ;
		   }
	   }
	   System.out.println("最大值为:" +max);
	   System.out.println("最小值为:"+min); 
	   System.out.println("总和为:"+sum);
	   System.out.println("平均值为:"+(double)sum/data.length);
	}
}
	   