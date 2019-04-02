# -*- coding: utf-8 -*-
'''
Created on 2 abr. 2019
Excepción que comprueba que no se puedan aparear gatos del mismo sexo.

@author: Álvaro Leiva Toledano
@version 1.0
'''

class ApareamientoNoPosibleException(Exception):
    def __init__(self): 
        Exception.__init__(self)
        print("No pueden aparearse dos gatos del mismo sexo.")