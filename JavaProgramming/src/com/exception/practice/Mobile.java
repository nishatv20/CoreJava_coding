package com.exception.practice;

public class Mobile {
	private int model_no;
	private String screen_type;
	private int screen_size;
	private Storage storage;

	public Mobile(int model_no, String screen_type, int screen_size, Storage storage) {
		this.model_no = model_no;
		this.screen_type = screen_type;
		this.screen_size = screen_size;
		this.storage = storage;
	}

	public int getModelNo() {
		return model_no;
	}

	public void getMobileData() {
		System.out.println("***********************");
		System.out.println("MODEL NUMBER :" + model_no);
		System.out.println("SCREEN TYPE :" + screen_type);
		System.out.println("SCREEN SIZE :" + screen_size);
		storage.getStorageData();
	}

	public int getMobileRam() {
		return storage.getRamCap();
	}

	public int getMobileStorage() {
		return storage.getStorageSerNo();
	}
}
