Proyecto de reconocimiento de imagenes de carnes

Proyecto de desarrollo de red neuronal en Jupyter Notebook para el reconocimiento de imagenes.

La estructura del presente proyecto es la siguiente:

    Generar un entorno Jupyter Notebook.
    Cargar en una carpeta los archivos .ipynb en el entorno Jupyter.
    Cargar el dataset que se encuentra en la URL: https://drive.google.com/file/d/1Z5DJ-MVS1TQV1kow9mIFWTec-ZdOLRLF/view?usp=sharing
    Colocar el dataset en la misma carpeta. Esta carpeta posee dos subcarpetas con grupos o clases de dataset grafico para train del modelo y para test del modelo.
    Correr el archivo usando el notebook de Jupyter Entrenamiento.ipynb y se generaran los archivos model.h5 y weights.h5 en la carpeta ./modelo.
    Correr los dos archivos de Matriz_Datatest.ipynb y Matriz_Datatrain.ipynb para poder interpretar la matriz de confusiongenerada sobre el dataset de train y de test.
    Verificar el entrenamiento con el archivo Prueba.ipynb, cambiando la ruta del grafico, tomado de la carpeta ./test del Dataset en cuestion.
    Si la prediccion genera algun error, verificar la matriz de cofusion para interpretar la misma.
