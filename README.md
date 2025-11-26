# POO_FinalProject_Ramirez - Ticket Office with Swing
## Integrantes: Michael Ramírez Gómez (63421) 

El programa tiene como objetivo simular una oficina de venta de tiquetes para eventos, en la cual se puede realizar el registro de los eventos, lugares fisicos, clientes y agregar las localidades de los eventos. El sistema permite la venta y registro de tiquetes para cada uno de los eventos por el cliente seleccionado, se guardan los tiquetes tanto en la oficina de tiquetes, como en el evento y el cliente.

## Descripción General del Sistema

 El alcance del proyecto abarca la venta de tiquetes y la modificación de ciertos atributos de los objetos derivados de las clases principales, teniendo en cuenta aspectos como la capacidad del lugar fisico y algunas restricciones que permiten llevar a cabo una configuración robusta del software, cuidando la eliminación de eventos o localdiades si estos ya cuentan con tiquetes vendidos a los clientes. Ademas, el software guarda la información de la clase principal ticket office al realizar operaciones importantes como agregar clientes, eventos, lugares fisicos(venues) y la venta de tiquetes para no perder la información cuando se abre y se cierra el sistema. Finalmente se puede optar por guardar la lista de clientes, eventos y venues en archivos CSV independientes. 

 El funcionamiento del programa depende del estado en que se encuentra la oficina puesto que si no se tienen venues, clientes o eventos, entonces el funcionamiento del software comenzara por realizar el registro de estos objetos, ya que si bien se podra acceder a todas las caracteristicas, cuando se vaya a realizar un proceso como la compra de tiquetes entonces enviara un mensaje de alerta porque no se tiene eventos o clientes, así el alcance funcional se limita. Por otro lado, cuando ya se hayan agregado objetos de las clases clientes, venues y eventos, es momento de agregar localidades a los eventos, con el fin de separar la venta de tiquetes por localidades. Suponiendo que el estado del programa ya cuenta con los diferentes objetos para su funcionamiento general, entonces se podran realizar cada una de las funcionalidades integradas en cada una de las pantallas. Donde se podran agregar, modificar, listar, buscar y eliminar objetos. 

 Para la realización de las pruebas de funcionamiento del software se diseño una clase denominada DemoData la cual cuenta con datos de demostración para mostrar como funciona el proyecto, si se desea se puede trabajar con estos datos de manera inicial con el fin de comprobar que todas las caracteristicas cumplen con el proposito para el cual fueron diseñadas.

 ## Instrucciones para Ejecutar el Programa
