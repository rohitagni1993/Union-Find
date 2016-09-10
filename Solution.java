package com.coursera.rohitagni;

import java.util.*;

class QuickFindUF{
	private int[] id;
	
	public QuickFindUF(int N){
		id = new int[N];
		for (int i = 0 ; i < N ; i++)
			id[i] = i;
	}
	
	public boolean connected(int p, int q){
		return id[p]==id[q];
	}
	
	public void union(int p, int q){
		int pid = id[p];
		int qid = id[q];
		for (int i = 0 ; i < id.length ; i++)
			if (id[i] == pid) 
				id[i] = qid;
	}
}

/*class UF{
	UF(int n){
		int[] id = new int[n];
	}
}*/

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		QuickFindUF uf = new QuickFindUF(N);
		
		for (int i = 0 ; i < N ; i++){
			int p = sc.nextInt();
			int q = sc.nextInt();
			if (!uf.connected(p,q)){
				uf.union(p,q);
				System.out.println(p+" and "+q+" are now connected!");
			}
			else
				System.out.println(p+" and "+q+" are already connected");
		}
		sc.close();
	}
}
