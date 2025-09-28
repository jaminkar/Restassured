package Test;

import java.util.ArrayList;

public class CollectionQuestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {3,3,0,9,6,3,0,8,9,6,2,6,0,13};
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i=0; i<a.length; i++)
		{
			int k=0;
					if(!al.contains(a[i]))
					{
						al.add(a[i]);
						k++;
						for(int j=i+1; j<a.length; j++)
						{
							if(a[i]==a[j])
							{
								k++;
							}
						}
						//System.out.println("k="+k);
						if(k==1)
						{
							System.out.println(a[i]+" "+"is the Unique number");
						}
					 }
		}
		
		 System.out.println(al);
	}
}
