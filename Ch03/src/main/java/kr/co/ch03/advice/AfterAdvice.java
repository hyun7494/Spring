package kr.co.ch03.advice;

import org.springframework.stereotype.Component;


@Component
public class AfterAdvice {
	
	public void after1() {
		System.out.println("횡단관심 - after1...");
	}
	public void after2() {
		System.out.println("횡단관심 - after2...");
	}
	public void after3() {
		System.out.println("횡단관심 - after3...");
	}
}
