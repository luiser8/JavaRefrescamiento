#Patrones de diseño
	## Conceptos
		* Factory
			* Es un patrón de diseño creacional que resuelve el problema de crear objetos de producto 
			sin especificar sus clases concretas
		* Prototype
			* sirve para crear clonaciones de objetos (instancias de clases) a fin de no acarrear 
			todo lo que lleva la creación del mismo desde cero, parámetros, métodos a ejecutar, etc. 
			Hay que tener en cuenta que clonar un objeto es mucho mas rápido que crearlo.
		* Singleton
			* su funcion es limitar el máximo número de instancias de una clase en exactamente solo una. 
			En este caso, si más de un objeto necesita utilizar una instancia de la clase Singleton, 
			esos objetos comparten la misma instancia de la clase Singleton. 
		* Dependency Injection
			* Siempre ha sido uno de los conceptos que cuesta entender en el mundo del desarrollo de 
			software sobre todo a la gente que esta empezando. 
			¿Para qué sirve este patrón de diseño y cual es su utilizad? Normalmente cuando nosotros 
			programamos en el día a día con la programación orientada a objeto nos encontramos construyendo 
			objetos y relacionando objetos utilizando dependencias.
		* Decorator
			* Permite añadir responsabilidades a objetos concretos de forma dinámica. 
			Los decoradores ofrecen una alternativa más flexible que la herencia para extender las funcionalidades.