<!DOCTYPE html>
<html lang="pt-br">
   <head>
      <title>Editar - Debot</title>
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
			<a class="nav-link" href="dashboard-usuario.html">Home<span class="sr-only"></span></a>
		  </li>
		  <li class="nav-item">
			<a class="nav-link" href="editar.html">Configurações</a>
		  </li>
		</ul>

	  </div>
	</nav>
	
	
   
      <div class="container">
		<br>
		<br>
		<h3>Editar dados</h3>
		<br>
		 <hr>
		 <br>
         <form class="needs-validation" novalidate>
            <div class="form-row">
               <div class="col-md-4 mb-3">
                  <label for="idNome">Nome d</label>
                  <input type="text" class="form-control" id="idNome" placeholder="Nome" value="" required>
               </div>
               <div class="col-md-4 mb-3">
                  <label for="idSobrenome">Sobrenome</label>
                  <input type="text" class="form-control" id="idSobrenome" placeholder="Sobrenome" value="" required>
               </div>
               <div class="col-md-4 mb-3">
                  <label for="idEmail">Email</label>
                  <input type="text" class="form-control" id="idEmail"  placeholder="Email" aria-describedby="validationTooltipUsernamePrepend" required>
               </div>
            </div>
            <div class="row">
               <div class="col-md-12">
                  <div class="form-group">
                     <label>Sindico</label>
                     <select class="custom-select" required>
                        <option value="">Escolha um sindico para o prédio</option>
                        <option value="1">Manuel Dias</option>
                        <option value="2">Oscar Silva</option>
                        <option value="3">Carlos Alberto</option>
						<option value="3">Paulo Siqueira</option>
                     </select>
                  </div>
               </div>
            </div>
            <div class="form-row">
               <div class="col-md-6 mb-3">
                  <label for="idCidade">Cidade</label>
                  <input type="text" class="form-control" id="idCidade" placeholder="Cidade" value="" required>
               </div>
               <div class="col-md-3 mb-3">
                  <div class="form-group">
                     <label>Tipo Usuário</label>
                     <select class="custom-select" required>
                        <
                        <option value="">Selecione seu Estado</option>
                        <option value="AC">Acre</option>
                        <option value="AL">Alagoas</option>
                        <option value="AP">Amapá</option>
                        <option value="AM">Amazonas</option>
                        <option value="BA">Bahia</option>
                        <option value="CE">Ceará</option>
                        <option value="DF">Distrito Federal</option>
                        <option value="ES">Espírito Santo</option>
                        <option value="GO">Goiás</option>
                        <option value="MA">Maranhão</option>
                        <option value="MT">Mato Grosso</option>
                        <option value="MS">Mato Grosso do Sul</option>
                        <option value="MG">Minas Gerais</option>
                        <option value="PA">Pará</option>
                        <option value="PB">Paraíba</option>
                        <option value="PR">Paraná</option>
                        <option value="PE">Pernambuco</option>
                        <option value="PI">Piauí</option>
                        <option value="RJ">Rio de Janeiro</option>
                        <option value="RN">Rio Grande do Norte</option>
                        <option value="RS">Rio Grande do Sul</option>
                        <option value="RO">Rondônia</option>
                        <option value="RR">Roraima</option>
                        <option value="SC">Santa Catarina</option>
                        <option value="SP">São Paulo</option>
                        <option value="SE">Sergipe</option>
                        <option value="TO">Tocantins</option>
                     </select>
                  </div>
               </div>
               <div class="col-md-3 mb-3">
                  <label for="idCEP">CEP</label>
                  <input type="text" class="form-control" id="idCEP" placeholder="CEP" value="" required>
               </div>
            </div>
            <div class="form-row">
               <div class="col-md-4 mb-3">
                  <label for="idRua">Rua</label>
                  <input type="text" class="form-control" id="idRua" placeholder="Rua" value="" required>
               </div>
               <div class="col-md-4 mb-3">
                  <label for="idNumero">Número</label>
                  <input type="text" class="form-control" id="idNumero" placeholder="Número" value="" required>
               </div>
               <div class="col-md-4 mb-3">
                  <label for="idComplemento">Complemento</label>
                  <input type="text" class="form-control" id="idComplemento"  placeholder="Complemento">
               </div>
            </div>
            <div class="form-row">
               <div class="col-md-6 mb-3">
                  <label for="idSenha">Senha</label>
                  <input type="password" class="form-control" id="idSenha" placeholder="Senha" value="" required>
               </div>
               <div class="col-md-6 mb-3">
                  <label for="idRepetirsenha">Repetir Senha</label>
                  <input type="password" class="form-control" id="idRepetirsenha" placeholder="Repetir Senha" value="" required>
               </div>
            </div>
            <div class="row">
               <div class="col-md-12">
                  <div class="form-group">
                     <label>Tipo Usuário</label>
                     <select class="custom-select" required>
                        <option value="">Escolha o tipo do seu Usuário</option>
                        <option value="1">Inquilino</option>
                        <option value="2">Sindico</option>
                        <option value="3">Porteiro</option>
                     </select>
                  </div>
               </div>
            </div>
			<br>
            <button class="btn btn-primary" type="submit">Atualizar</button>
            <a href="dashboard-usuario.html" class="btn btn-primary" >Voltar</a>
         </form>
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