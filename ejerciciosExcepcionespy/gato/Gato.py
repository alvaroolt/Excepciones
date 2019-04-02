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

from ejerciciosExcepcionespy.gato.ApareamientoNoPosibleException import ApareamientoNoPosibleException

class Gato:
    
    def __init__(self,sexo):
        self.sexo=sexo
        
    def getSexo(self):
        return self.__sexo

    '''
    No los utilizo, no los necesito para comprobar la utilización de excepciones.
    
    def setColor(self,color):
        self.color=color
    
    def setRaza(self,raza):
        self.raza=raza
        
    def setEdad(self,edad):
        self.edad=edad
        
    def setPeso(self,peso):
        self.peso=peso
    '''
        
    def apareaCon(self, pareja): 
        if(self.sexo == pareja.sexo):
            raise ApareamientoNoPosibleException()
        else:
            print("Los gatos se han apareado.")