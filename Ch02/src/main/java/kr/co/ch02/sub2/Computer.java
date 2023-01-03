package kr.co.ch02.sub2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("com") //어노테이션 옆에 써놓으면 이름으로 사용가능
public class Computer {
	
	// 생성자 DI
	private CPU cpu;
	
	@Autowired
	public Computer(CPU cpu) {
		this.cpu = cpu;
	}
	
	// 세터 DI
	private RAM ram;
	
	@Autowired
	public void setRam(RAM ram) {
		this.ram = ram;
	}
	
	// 필드 DI
	@Autowired
	private HDD hdd;
	
	public void show() {
		cpu.show();
		ram.show();
		hdd.show();
	}
}
