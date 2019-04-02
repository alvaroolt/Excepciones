# -*- coding: utf-8 -*-
'''
Created on 2 abr. 2019
Modifica la clase Gato vista anteriormente añadiendo el método apareaCon.
Este método debe comprobar que los gatos son de distinto sexo, tras lo cual,
genera un nuevo gato. Por ejemplo, sería válido algo como Gato cria =
garfield.apareaCon(lisa). En caso de que los gatos sean del mismo sexo, el
método debe generar la excepción ExcepcionApareamientoImposible. Crea un
programa desde el que se pruebe el método.

@author: Álvaro Leiva Toledano
@version 1.0
'''

from ejerciciosExcepcionespy.gato.Gato import Gato

Garfield = Gato("macho")
Tom = Gato("macho")
Vanesa = Gato("hembra")
Pixy = Gato("hembra")

try:
    Garfield.apareaCon(Vanesa)
    Pixy.apareaCon(Vanesa)
except:
    print("La excepción se ha capturado correctamente.")