package controller.introduce;

import controller.Controller;
import controller.HttpUtil;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class IntroduceListController implements Controller{

	@Override
	public void Execute(HttpServletRequest req, HttpServletResponse resp) {
		
		//
		//
		//
		//
		System.out.println("IntroduceListController에 진입");
		//View로 이동
		HttpUtil.Forward(req, resp, "/WEB-INF/View/introduce/list.jsp");
		
		
	}

}
