@echo off

set PREP_HOME=E:\Repositories\Github\ProiectareaTranslatoarelor\C--
set JAVA_HOME=C:\Program Files\Java\jdk1.8.0_121

"%JAVA_HOME%\BIN\java" -cp "%PREP_HOME%\LIB";"%PREP_HOME%\LIB\java-cup-11b.jar" %*
pause


