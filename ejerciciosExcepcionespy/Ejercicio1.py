# -*- coding: utf-8 -*-
'''
Created on 2 abr. 2019
Realiza un programa que pida 6 números por teclado y nos diga cuál es el
máximo. Si el usuario introduce un dato erróneo (algo que no sea un número
entero) el programa debe indicarlo y debe pedir de nuevo el número.

@author: Álvaro Leiva Toledano
@version 1.0
'''

array = []

for i in range(6):
    
    while True:
        try:
            array.append(int(input("Introduce el número de índice "+ str(i)+": ")))
            break  
        except:
            print("No has introducido un número entero. Inténtalo de nuevo.")

print("El número maximo introducido es el " + str(max(array)))