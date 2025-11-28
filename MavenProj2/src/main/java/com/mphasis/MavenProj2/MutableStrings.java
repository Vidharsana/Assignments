package com.mphasis.MavenProj2;

import java.util.StringJoiner;
import java.util.StringTokenizer;

public class MutableStrings {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer(); 
		sb.append("swapna");
		sb.append("amit");
		sb.append("preethi");
		sb.append("amit");
		sb.append("preethiiiii");
		sb.append("preethiiiii");
		System.out.println(sb);
		System.out.println(sb.capacity());
		StringBuffer sb1 = new StringBuffer("name"); 
		System.out.println(sb1.capacity());
		sb1.ensureCapacity(15);
		System.out.println(sb1.capacity());
		sb1.ensureCapacity(30);
		System.out.println(sb1.capacity());
		
		StringBuilder sb2 = new StringBuilder("Vidharsana Sundarraj");
		sb2.replace(11, 20, "*");
		System.out.println(sb2);
		sb2.reverse();
		System.out.println(sb2);
		String str="apple,banana,orange,pinapple";
		StringTokenizer st=new StringTokenizer(str,",");
		while(st.hasMoreTokens())
			System.out.println(st.nextElement());
		
		StringJoiner sj=new StringJoiner(",");
		sj.add("vidhu");
		sj.add("thari");
		sj.add("hem");
		System.out.println(sj);
	}

}
