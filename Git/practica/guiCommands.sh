#execute 
# compilet chmod +x example.sh
# execute ./example.sh

spa	es	Spanish; Castilian	espagnol; castillan	Spanisch

git gui blame ./Ejemplo.java #Mostrar el contenido del archivo Makefile en el archivo actual directorio de trabajo, y proporcionar anotaciones tanto para el directorio autor original de cada línea, y quién movió la línea a su Ubicación actual. El archivo no confirmado se anota y Los cambios no confirmados (si los hay) se atribuyen explícitamente a Not Yet Committed.

git gui blame v0 ./Ejemplo.java #Muestre el contenido de Makefile en la revisión v0.99.8 y proporcione anotaciones para cada línea. A diferencia de lo anterior Ejemplo: el archivo se lee de la base de datos de objetos y no el directorio de trabajo.

git gui blame --line = 1 ./Ejemplo.java #Carga las anotaciones como se ha descrito anteriormente y automáticamente desplaza la vista hasta el centro en la línea 100.

git gui citool #Haga una confirmación y regrese al shell cuando esté completa. Este comando devuelve un código de salida distinto de cero si la ventana fue cerrada de cualquier otra manera que no sea mediante una confirmación.

git gui citool --amend Ingrese automáticamente al modo Modificar(Amend Last Commit) última confirmación de la interfaz.

git gui citool --nocommit #Se comporta como citool normal, pero en lugar de hacer una confirmación Simplemente termine con un código de salida cero. Todavía verifica que el índice no contiene ninguna entrada no combinada, por lo que puedes usarlo como una versión GUI de git-mergetool[1]

git citool #Igual que (arriba).git gui citool

git gui browser maint #Muestra un navegador para el árbol de la rama maint. Archivos seleccionado en el navegador se puede ver con el botón interno blame viewer.