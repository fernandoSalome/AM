<!DOCTYPE html>
<html lang="pt-br">
   <head>
      <title>Registrar - Debot</title>
      <meta charset="utf-8">
      <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
      <link href="css/home.css" rel="stylesheet">
   </head>
   <body>
      <nav class="navbar navbar-expand-lg navbar-light bg-light" style="margin-top:-50px;">
         <a class="navbar-brand" href="#">DeBot</a>
         <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
         <span class="navbar-toggler-icon"></span>
         </button>
         <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav ml-auto pull-right">
               <li class="nav-item active">
                  <a class="nav-link" href="dashboard-usuario.html">Dashboard<span class="sr-only"></span></a>
               </li>
               <li class="nav-item">
                  <a class="nav-link" href="login.html">Configurações</a>
               </li>
            </ul>
         </div>
      </nav>
      <div class="container">
         <br>
         <br>
         <h3 class="text-center">Evento</h3>
         <br>
         <hr>
         <form class="needs-validation" novalidate>
            <div class="form-row">
               <div class="col-md-12 mb-3">
                  <label for="idNome">Nome</label>
                  <input type="text" class="form-control" id="idNome" placeholder="Nome" value="" required>
               </div>
            </div>
            <div class="row">
               <div class="col-md-6">
                  <div class="form-group">
                     <label>Tópico</label>
                     <select class="custom-select" required>
                        <option value="">Escolha um tópico</option>
                        <option value="1">Garagem</option>
                        <option value="2">Festa</option>
                        <option value="3">Jardim</option>
                        <option value="4">Quintal</option>
                     </select>
                  </div>
               </div>
               <div class="col-md-6">
                  <div class="form-group">
                     <label>Tipo</label>
                     <select class="custom-select" required>
                        <option value="">Escolha o tipo de evento</option>
                        <option value="1">Votação</option>
                        <option value="2">Assunto</option>
                        <option value="3">Reclamação</option>
                     </select>
                  </div>
               </div>
            </div>
            <div class="form-row">
               <div class="col-md-6 mb-3">
                  <label for="idData">Data de início</label>
                  <input type="date" class="form-control" id="idData" required>
               </div>
               <div class="col-md-6 mb-3">
                  <label for="idData">Data de término</label>
                  <input type="date" class="form-control" id="idData" required>
               </div>
            </div>
            <button class="btn btn-primary" type="submit">Criar</button>
            <button onclick="location.reload()" class="btn btn-primary">Limpar</button>
            <a href="dashboard-usuario.html" class="btn btn-primary" >Voltar</a>
         </form>
         <hr/>

		 <div id="accordion">
		  <div class="card">
			<div class="card-header" id="headingOne">
			  <h5 class="mb-0">
				<button class="btn btn-link collapsed" data-toggle="collapse" data-target="#collapseOne" aria-expanded="false" aria-controls="collapseOne">
				  Festa de aniversário de casamento - Tipo : Evento 
				</button>
				<h6 style="margin-left:14px;">Criador : Fabiana Dias</h6>
			  </h5>
			</div>
			<div id="collapseOne" class="collapse" aria-labelledby="headingOne" data-parent="#accordion">
			  <div class="card-body">
				Festa de aniversário no salão de festas das 18:00 até as 22:00.
				<hr>
                <b>Data de agendamento</b> : 20/06/2018 18:00<br>
			  </div>
			</div>
		  </div>

		  <div class="card">
			<div class="card-header" id="headingTwo">
			  <h5 class="mb-0">
				<button class="btn btn-link collapsed" data-toggle="collapse" data-target="#collapseTwo" aria-expanded="false" aria-controls="collapseTwo">
				  Lixo residencial
				</button>
				<h6 style="margin-left:14px;;">Criador : Leila Matos</h6>
			  </h5>
			</div>
			<div id="collapseTwo" class="collapse" aria-labelledby="headingTwo" data-parent="#accordion">
			  <div class="card-body">
				Gostaria de levantar uma enquete para chegar a concenso. Onde seria o melhor lugar para deixar o lixo residencial?
				<hr>
				 <div class="form-group">
					<label for="exampleInputEmail1">Resposta</label>
					<input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Coloque sua mensagem aqui">
					<small id="emailHelp" class="form-text text-muted">Você pode comentar neste tópico.</small>
				  </div>
				 </div>
			</div>
		  </div>

		  <div class="card">
			<div class="card-header" id="headingThree">
			  <h5 class="mb-0">
				<button class="btn btn-link collapsed" data-toggle="collapse" data-target="#collapseThree" aria-expanded="false" aria-controls="collapseThree">
				  Aumentar a multa por barulho de noite
				</button>
				<h6 style="margin-left:14px;;">Criador : Rafael Dantas</h6>
			  </h5>
			</div>
			<div id="collapseThree" class="collapse" aria-labelledby="headingThree" data-parent="#accordion">
			  <div class="card-body">
				Gostaria de propor uma enquete a respeito do aumento do preço da multa por barulho á partir das 00:00 no condomínio. De 100 para 500 reais.
				<hr>
				<div class="row">
					<div class="col-md-4">
						<button type="button" class="btn btn-primary btn-lg">Sou a favor</button>
						<button type="button" class="btn btn-secondary btn-lg">Sou contra</button>
					</div>
					<div class="col-md-8">
						<div class="progress" style="margin:20px;">
							<div class="progress-bar progress-bar-success" role="progressbar" style="width:78%">
								Votos à favor
							</div>
							<div class="progress-bar progress-bar-warning" role="progressbar" style="width:22%">
								Votos contra
							</div>
						</div>
					</div>
				</div>				
			  </div>
			</div>
		  </div>
		</div>





         <br><br>
         <nav aria-label="Page navigation example">
            <ul class="pagination justify-content-center">
               <li class="page-item disabled">
                  <a class="page-link" href="#" tabindex="-1">Anterior</a>
               </li>
               <li class="page-item"><a class="page-link" href="criar-evento.html">1</a></li>
               <li class="page-item"><a class="page-link" href="criar-evento-pagina-2.html">2</a></li>
               <li class="page-item"><a class="page-link" href="#">3</a></li>
               <li class="page-item">
                  <a class="page-link" href="#">Próximo</a>
               </li>
            </ul>
         </nav>
      </div>
      <script>
         (function() {
           'use strict';
           window.addEventListener('load', function() {
          var forms = document.getElementsByClassName('needs-validation');
          var validation = Array.prototype.filter.call(forms, function(form) {
            form.addEventListener('submit', function(event) {
         	 if (form.checkValidity() === false) {
         	   event.preventDefault();
         	   event.stopPropagation();
         	 }
         	 form.classList.add('was-validated');
            }, false);
          });
           }, false);
         })();
      </script>
      <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
      <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
      <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" crossorigin="anonymous"></script>
   </body>
</html>