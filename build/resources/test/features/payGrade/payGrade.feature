Feature: Adicionar Pay Grade
  Como usuario administrativo
  deseo agregar un nuevo nivel de Pay Grade
  con el fin de actualizar la informacion en sistema

  Scenario: Adicion de un nuevo Pay Grade
    Given que el usuario administrativo ingreso a la seccion pay grades
    When el usuario adiciona un pay grade incluyendo los datos de currency
    Then debera aparecer el pay grade en la tabla junto al currency