
# Proyecto pinta_log_usando_log4j_simple

No usar log4j (Tienne una gran vulnerabilidad y no tiene soporte) sustituir por
log4j2 https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j o  slf4j


Log4J distingue entre 
- loggers: Son responsables de generar mensajes
- appenders: Envian esos mensajes a algún lugar (un archivo, la consola, una base de datos, ...)

En el log4j.properties el ``log4j.rootLogger``, es el logger raiz


registrador enviará mensajes a todos los anexadores que se adjuntan directamente a él, o a cualquiera de sus ancestros en la jerarquía
