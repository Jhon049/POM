# Plan de Pruebas POM

Se realiza plan de pruebas para verificación del módulo **Pay Grade** del sitio web [https://opensource-demo.orangehrmlive.com/](https://opensource-demo.orangehrmlive.com/)

- **Alcance de Pruebas**
    
    El alcance de las pruebas se determina según cada HU.
    
    - **HU001 - Pay Grade**
        - Alcance de pruebas
            - Añadir un Pay Grade no existente.
            - Agregar al Pay Grade creado los datos de un Currency
        - Fuera de Alcance
            - No se validará más de un currency
            - No se validarán módulos diferentes
            - No se validará en diferentes navegadores web
            - No se validarán rangos de aceptación en datos de currency

- **Estrategia de Pruebas**
    
    Realizadas bajo el patrón POM con Page Factory, a través de 1 escenario determinado por la Historia de Usuario determinando el funcionamiento.
    
- **Cronograma de Entrega**
    
    Se realiza la entrega de todas las pruebas automatizadas funcionando verificado dentro del plazo establecido.
    
- **Otros Tipos de Pruebas**
    
    Se recomienda al equipo realizar las siguientes pruebas:
    
    - Pruebas de Rendimiento
    - Pruebas de Seguridad
    - Pruebas de Mantenimiento
- **Requerimientos**
    
    Se requiere acceso a la web propiedad de tercero, las credenciales son públicas. La disponibilidad de la web no es constante.
    
- **Acuerdos**
    
    Se debe garantizar la ejecución de las pruebas en cualquier equipo siempre que cuente con el software requerido.
