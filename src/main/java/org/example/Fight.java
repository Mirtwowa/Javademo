package org.example;

public class Fight {

	
	public static void main(String[] args) {
		Tank tank1,tank2;
		tank1 =new Tank();
		tank2 = new Tank();
		tank1.setBulletAmount(10);
		tank2.setBulletAmount(10);
		System.out.println("tank1的炮弹数量"+tank1.getBulletAmount());
		System.out.println("tank2的炮弹数量"+tank2.getBulletAmount());
		tank1.speedup(80);
		tank2.speedup(90);
		System.out.println("tank1目前的速度"+tank1.getSpeed());
		System.out.println("tank2目前的速度"+tank2.getSpeed());
        tank1.slowdown(15);
        tank2.slowdown(30);
        System.out.println("tank1目前的速度"+tank1.getSpeed());
        System.out.println("tank2目前的速度"+tank2.getSpeed());
        tank1.brake();
        tank2.brake();
        System.out.println("tank1目前的速度"+tank1.getSpeed());
        System.out.println("tank2目前的速度"+tank2.getSpeed());
        System.out.println("tank1开火：");
        tank1.fire();
        System.out.println("tank2开火：");
        tank2.fire();
        tank2.fire();
        System.out.println("tank1的炮弹数量"+tank1.getBulletAmount());
        System.out.println("tank2的炮弹数量"+tank2.getBulletAmount());
	}

}
