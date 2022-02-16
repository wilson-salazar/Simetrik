Feature: Busqueda en navegador Google
  Como usuario quiero buscar la palabra Simetrik en el navegador de Google y ver los diferentes resultados.

  Scenario: Ingresar a la pagina principal del buscador de Google
    Given El usuario se encuentra en la pagina principal del buscador
    When Escribe la palabra Simetrick en la barra de busqueda y presiona la tecla enter
    Then Debe direccionar a la pantalla de resultados de la busqueda