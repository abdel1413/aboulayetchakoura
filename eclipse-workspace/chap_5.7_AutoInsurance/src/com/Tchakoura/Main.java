package com.Tchakoura;


		public class Main {

			public static void main(String[] args) {
				AutoPolicy auto = new AutoPolicy(12334," toyota camry"," NY");
			System.out.println(	auto.getAccountNumbe());
			System.out.println(	auto.getMakeAndModel());
		    System.out.println(auto.getState());
			System.out.println(auto.isNoFaultState());
			
			
			System.out.println();
			AutoPolicy auto2 = new AutoPolicy(34543," nissan ", " CU");
			System.out.println(auto2.isNoFaultState());
			
			AutoPolicy.policyInNoFaultState(auto2);
			System.out.println();
			AutoPolicy.policyInNoFaultState(auto);

			}

		


	}


