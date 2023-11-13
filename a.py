import sqlite3

conexion = sqlite3.connect('mi_base_de_datos.db')


cursor = conexion.cursor()

# Ejecutar comandos SQL
cursor.execute('''CREATE TABLE IF NOT EXISTS usuarios (
                    id INTEGER PRIMARY KEY,
                    nombre TEXT,
                    email TEXT
                )''')

# Guardar los cambios y cerrar la conexión
conexion.commit()
conexion.close()
