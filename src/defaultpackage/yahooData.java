package defaultpackage;

//this class is dowloading historical data for a specific stock
//starting at a date and finishing at specific date
//the data is going to be saved in a specified directory
//as a .csv file. The name of the file will be symbol_Daily.csv
import java.io.*;
import java.net.*;

public class yahooData {
	private String mSymbol;
	private String mDirectory;
	private Date mStartDate, mEndDate;
	private String mFileName;

	// constructors
	yahooData(String s, String d, Date st, Date end){
		mSymbol = s;
		mDirectory = d;
		mStartDate = new Date(st);
		mEndDate = new Date(end);
		mFileName = mDirectory + mSymbol + "_Daily.csv";
	}
	
	yahooData(String s, String d, String f, Date st, Date end){
		mSymbol = s;
		mDirectory = d;
		mStartDate = new Date(st);
		mEndDate = new Date(end);
		mFileName = mDirectory + f;
	}
	
//	load the data from yahoo
//	The, Class File, in java is used here, it helps you create and delete 
//	files as well as moving and finding, but not reading 
//	fileReader, lets you read character by character from a file or an array
//	bufferreader, allows you to read a line form the fileReader
	public boolean load(){
//		create a URL 
		String strUrl = "http;//chart.finance.yahoo.com/table.csv?s=";
		strUrl += mSymbol + "&a" + mStartDate.getMonth() + "&b=" + 
				+ mStartDate.getDay() + "&c=" + mStartDate.getYear();
		strUrl += "&d=" + mEndDate.getMonth() + "&e=" + 
				mEndDate.getDay() + "&f=" + mEndDate.getYear();
		strUrl += "&g=d&ignore=.csv";
//		connect to yahoo
		
//		get the data
		return true;
		
	}
	
	
	
	// accessors
	public String getSymbol(){
		return mSymbol;
	}
	
	public String getDirectory(){
		return mDirectory;
	}
	
	public Date getStartDate(){
		return mStartDate;
	}
	
	public Date getEndDate(){
		return mEndDate;
	}
	
	public String getFileName(){
		return mFileName;
	}
	
	public void setSymbol(String s){
		mSymbol = s;
	}
	
	public void setDirectory(String d){
		mDirectory = d;
	}
	
	public void setStartDate(Date d){
		mStartDate = new Date(d);
	}
	
	public void setEndDate(Date d){
		mEndDate = new Date(d);
	} 
	
	public void setFileName(String f){
		mFileName = f;
	}
	
	
}
