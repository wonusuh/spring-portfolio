<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>register.jsp</title>
</head>
<body>
	<h1>Unit Converter</h1>

	<!-- 
	프론트단에서 전송하는 데이터 타입을 VO화 시키고,
	백단인 컨트롤러에서도 같은 VO타입으로 받게끔 해준다.
	 -->
	<form role="form" action="/board/register" method="post">
		<div>
			<select>
				<option value="길이">길이</option>
				<option value="데이터 전송 속도">데이터 전송 속도</option>
				<option value="데이터 크기">데이터 크기</option>
				<option value="면적">면적</option>
				<option value="부피">부피</option>
				<option value="속도">속도</option>
				<option value="시간">시간</option>
				<option value="압력">압력</option>
				<option value="에너지">에너지</option>
				<option value="연비">연비</option>
				<option value="온도">온도</option>
				<option value="주파수">주파수</option>
				<option value="질량">질량</option>
				<option value="평면각">평면각</option>
			</select>
		</div>
		<div>
			<select id="length" onchange="changeOption()">
				<option value="" selected disabled>길이를 선택</option>  
				<option value="0">킬로미터</option>
				<option value="1">미터</option>
				<option value="2">밀리미터</option>
				<option value="3">마이크로미터</option>
				<option value="4">나노미터</option>
				<option value="5">마일</option>
				<option value="6">야드</option>
				<option value="7">피트</option>
				<option value="8">인치</option>
				<option value="9">해리</option>
			</select>
		</div>

		<label>From Unit(cm) : <input name="fromunit" id="fromunit" autofocus required></label>
		<button type="button" onclick="testConvert()">Convert</button>
		<br> <label>Expression : <input name="expression" id="expression" required></label> <br> <label>To Unit :
			<input name="tounit" id="tounit" required>
		</label>
		<button type="submit">Register</button>
	</form>
	<button onclick="location.href='/board/list'">Back</button>

	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

	<script type="text/javascript">
		function changeOption() {
			var option = document.getElementById("length");
			// select element에서 선택된 option의 value가 저장된다.
			optionValue = option.options[option.selectedIndex].value;
			console.log(optionValue);
			return optionValue;
		}

		function testConvert() {
			var fromUnit = document.getElementById("fromunit").value;
			var expression = document.getElementById("expression").value;
			/* http://blog.devez.net/394 */
			/* http://jun.hansung.ac.kr/CWP/Javascript/JavaScript%20Scope.html */
			eval();
			document.getElementById("expression").value = fromUnit;
			document.getElementById("tounit").value = fromUnit;
		}

		function kilometer() {
			var fromUnit = document.getElementById("fromunit").value;
			fromUnit = fromUnit / 100000;
		}
	</script>

</body>
</html>
