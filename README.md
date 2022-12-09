[Link README](https://jeffersondaviid.github.io/Programacion-II/)

<style>
@import url('https://fonts.cdnfonts.com/css/breakaway');
@import url('https://fonts.cdnfonts.com/css/citizen-dick');
@import url('https://fonts.cdnfonts.com/css/fearless-vampire-killer');

@import url('https://fonts.cdnfonts.com/css/godofwar');
@import url('https://fonts.cdnfonts.com/css/newton-howard-font');
@import url('https://fonts.cdnfonts.com/css/a-akhir-tahun');

* {
   box-sizing: border-box;
}
html,
body {
   background-color: #292c35 !important;
   color: #fff !important;
}
.title {
   font-family: GodOfWar;
   background: linear-gradient(#df1ffe, #42befc) !important;
   -webkit-background-clip: text !important;
   letter-spacing: 8px;
   color: transparent !important;
   margin-bottom: 0;

   /* font-size: 72px;
  background: -webkit-linear-gradient(#eee, #333);
  -webkit-text-fill-color: transparent; */
}

.tag {
   font-size: 23px;
   color: #ffa200;
   font-family: Lucida Handwriting;
   text-shadow: 3px 0 3px #000, 0 0 5px #ffa200, 0 0 10px #ffa200,
      0 0 20px #ffa200;
}

.autor {
   color: #00b4ff;
   font-size: 30px;
   font-family: Newton Howard Font;
   letter-spacing: 3px;
   text-shadow: 3px 2px 3px #000, 0 0 5px #00b4ff, 0 0 10px #00b4ff,
      0 0 20px #00b4ff;
}

.bimestre {
   background: linear-gradient(#42befc, #df1ffe) !important;
   font-family: GodOfWar, sans-serif;
   letter-spacing: 10px;
   -webkit-background-clip: text !important;
   color: transparent !important;
   margin-top: 0;
}

.container {
   position: relative;
}

.indicador {
   position: sticky;
   top: 0;
   right: 0;
   color: #f26;
   background-color: #292c35;
   font-size: 18px;
   font-weight: 500;
   z-index: 1;
}

.warning {
   border-left: 0.4rem solid !important;
   border-color: #f23 !important;
   border-top-left-radius: 25px;
   border-bottom-left-radius: 7px;
   background-color: #f231 !important;
   color: #fffc !important;
}

.sky {
   border-left: 0.4rem solid !important;
   border-color: #0ff !important;
   border-top-left-radius: 25px;
   border-bottom-left-radius: 7px;
   background-color: #0ff1 !important;
   color: #fffc !important;
}
.center {
   text-align: center;
}

.subtitulo {
   color: #0ff !important;
}

/* COLORES */

.morado {
   color: #f8f !important;
}

h3 {
   letter-spacing: 1.5px;
}

.menu-horizontal > li:hover {
   z-index: 100000;
}
.menu-vertical {
   position: absolute;
   display: none;
   list-style: none;
   width: 100%;
   background-color: #0ff1;
}

.menu-horizontal li:hover .menu-vertical {
   display: block;
   z-index: 100000;
}

pre {
   background-color: #3c3f49 !important;
   border: 2px solid #515663 !important;
   color: #fffd !important;
}

code {
   /* background-color: #f231 !important; */
   color: #ff9204dd !important;
}

em,
i {
   color: #00b4ff !important;
}

b,
strong {
   background-color: #ffa20088 !important;
}
</style>

<center>
<span class="title"> PROGRAMACION II </span><br>
<span class="tag"> < </span>
<span class="autor">JEFFERSON DAVID</span>
<span class="tag"> /> </span><br>
<span class="bimestre"> I BIMESTRE </span></center>

<p style="text-align:center;">
   <img style="height:100px;background-color: transparent;" loop="infinite"
   src="https://c.tenor.com/2Wu29iaHSYYAAAAi/coffee-lover-hot-coffee.gif"><br>
   <audio controls autoplay src="otrosNoTocar\sonido.mp3" ></audio>
</p>


# 🤣SEMANA 1
## PREPARANDO NUESTRAS HERRAMIENTAS...
### IDE
Tiene que tener:
- Compilador
- proyectos
- editor

> Compilador

Java tiene un interprete para cada tipo de sistema: Windows, OS, Linux... hay que descargar el interprete para cada sistema operativo. Transforma el programa en `byte code` "ceros y unos".

### INSTALAR

- EXTENSION PACK FOR JAVA
- PROJECT MANAGER FOR JAVA
- TEST RUNNER FOR JAVA

### COMANDOS
 - CTRL + SHIFT : Multicursor lineal vertical

### GIT REPOSITORIO - ALL CODE

gh repo clone JeffersonDaviid/Programacion-II


## GIT 
### Estos son los comandos más utilizados en Git

- `git init`: Iniciar el control de versiones
- `git add .`: agrega todos los archivos al stage
- `git commit -m "mensaje"`: Mensaje clave del commit, ser puntual no detallado
- `git push`: envía los cambios a la nube
- `git status -s`: Ver estado de los archivos

### Comandos necesarios pero no muy utilizados en Git
- `git config --global user.name "mi nombre"`: nombre usuario global
- `git config --global user.email "myemail@example.com"`: email del git
- `git log --oneline`: lista de todos los commits descendentemente
- `git remote add origin "link que github nos da al momento de crear el repositorio"`
- `git push -u origin master/main`: aquí podemos elegir pero por temas políticos se elige main


---
---


# 😆SEMANA 2

## CONOCIMIENTOS BASICOS
### Métodos 
- Retornan valor : `funcion`
- no retona valor : `procedimiento` - metodos

### Structura Básica

<blockquote class="warning">Regla de Java:<br>El nombre del archivo debe ser EL MISMO que el nombre de la clase y tiene que ir en Mayusculas</blockquote><br>

### Tipo de datos

#### Propios de Java
- String
- Integer
- Bool
- Int
- ...
#### Primitivos
- bool
- int
- ...

> Standart codif. : `camelCase`

### 
Propiedad = `Ambito` + variable  
- Ambito: public, private, protect
  >Ejemplo:       
  ``` java
  public class XXXX{
     public Integer edadUsuario = 21; // propiedad
  }
  ```
<blockquote class="warning">Hay que tener MUCHO CUIDADO con el TIPO DE DATO, usar SABIAMENTE.</blockquote><br>

### VARIABLE VS PROPIEDAD

``` java
public class XXXX{
   public Integer edad = 21; // propiedad
   public static void main(){
      String nombreUsuario = "David"; // variable
      String nombre; // ? declaración
      nombre = "Jefferson" // ? inicialización
   }
}
```
### PARAMETROS

Argumentos de una función.
> `main (String variable){...codigo}`

```java
public class App {
   public static void main(String args[]) {
      System.out.println("Hola Mundo :)");
   }
}
```


## Bibliotecas
Aquí algunas de las librerias más usadas y básicas, librerias del propio lenguaje, NO LIBRERIAS EXTERNAS.

### SCANNER

> import java.util.Scanner;     
> Scanner xxxx = new Scanner(System.in); // crear un objeto entrada     
> int valor = xxxx.nextInt(); // usar en numeros      
> string valor = xxxx.nextLine(); // usar en texto    

# 🙂SEMANA 3

# POO

## Creación de Métodos
### Métodos sin retorno de valor
```java
public void metodo(){
   // Instrucciones
}
```

Detalles:
1. `public :` modificador de acceso
2. `void :` valor de retorno (puede ir int, string...) 
3. `metodo :` nombre del método
4. `... :` argumentos que recive el método

### Métodos con retorno
```java
public int metodo(int a, int b){
   return a + b;
}
```
```java
public float metodo(int a, float b){
   return a + b;
}
```
```java
public float metodo(float a, float b){
   return a + b;
}
```
<blockquote class="sky">Puede exitir funciones con el mismo nombre pero DEBEN SER DE DISTINTO TIPO DE PARAMETRO<br>En el ejemplo anterior tenemos 3 sumas</blockquote>



RECURSOS
<blockquote class="warning">NotasImportantes </blockquote>
<blockquote class="sky">NotasImportantes</blockquote>
<h3 class="center subtitulo"> SUBTITUTLO🧠 </h3>
<span class="subtitulo">hola</span>

```python 
int hola = 23;0
```