package com.cursopatrones.singleton;

import com.cursopatrones.singleton.moderna.LoggerSingletonEnum;

public class Demo {

	public static void main(String[] args) {
		var s1=LoggerSingleton.getInstance();
		var s2=LoggerSingleton.getInstance();
		System.out.println(s1==s2);

		var e1=LoggerSingletonEnum.INSTANCE;
		var e2=LoggerSingletonEnum.INSTANCE;
		System.out.println(e1==e2);
	}

}
