package com.mario.question4;

public class RoomQ4 {
	private int roomNo;
	private String roomType;
	private double roomArea;
	private int ACmachine;

	public RoomQ4(int roomNo, String roomType, double roomArea, int ACmachine) {
		this.setData(roomNo, roomType, roomArea, ACmachine);
	}

	public void setData(int roomNo, String roomType, double roomArea, int ACmachine) {
		this.roomNo = roomNo;
		this.roomType = roomType;
		this.roomArea = roomArea;
		this.ACmachine = ACmachine;
	}

	public void displayData(RoomQ4 room) {
		System.out.println(room.roomNo);
		System.out.println(room.roomType);
		System.out.println(room.roomArea);
		System.out.println(room.ACmachine);
	}
}
