<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="<%=request.getContextPath()%>/css/bootstrap.css"
	rel="stylesheet" type="text/css">
<script src="<%=request.getContextPath()%>/js/jquery.js"></script>
<script src="<%=request.getContextPath()%>/js/bootstrap.js"></script>

<title>${headertext}</title>
</head>
<body>
	<!-- menu -->
	<nav class="navbar navbar-default">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="#">SweetCRM</a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li><a href="<%=request.getContextPath()%>/">Главная<span class="sr-only">(current)</span></a></li>

        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Списки<span class="caret"></span></a>
          <ul class="dropdown-menu" role="menu">
            <li><a href="<%=request.getContextPath()%>/countryes/list">Страны</a></li>
            <li><a href="<%=request.getContextPath()%>/regions/list">Регионы</a></li>
            <li><a href="<%=request.getContextPath()%>/languages/list">Языки</a></li>
            <li><a href="<%=request.getContextPath()%>/queryes/list">Запросы</a></li>
            <li><a href="<%=request.getContextPath()%>/searchsystems/list">Поисковые системы</a></li>
            <li class="divider"></li>
            <li><a href="<%=request.getContextPath()%>/parsers/list">Парсеры</a></li>
            <li class="divider"></li>
            <li><a href="<%=request.getContextPath()%>/sites/list">Сайты</a></li>
          </ul>
        </li>
        
      </ul>

      <form class="navbar-form navbar-left" role="search" name="searchform" method="post" action="search.php">
        <div class="form-group">
          <input autofocus type="text" name="searchtext" class="form-control" placeholder="Search" >
        </div>
        <button type="submit" class="btn btn-default">Найти</button>
      </form>
      <ul class="nav navbar-nav navbar-right">
        
        
        
    	<!--<li class="divider"></li>
        <li><a href="#">Здравствуйте, Sareth Zorin</a></li>
        <li class="divider"></li>
		<li><a href="?is_exit=1">Выйти</a></li>
						<li class="dropdown">
				<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Администрирование<span class="caret"></span></a>
				<ul class="dropdown-menu" role="menu">
					<li><a href="./admin_show_users.php">Список пользователей</a></li>
					<li class="divider"></li>
					<li><a href="./admin_create_user.php">Создать пользователя</a></li>
				</ul>
				</li>
		-->
        
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>


	<script type="text/javascript">
		$(document).ready(function () {
			$('.dropdown-toggle').dropdown();
		});
	</script>
