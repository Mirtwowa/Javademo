package org.example;

public class Tank {
   double speed;
   int bulletAmount;
   
	void speedup(int s){
		speed=speed+s;
		if(speed>=220){
			speed=220;
		}
	}
	
	void slowdown(int d){
		if(speed-d>=0){
			speed=speed-d;
			
		}
		else{
			speed=0;
			
		}
	}
	
	void brake(){
		speed=0;
	}
	
	void setBulletAmount(int m){
		bulletAmount=m;
	}
	
	
	
	int getBulletAmount(){
		return bulletAmount;
	}
	
	
	
	double getSpeed(){
		return speed;
	}
	
	void fire(){
		if(bulletAmount>=1){
			bulletAmount=bulletAmount-1;
			System.out.println("打出一发炮弹");
		}
		else{
			System.out.println("没有炮弹了，无法开火");
		}
	}
	
	public static void main(String[] args) {
		
	}

}
