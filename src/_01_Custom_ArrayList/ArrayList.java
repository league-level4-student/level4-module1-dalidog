package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	Object [] elements =  new Object[10];
	int size=0;
	
	public ArrayList() {
		
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		
		return (T) elements[loc];
	}
	
	public void add(T val) {
		elements[size]=val;
		size=size+1;
	}
	public int size() {
		return size;
		
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		for (int i = elements.length-2; i >= 0; i--) {
		
			if(i<loc) {
				
			}
			else if(i>=loc){
				elements[i+1]=elements[i];
			}
		}
		elements[loc]=val;
		size=size+1;
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		elements[loc]=val;
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		for (int j = loc; j < elements.length-2; j++) {
		elements[j]=elements[j+1];
		}
		size=size-1;
	}
	
	public boolean contains(T val) {
		for (int i = 0; i < elements.length-2; i++) {
			if(elements[i]== val) {
				return true;
			}
			
		}
		return false;
	}
	}