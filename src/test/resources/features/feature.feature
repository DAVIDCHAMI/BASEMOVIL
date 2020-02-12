#language: es

Característica: Autenticacion en App
  Como usuario de la app
  Quiero ingresar usuario y contrasena
  Para autenticarme en la aplicacion

  Esquema del escenario: Login exitoso
    Dado que el Actor se autentica en la app
    Cuando quiero autenticarme con usuario <usuario> con clave <clave>
    Entonces la autenticacion deberia de ser exitosa
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario    | clave | segundaClave |
   ##@externaldata@./src/test/resources/datadriven/autenticacion/autenticacion.xlsx@Datos@1