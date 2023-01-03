package kr.co.ch03;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AOPService {

	@Pointcut("execution(* kr.co.ch03.AOPService.insert*(..))")
	public void insertPointcut() {}
	@Pointcut("execution(* kr.co.ch03.AOPService.select*(..))")
	public void selectPointcut() {}
	
	
	@After("insertPointcut()")
	public void insert() {
		System.out.println("핵심관심 - insert...");
	}
	
	@After("selectPointcut()")
	public void select() {
		System.out.println("핵심관심 - select...");
	}
	
	public void update() {
		System.out.println("핵심관심 - update...");
	}
	
	public void delete() {
		System.out.println("핵심관심 - delete...");
	}
}
