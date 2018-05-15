# practica-maven
Repo para pequeño taller en Objetos 2 explicando un poquito el mundo Maven

## Paso a paso lo que deberían realizar previamente.
1. Tener Eclipse (revisar que sus versiones ya traigan incorporado Maven)
2. Clonar el repositorio donde deseen
3. Importarlo en Eclipse mediante:
	* File
	* Open projects from File System
	* Buscar desde el bótón directory hasta el raiz del proyecto.
	* Apretar Finish
4. Update project (alt + F5 atajo)
	* Click secundario en el proyecto -> Maven -> Update project

## Probar los comandos haciendo click secundario en el proyecto -> Run as ->

1. Maven install
	* Instala los paquetes que están descargados en el repo local de tu pc.
2. Maven test
	* Corre los tests usando el framework de testing configurado en nuestro pom.
3. Maven build 
	* Realiza todo lo que está configurado en nuestro pom (tests, deploy, integration-test, validate, deploy, etc).