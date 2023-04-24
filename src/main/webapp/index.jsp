<%-- 
    Document   : index
    Created on : 23-04-2023, 13:46:53
    Author     : micke
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Calculadora interés simple</title>
  </head>
  <body>
    <div style="margin: 24px; padding: 24px; border: 1px solid #eee; border-radius: 2em; color: #546E7A">
      <h1 style="color:#37474f">Bienvenido!</h1>
      <h3 style="color:#37474f">Favor ingresa los datos solicitados para hacer el cálculo de interés simple.</h3>
    <form action="CalculoInteres" method="POST">
      <p>
        <label>Capital inicial: </label>
        <input type="number" name="capital_inicial" value="" placeholder="100.000" required/>
        <span> pesos.</span>
      </p>
      <p>
        <label>Tasa anual: </label>
        <input type="number" name="tasa_anual" value="" size="3" maxlength="3"  placeholder="10" required />
        <span>%.</span>
      </p>
      <p>
        <label>Periodo de inversión: </label>
        <input type="number" name="plazo_anho" value="" size="3" maxlength="3" placeholder="5" required />
        <span> años.</span>
      </p>
      <input style="color:#fff; padding: 10px 20px; background: #28892b; border: none; border-radius: 3em; cursor: pointer" type="submit" value="CALCULAR →"  name="calcular_interes" />
    </form>
    </div>

  </body>
</html>