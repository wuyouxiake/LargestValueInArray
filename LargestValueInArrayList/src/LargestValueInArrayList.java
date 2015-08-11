import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class LargestValueInArrayList {
	public static void main(String[] args){
		Random r = new Random();
		int ran_num;
		ArrayList<Integer> list1=new ArrayList<>();
		ArrayList<Integer> list2=new ArrayList<>();
		for(int i=0;i<10;i++){
			ran_num = 1 + r.nextInt(100);
			list1.add(ran_num);
			list2.add(ran_num);
		}
		for(int i=0;i<10;i++){
			System.out.print(list1.get(i)+"\t");
		}
		System.out.println();
		int temp=0;
		for(int i=1;i<10;i++){
			if(list1.get(i-1)>list1.get(i)){
				temp=list1.get(i-1);
				list1.set(i-1, list1.get(i));
				list1.set(i, temp);
			}else{}
		}
		System.out.println("The largest value is "+list1.get(9));
		for(int i=0;i<10;i++){
			if(list2.get(i)==list1.get(9)){
				System.out.println(list1.get(9)+" is in slot "+i);
			}
		}
	}
}
