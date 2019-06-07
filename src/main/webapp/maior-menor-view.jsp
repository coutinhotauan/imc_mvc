<!DOCTYPE html>
<html lang="pt-br">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    
    <title>IMC</title>

    <!-- Bootstrap -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <link href="estilo.css" rel="stylesheet">

  </head>
  <body>
    <div class="container">
        <div class="row justify-content-md-center">
            <div class="panel-heading">
                <h3 class="panel-title">Calcule seu IMC</h3>
            </div>
            <br>
            <div class="col-md-auto">
                <form>
                    <fieldset>

                        <div class="form-group">
                        	<label for="altura">Altura</label>
                            <input class="form-control" placeholder="Altura" name="altura" type="text">
                        </div>

                        <div class="form-group">
                        	<label for="peso">Peso</label>
                            <input class="form-control" placeholder="Peso" name="peso" type="text">
                        </div>

                        <button class="btn btn-success">Calcular</a>

                        <br>
                    </fieldset>
                </form>
            </div>

			<div class="alert alert-primary" role="alert">
  				${resultado}
			</div>
        </div>
    </div>
 </body>
</html>
