<!DOCTYPE html>
<html lang="pt-br">
   <head>
      <title>Listagem adm - Debot</title>
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
				<a class="nav-link" href="home.html">Home <span class="sr-only"></span></a>
			</li>
		  <li class="nav-item active">
			<a class="nav-link" >Bem vindo, Manuel (Sindico) <span class="sr-only"></span></a>
		  </li>
		</ul>

	  </div>
	</nav>
   
      <div class="container">
		<br>
		<br>
		<h3>Listagem predio - Dr Estela</h3>
		<br>
		 <br>         
		  <table class="table">
			<thead>
			  <tr>
				<th>Codigo</th>
				<th>Nome</th>
				<th>Apartamento</th>
				<th>Ações</th>
			  </tr>
			</thead>
			<tbody>
			  <tr>
				<td>1</td>
				<td>Doe</td>
				<td>1</td>
				<td>
					<button type="button" class="btn btn-danger" data-toggle="modal" data-target="#exampleModal">Excluir</button>
				</td>
			  </tr>
			  <tr>
				<td>2</td>
				<td>Moe durel jon Curl</td>
				<td>2</td>
				<td>
					<a href="home.html" class="btn btn-danger" data-toggle="modal" data-target="#exampleModal">Excluir</a>
				</td>
			  </tr>
			  <tr>
				<td>3</td>
				<td>Dooley José Comelli</td>
				<td>3</td>
				<td>
					<a href="home.html" class="btn btn-danger" data-toggle="modal" data-target="#exampleModal">Excluir</a>
				</td>
			  </tr>
			  <tr>
				<td>4</td>
				<td>Dario Almeida</td>
				<td>4</td>
				<td>
					<a href="home.html" class="btn btn-danger" data-toggle="modal" data-target="#exampleModal">Excluir</a>
				</td>
			  </tr>
			  <tr>
				<td>5</td>
				<td>Camilo Dias</td>
				<td>5</td>
				<td>
					<a href="home.html" class="btn btn-danger" data-toggle="modal" data-target="#exampleModal">Excluir</a>
				</td>
			  </tr>
			  <tr>
				<td>6</td>
				<td>Camilo Dias</td>
				<td>6</td>
				<td>
					<a href="home.html" class="btn btn-danger" data-toggle="modal" data-target="#exampleModal">Excluir</a>
				</td>
			  </tr>
			  <tr>
				<td>Adicionar novo integrantes</td>
				<td colspan="3">    
					<div class="col-md-12">
                  <div class="form-group">
                     <select class="custom-select" required>
                        <option value="">Escolha uma Grupo</option>
                        <option value="1">Grupo 1</option>
                        <option value="2">Grupo 2</option>
                        <option value="3">Grupo 3</option>
                     </select>
                  </div>
               </div>
				</td>
			  </tr>
			</tbody>
		  </table>
		  <hr>
		  <br>
          <a href="adicionar-usuario-predio-sindico.html" class="btn btn-primary" >Voltar</a>
		</div>
		
		<!-- Modal -->
		<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
		  <div class="modal-dialog" role="document">
			<div class="modal-content">
			  <div class="modal-header">
				<h5 class="modal-title">Excluir inquilino</h5>
				<button type="button" class="close" data-dismiss="modal" aria-label="Close">
				  <span aria-hidden="true">&times;</span>
				</button>
			  </div>
			  <div class="modal-body">
				<p>Você realmente deseja excluir este inquilino do seu grupo?</p>
			  </div>
			  <div class="modal-footer">
				<button type="button" class="btn btn-secondary" data-dismiss="modal">Cancelar</button>
				<button type="button" class="btn btn-danger">Excluir</button>
			  </div>
			</div>
		  </div>
		</div>
		
		
      <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
      <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
      <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" crossorigin="anonymous"></script>
   </body>
</html>