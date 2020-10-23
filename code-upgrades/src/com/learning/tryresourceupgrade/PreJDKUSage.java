package com.learning.tryresourceupgrade;

public class PreJDKUSage {
	public static void main(String[] args) {
		// 1 -> sucess in both
		// 2 -> failuer in process, succes in clode
		// 3 -> failure in both

		// very verbose and complex

		// for finally scope keeping outside try

		// way too much verbose -> too much code
		MyResource resource = null;
		
		try {
			//resource = new MyResource(1);
			//resource = new MyResource(2);
			
			resource = new MyResource(3);
			resource.process();
		} catch (Exception e) {
			System.out.println("Excpetion occured while processing " + e);
		} finally {
			if (resource != null) {
				try {
					resource.close();
				} catch (Exception e) {
					System.out.println("Exception occurred while closing resource "+e);
				}
			}
		}

	}
}
