package taller3.televisores;

public class Control {
	private TV tv;
	
	public void turnOff() {
		tv.turnOff(;)
	}
	public void turnOn(){
		tv.turnOn();
	}
	public void canalUp(){
		tv.canalUp();
	}	
	public void canalDown() {
		tv.canalDown();
	}	
	public void volumeUp() {
		tv.volumeUp();
	}	
	public void volumeDown() {
		tv.volumeDown();
	}	
	public void setCanal(int canal) {
		tv.setCanal(canal);
	}
	public enlazar(TV tv) {
		this.tv = tv;
		tv.setControl(this);
	}
	public void setTV(TV tv) {
		this.tv = tv;
		return;
	}
	public TV getTV() {
		return tv;
	}	
}
	
		
