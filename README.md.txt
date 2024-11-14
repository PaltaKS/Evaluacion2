echo "# Evaluación 2 Android Studio - Integración Firebase

## Cambios Implementados:
1. Estructura del Proyecto:
   - Creada carpeta models/
   - Implementada clase Usuario.java para gestión de datos
   - Modificado Register.java para conexión con Firebase
   - Configurados archivos gradle para Firebase

2. Configuración Firebase:
   - Agregado google-services.json
   - Implementada Realtime Database
   - Configurados permisos de acceso

## Pasos para Implementar:
1. Clonar el Repositorio:
   - git checkout firebase-integration

2. Verificar Acceso Firebase:
   - Acceder a https://console.firebase.google.com/
   - Seleccionar proyecto 'sumativa3'
   - Verificar acceso a Realtime Database

3. Probar Funcionalidad:
   - Ejecutar la aplicación
   - Registrar un nuevo usuario
   - Verificar en Firebase Console -> Realtime Database que los datos se guarden en:
     ```
     usuarios/
       ├── nombreUsuario/
       │   ├── nombreReal
       │   ├── email
       │   └── password
     ```

## Importante:
- Los permisos de Firebase ya están configurados
- No es necesario configurar Firebase nuevamente
- El proyecto está listo para funcionar al clonarlo
" > README.md