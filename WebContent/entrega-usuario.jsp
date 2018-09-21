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
			<a class="nav-link" >Configurações<span class="sr-only"></span></a>
		  </li>
		</ul>

	  </div>
	</nav>
	
	
   
      <div class="container">
		<br>
		<br>
		<h3>Lista de entregas</h3>
		<p>Você tem (1) entregas pendentes.</p>
		<br>
		 <br>         
		  <table class="table">
			<thead>
			  <tr>
				<th>Codigo</th>
				<th>Descrição</th>
				<th>Data de entrega</th>
				<th>Remetente</th>
				<th>Status</th>
			  </tr>
			</thead>
			<tbody>
			  <tr>
				<td>1</td>
				<td>Cartas do mes de Outubro</td>
				<td>01/10/2018</td>
				<td>Geral</td>
				<td>
					À retirar
				</td>
			  </tr>
			  <tr>
				<td>2</td>
				<td>Cartas do mes de Setembro</td>
				<td>01/09/2018</td>
				<td>Geral</td>
				<td>
					Retirado
				</td>
			  </tr>
			</tbody>
		  </table>
		  <hr>
		  <br>
          <a href="dashboard-usuario.html" class="btn btn-primary" >Voltar</a>
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