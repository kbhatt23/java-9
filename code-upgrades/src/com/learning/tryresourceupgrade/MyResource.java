package com.learning.tryresourceupgrade;

public class MyResource  implements AutoCloseable  {

	private int id;

	public MyResource(int id) {
		this.id = id;
	}

	@Override
	public void close() throws Exception {
		if(id == -1) {
			System.out.println("Resource is already closed");
			return;
		}
		// can throw excpetion
		if (id == 3) {
			throw new ResourceExcpetion("unable to close resource");
		}
		System.out.println("Resource closed sucesfully");
		//item is closed
		id=-1;
	}

	public void process() throws Exception {
		switch (id) {
		case 1:
			System.out.println("Process completed succesfully");
			break;
		case 2:
			throw new ResourceExcpetion("Process threw exception");
		case 3:
			throw new ResourceExcpetion("Process threw exception");
		case -1:
			throw new ResourceExcpetion("Resoruce is not open");
		default:
			break;
		}
	}

}
