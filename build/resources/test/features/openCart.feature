# Alex Fabian Suarez Caviedes
  # 3/05/2022
@stories
Feature: Ingreso plataforma OpenCart
  @scenario1
  Scenario: Ingreso plataforma OpenCart
    Given Alex abre la pagina de OpenCart
    When Alex ingresa el usuario y la contrasena da click en iniciar session
    |srtUser|srtPassword|
    |demo|demo|
    Then Alex lee el mensaje en la interfaz de usuario
    |srtQuestion|
    |Dashboard|

  @scenario2
  Scenario: Visualizar perfil usuario
    Given Alex abre la pagina de OpenCart ingresa usuario y contrasena
      |srtUser|srtPassword|
      |demo|demo|
    When Alex da click en nombre de usuario y click en yourprofile
    Then Alex lee el mensaje en la interfaz de usuario de YourProfile
      |srtQuestion|
      |Profile|

  @scenario3
  Scenario: Visualizar Categorias Sistema
    Given Alex abre la pagina de OpenCart e ingresa los datos del login
      |srtUser|srtPassword|
      |demo|demo|
    When Alex da click en Catalog y click en categories
    Then Alex lee el mensaje en la interfaz de usuario de categories
      |srtQuestion|
      |Categories|