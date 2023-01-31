
# Proyecto pinta_log_usando_log4j_obsoleto

# (NO USAR)

Este es una practica de log4j, el cual no debemos usar (Tiene importantes vulnerabilidades 
y no tiene soporte) sustituir por
- log4j2 https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j o
- Apache Commons Log4J https://commons.apache.org/proper/commons-logging/
Usando un facade slf4j para abstraer la implementacion


Log4J distingue entre 
- loggers: Son responsables de generar mensajes
- appenders: Envian esos mensajes a algún lugar (un archivo, la consola, una base de datos, ...)
