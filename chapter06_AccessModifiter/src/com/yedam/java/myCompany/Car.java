package com.yedam.java.myCompany;

import com.yedam.java.hankook.SnowTire;
import com.yedam.java.hyundai.Engine;
import com.yedam.java.kumho.BigWidthTire;

public class Car {
	Engine engine = new Engine();
	SnowTire tire1 = new SnowTire();
	BigWidthTire tire2 = new BigWidthTire();
	com.yedam.java.hankook.Tire tire3 = new com.yedam.java.hankook.Tire();   //하나의 프로젝트에 패키지에 겹치는 명칭이있다면 경로로 지정하는게 좋음
	com.yedam.java.kumho.Tire tire4 = new com.yedam.java.kumho.Tire();
	

}
