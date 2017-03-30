package defaultpackage;

public class Bar {

	private float open, high, low, close, AdjClose;
	private Date date;
	private long volume;
	
	public Bar(){
		date = new Date();
		open = high = low = close = AdjClose = 0.0f;
		volume = 0;
	}
	
	
	public Bar(Date d, float o, float h, float l, float c, long v, float ac){
		date = new Date(d);
		open = 0;
		high = h;
		low = l;
		close = c;
		volume = v;
		AdjClose = ac;
	}
	
	public Bar(String d, float o, float h, float l, float c, long v, float ac){
		date = new Date(d);
		open = 0;
		high = h;
		low = l;
		close = c;
		volume = v;
		AdjClose = ac;
	}
	
	public Bar(String line){
		String [] Data = line.split(",");
		if(Data.length != 7){
			System.err.println("Invaild data");
			return;
		}
		date = new Date(Data[0]);
		open = Float.parseFloat(Data[1]);
		high = Float.parseFloat(Data[2]);
		low = Float.parseFloat(Data[3]);
		close = Float.parseFloat(Data[4]);
		volume = Long.parseLong(Data[5]);
		AdjClose = Float.parseFloat(Data[6]);
		
	}
	
	public float getOpen(){
		return open;
	}
	
	public float getHigh(){
		return high;
	}
	
	public float getLow(){
		return low;
	}
	
	public float getClose(){
		return close;
	}
	
	public float getAdjC(){
		return AdjClose;
	}
	
	public long getVolume(){
		return volume;
	}
	
	public void setOpen(float o){
		this.open = o;
	}
	
	public void setClose(float c){
		this.close = c;
	}
	
	public void setHigh(float h){
		this.high = h;
	}
	
	public void setLow(float l){
		this.low = l;
	}
	
	public void setAdjC(float Ac){
		this.AdjClose = Ac;
	}
	
	public void setvolume(long v){
		this.volume = v;
	}
	
	public float range(){
		float r = high - low;
		return r;
	}
	
	
	
	
}
