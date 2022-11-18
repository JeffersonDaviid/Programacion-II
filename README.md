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
<span class="tag"> /> </span><br><br>
<span class="bimestre"> I BIMESTRE </span></center>


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


## GIT REPOSITORIO - ALL CODE

gh repo clone JeffersonDaviid/Programacion-II


---
---


# 😆SEMANA 2


RECURSOS
<blockquote class="warning">NotasImportantes</blockquote>
<blockquote class="sky">NotasImportantes</blockquote>
<h3 class="center subtitulo"> SUBTITUTLO🧠 </h3>
<span class="subtitulo">hola</span>

```cpp 
int x = 23;
```
# 🙂SEMANA 3




## ARBOL BINARIO - BINARY TREE

 Es una estructura de datos en la cual cada nodo puede tener un hijo izquierdo y un hijo derecho. No pueden tener más de dos hijos (de ahí el nombre "binario"). Usos comunes de los árboles binarios son los árboles binarios de búsqueda, los montículos binarios y Codificación de Huffman.

<span class="subtitulo">Estructura Básica</span>

 ![binary tree - parts](../CLASE_CPP/resource/img/arbol-binario_partes.jfif)

<span class="subtitulo">Tipos de árboles</span>

 ![binary tree - types](../CLASE_CPP/resource/img/arbol-binario_tipos.png)


<span class="subtitulo">CODE</span>

```cpp 
struct nodo
{
  int nro;
  struct nodo *izq, *der;
};

typedef struct nodo *ABB;
/* es un puntero de tipo nodo que hemos llamado ABB, que ulitizaremos
   para mayor facilidad de creacion de variables */
```

<span class="subtitulo">Procedimientos básicos</span>

1. Insertar     
2. Búsqueda preOrden            
3. Búsqueda enOrden     
4. Búsqueda postOrden       
5. Ver árbol            



  

<div class="container">
<div class="indicador"> SEMANdfgdfgdfgRBOLES- 15.08.2022 </div><br>

## ARBOL BINARIO - BINARY TREE

 Es una estructura de datos en la cual cada nodo puede tener un hijo izquierdo y un hijo derecho. No pueden tener más de dos hijos (de ahí el nombre "binario"). Usos comunes de los árboles binarios son los árboles binarios de búsqueda, los montículos binarios y Codificación de Huffman.

<span class="subtitulo">Estructura Básica</span>

 ![binary tree - parts](../CLASE_CPP/resource/img/arbol-binario_partes.jfif)

<span class="subtitulo">Tipos de árboles</span>

 ![binary tree - types](../CLASE_CPP/resource/img/arbol-binario_tipos.png)


<span class="subtitulo">CODE</span>

```cpp 
struct nodo
{
  int nro;
  struct nodo *izq, *der;
};

typedef struct nodo *ABB;
/* es un puntero de tipo nodo que hemos llamado ABB, que ulitizaremos
   para mayor facilidad de creacion de variables */
```

<span class="subtitulo">Procedimientos básicos</span>

1. Insertar     
2. Búsqueda preOrden            
3. Búsqueda enOrden     
4. Búsqueda postOrden       
5. Ver árbol            



  