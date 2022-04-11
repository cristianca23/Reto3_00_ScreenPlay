Feature: Como paciente
  Quiero realizar la solicitud de una cita médica
  A través del sistema de Administración de Hospitales

  @Escenario1
  Scenario: Realizar el Registro de un Doctor
    Given que Carlos necesita registrar un nuevo doctor
    When el realiza el registro del mismo en el aplicativo de Administracion de Hospitales
    Then el verifica que se presente en pantalla el mensaje Datos guardados correctamente.

  @Escenario2
  Scenario: Realizar el Registro de un paciente
    Given que Carlos necesita registrar un nuevo paciente
    When el realiza el registro del paciente en el aplicativo de Administracion de Hospitales
    | Nombre | Apellido | Telefono   |
    | Diego  | Marin    | 3128733243 |
    Then el verifica que se presente en pantalla el mensaje Datos guardados correctamente.

  @Escenario3
  Scenario:
    Given que Diego necesita asistir al medico
    When el realiza el agendamiento de una Cita
    Then el verifica que se presente en pantalla el mensaje Datos guardados correctamente.