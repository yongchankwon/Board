<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

     <div id='header' class='row'>
            <div id=header-left class='col-1'> 
                <!-- 오프캔버스(Left 적용) -->
                <a type="button" data-bs-toggle="offcanvas" data-bs-target="#offcanvasleft" aria-controls="offcanvasRight">Menu</a>

                <div class="offcanvas offcanvas-start" tabindex="-1" id="offcanvasleft" aria-labelledby="offcanvasRightLabel">
                  <div class="offcanvas-header">
                    <h5 id="offcanvasRightLabel">Menu</h5>
                    <button type="button" class="btn-close text-reset" data-bs-dismiss="offcanvas" aria-label="Close"></button>
                  </div>
                  <div class="offcanvas-body">
                    안녕하세요.<br>
                    게시판입니다.
                  </div>
                </div>
            </div>

            <div id=header-center class='col-9'></div>
            
            <div id=header-right  class='col-2'>
            	<ul style="list-style:none;padding:0px;text-align:right;">
            		<a href="/LogoutProc.do" class='btn btn-primary'>로그아웃</a> 
            		 <a href="#" class='btn btn-primary'>고객센터</a> 
            	</ul>
            </div>

 </div>