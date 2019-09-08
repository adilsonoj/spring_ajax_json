<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
<h1>Spring func...</h1>

</body>
<script>
$(document).ready(function(){
	const obj1 = {id: 1, nome: "teste1"}
	const obj2 = {ids: 2, nomes: "teste2"}
	const lista = [obj1, obj1]


	//DTO
	fetch('dto', {
		method: "POST",
		 headers: {
		      'Accept': 'application/json',
		      'Content-Type': 'application/json'
	    },
	    body: JSON.stringify({lista: lista, obj2, obj1})
	}).then(response => response.json())
	  .then(data => console.log('dto :)', data))
	
	  //LISTA
	fetch('lista', {
		method: "POST",
	 	headers: {
	      'Accept': 'application/json',
	      'Content-Type': 'application/json'
	    },
	    body: JSON.stringify(lista)
	}).then(response => response.json())
	  .then(data => console.log('lista :)', data))  
	
	  //Passando dois objetos, necessário uso de DTO
	fetch('obj1obj2', {
		method: "POST",
 		headers: {
		      'Accept': 'application/json',
		      'Content-Type': 'application/json'
	    },
	    body: JSON.stringify({ ...obj1, ...obj2 })
	}).then(response => response.json())
	  .then(data => console.log('Dois objetos :)', data))
	
	//jquery ajax, mas já podemos matar jquery :)
	$.ajax({
	  method: "POST",
	  url: "dto",
	  contentType: 'application/json',
	  data: JSON.stringify({lista, obj2, obj1})
	}).done(data => {
		  console.log('ajax :(', data)
	  });
	
})
	
</script>
</html>