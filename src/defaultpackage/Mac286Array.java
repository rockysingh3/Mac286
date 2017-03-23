package defaultpackage;

import java.util.Arrays;

public class Mac286Array {
	private int nElements = 0;
	private double[] myArray;
	
	// default constructor 
	public Mac286Array(){
		nElements = 0;
		myArray = new double[100];
	}
	
	// constructor that accepts a size
	public Mac286Array(int s){
		nElements = 0;
		myArray = new double[s];
	}
	
	
	public boolean insertTail(double value){
		if(nElements >= myArray.length)
			return false;
		myArray[nElements] = value;
		nElements++;
		return true;
	}
	
	// method to see if array is full
	public boolean isFull(){
		if(myArray.length <= nElements)
			return true;
		return false;
	}
	
	public boolean isEmpty(){
		if(nElements == 0)
			return true;
		return false;
	}
	
	public void display(){
		for(int i=0; i<myArray.length; i++){
			System.out.print(myArray[i] + " ");
		}
	}
	
	public boolean insertElem(int index, double val){
		if(this.isFull())
			return false;
		// move all the values down
		for (int i=nElements-1; i>=index; i--){
			myArray[i+1] = myArray[i];
		}
		myArray[index] = val;
		nElements++;
		return true;
	}
	
//	removes an element from a spific location in the array
	public double removeElem(int e){
		if(e < 0 || e >= nElements){
			System.out.print("index does not exist!");
			return -1;
		}
		double retVal = myArray[e];
		nElements--;
		for(int i=e; i < nElements-1; i++){
			myArray[i] = myArray[i+1];
		}
		return retVal;
	}
	
//	returns an elem 
	public double elementAt(int i){
		return myArray[i];
	}
	
//	sets an element to specific value
	public void setElementAt(int index, double value){
		if(index < 0 || index >= nElements){
			return;
		}
		myArray[index] = value;
	}
//	resize an array
	public void resize(int s){
		if(s < nElements)
			return;
//		copy elems from myArray to temp
//		this method copies the old array and makes a new array with s size
		myArray = Arrays.copyOf(myArray, s);
		
		// if you dont want to use the copyof you can do this
//		double[] temp = new double[s];
//		for(int i=0; i<nElements; i++){
//			temp[i] = myArray[i];
//		}
//		myArray = temp;
		
		
	}
//	returns the max capacity of the array
	public int capacity(){
		return myArray.length;
	}
	
//	sorts the array
	public int indexSmallest(int start){
		int index = start;
		for(int i = start+1; i<nElements; i++){
			if(myArray[i] < myArray[index]){
				index = i;
			}
		}
		return index;
	}
	
//	sort the array
	public void sort(){
		for(int i=0; i < nElements-1; i++){
			int indexS = indexSmallest(i);
			if(indexS != i){
				double temp = myArray[indexS];
				myArray[indexS] = myArray[i];
				myArray[i] = temp;
			}
		}
	}
	
	
} // end of class
