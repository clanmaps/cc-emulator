package edu.ecnu.cc;

import java.util.HashSet;

public class Transaction {
	private long startTime;
	private long validationTime;
	private long endTime;
	
	private HashSet<Long> readSet;
	private HashSet<Long> writeSet;
	
	public Transaction(long startTime) {
		this.startTime = startTime;
		validationTime = -1;
		endTime = -1;
		readSet = new HashSet<Long>();
		writeSet = new HashSet<Long>();
	}
	
	public long getStartTime() {
		return startTime;
	}
	
	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}
	
	public long getValidationTime() {
		return validationTime;
	}
	
	public void setValidationTime(long validationTime) {
		this.validationTime = validationTime;
	}
	
	public long getEndTime() {
		return endTime;
	}
	
	public void setEndTime(long endTime) {
		this.endTime = endTime;
	}
	
	public HashSet<Long> getReadSet() {
		return readSet;
	}
	
	public HashSet<Long> getWriteSet() {
		return writeSet;
	}
}
