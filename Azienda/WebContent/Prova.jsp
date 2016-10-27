<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>



<jsp:useBean id="admin" class="it.alfasoft.fabrizio.bean.Admin"
	scope="session"></jsp:useBean>



<!--        header di pagina  -->

<jsp:include page="headerHtml.jsp"></jsp:include>



<!-- nav bar starts -->

<jsp:include page="navBarAdmin.jsp"></jsp:include>



<div class="ch-container">

	<div class="row">



		<!-- left menu starts -->

		<jsp:include page="menuLateraleAdmin.jsp"></jsp:include>

		<!-- left menu ends -->



		<noscript>

			<div class="alert alert-block col-md-12">

				<h4 class="alert-heading">Warning!</h4>



				<p>
					You need to have <a href="http://en.wikipedia.org/wiki/JavaScript"
						target="_blank">JavaScript</a> enabled to use this site.
				</p>

			</div>

		</noscript>



		<div id="content" class="col-lg-10 col-sm-10">

			<!-- content starts -->

			<div>

				<ul class="breadcrumb">

					<li><a href="#">Home :${admin.nome}</a></li>



				</ul>

			</div>

			<div class=" row">



				<!--       devo scrivere per ogni pagina   -->













			</div>
			<!-- content ends -->

		</div>
		<!--/#content.col-md-0-->

	</div>
	<!--/fluid-row-->









	<hr>



	<jsp:include page="footer.jsp"></jsp:include>





</div>
<!--/.fluid-container-->



<!--      includo tutti script di sotto -->

<jsp:include page="IncludeScriptEnd.jsp"></jsp:include>