<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>로그인 화면</title>

<!-- Bootstrap core CSS -->
<link href="/resources/bootstrap.min.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="/resources/signin.css" rel="stylesheet">
</head>
<script>
	/* window.addEventListener('load',function() {
		alert(1);
	});
	window.addEventListener('load',function() {
		alert(2);
	}); */
	
	window.addEventListener('load',function() {
		document.querySelector('#signinBtn').onclick = function() {
			var idObj = document.querySelector('#id');
			var pwdObj = document.querySelector('#pwd');
			if(idObj.value.trim().length<4) {
				alert('ID는 4글자 이상입니다.');
				return;
			}
			if(pwdObj.value.trim().length<6) {
				alert('비밀번호는 6글자 이상입니다.');
				return;
			}
			var xhr = new XMLHttpRequest();
			xhr.open('POST', '/emp/insert');
			xhr.setRequestHeader('content-type','application/x-www-form-urlencoded');
			xhr.onreadystatechange = function() {
				if(xhr.readyState==4) {
					//document.querySelector('#rDiv').innerHTML = xhr.response;
					console.log(xhr.response);
					var obj = JSON.parse(xhr.response);
					if(obj.result==='false') {
						alert('아이디나 비밀번호가 잘못되었습니다.');
						idObj.value='';
						pwdObj.value='';
						idObj.focus();
					}else {
						location.href="/uri/index";
					}
				}
			}
			var param = 'id=' + idObj.value + '&pwd=' + pwdObj.value;
			xhr.send(param);
		}
	});
</script>
<body class="text-center">
	<form class="form-signin" action="/emp/insert" method="POST">
		<img class="mb-4" src="/resources/bootstrap-solid.svg" alt=""
			width="72" height="72">
		<h1 class="h3 mb-3 font-weight-normal">Please insert</h1>
		
		<label for="inputEmpNo" class="sr-only">empNo</label>
		<input type="text" id="empNo" class="form-control"
			placeholder="empNo" required autofocus name="empNo">
			
		<label for="inputEName" class="sr-only">eName</label>
		<input type="text" id="eName" class="form-control"
			placeholder="eName" required name="eName">
			
		<label for="inputID" class="sr-only">ID</label>
		<input type="text" id="ID" class="form-control"
			placeholder="ID" required name="ID">
			
		<label for="inputPwd" class="sr-only">Password</label>
		<input type="password" id="pwd" class="form-control"
			placeholder="Password" required name="pwd">
			
		<label for="inputComm" class="sr-only">comm</label>
		<input type="text" id="comm" class="form-control"
			placeholder="comm" required name="comm">
			
		<label for="inputMgr" class="sr-only">mgr</label>
		<input type="text" id="mgr" class="form-control"
			placeholder="mgr" required name="mgr">
			
		<label for="inputHireDate" class="sr-only">hireDate</label>
		<input type="date" id="hireDate" class="form-control"
			placeholder="hireDate" required name="hireDate">
			
		<label for="inputSal" class="sr-only">sal</label>
		<input type="number" id="sal" class="form-control"
			placeholder="sal" required name="sal">
			
		<label for="inputDept" class="sr-only">dept</label>
		<select id="dept" class="form-control">
			<c:forEach items="${deptList}" var="d">
				<option value="${d.DEPTNO}">${d.DNAME}</option>
			</c:forEach>
		</select>
			
		<label for="inputJob" class="sr-only">job</label>
		<select id="job" class="form-control">
			<option>사원</option>
			<option>대리</option>
			<option>부장</option>
			<option>차장</option>
			<option>과장</option>
		</select><br>
			
		<div class="checkbox mb-3">
			<label> <input type="checkbox" value="remember-me">
				Remember me
			</label>
		</div>
		<button class="btn btn-lg btn-primary btn-block" type="button"
			id="signinBtn">Insert</button>
		<p class="mt-5 mb-3 text-muted">&copy; 2017-2018</p>
	</form>
</body>
</html>