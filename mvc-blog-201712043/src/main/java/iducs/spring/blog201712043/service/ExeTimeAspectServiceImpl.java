package iducs.spring.blog201712043.service;

import org.springframework.stereotype.Service;

import iducs.spring.blog201712043.domain.Blog;

@Service
public class ExeTimeAspectServiceImpl {

	public void executeMethodAtJoinPoint(int n, Blog b) {
		
		System.out.println("ExeTimeAspectServiceImpl at Join point" + b.getTitle());
		String[] randomNames = new String[n];

		for(int i=0; i < randomNames.length; i++) {
		randomNames[i] = "";
		 for(int j=0; j < 5; j++) { // 랜덤한 5개의 대문자로 구성
		double dValue = Math.random();
		 char cValue = (char)((dValue * 26) + 65);
		//char cValue = (char)((dValue * 26) + 97);
		randomNames[i] = randomNames[i] + "" + cValue;
		 	}
		}

	}
}
