Reglas

Usuarios

·RN-01: Para registrarse, un usuario debe facilitar DNI, nombres, apellidos, correo electrónico y teléfono; todos son obligatorios.

·RN_02: El DNI es único; No pueden existir dos usuarios con el mismo DNI.

·RN-03: EL correo eletrónico es único; no puede estar asociado a más de un usuario.

Libros

·RN-04: Cada libro se identifica por su ISBN, que es único.

·RN-05: Un libro debe tener título, autor, ISBN, año y cantidad total de ejemplares; la editorial es opcional.

·RN-06: La cantidad total de ejemplares de un libro debe ser, al menos, 1 en el momento de su creación.

·RN-07: Los ejemplares disponibles de un libro son su total menos sus préstamos activos, y nunca pueden ser negativos.

·RN-08: Un libro no se elimina; se da de baja. Un libro dado de baja no aparece en la web ni puede prestarse.

·RN-09: No se puede dar de baja un libro que tenga préstamos activos.

Préstamos

·RN-10: Solo se puede retirar un libro que no esté dado de baja y tenga al menos un ejemplar disponible.

·RN-11: Un usuario no puede tener más de 3 préstamos activos a la vez.

·RN-12: Un usuario no puede tener a la vez dos préstamos activos del mismo libro.

·RN-13: Un usuario con algún préstamo vencido no puede retirar libros hasta devolverlo.

·RN-14: Cada préstamo tiene un identificador único y corresponde a un solo usuario y a un solo ejemplar de un libro.

·RN-15: Al registrar un préstamo se guardan la fecha de retirada y la fecha de vencimiento, que es un mes posterior a la retirada.

·RN-16: Un préstamo está activo mientras no tenga fecha de devolución, y está vencido si está activo y su fecha de vencimiento ya pasó.

Devoluciones

·RN-17: Una devolución se realiza sobre un préstamo concreto, que debe existir y estar activo.

·RN-18: Al devolver, se registra la fecha de devolución real, que no puede ser anterior a la de retirada.

Penalizaciones

·RN-19: Si un préstamo se devuelve después de su fecha de vencimiento, el usuario queda penalizado 2 días por cada día de retrado, y la fecha en que acaba la penalización se guarda en su fecha.

·RN-20: Mientras la penalización esté vigente, el máximo de préstamos activos del usuario baja a un valor reducido (1).
