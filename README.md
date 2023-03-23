# SIngleThread-MultiThread-with-Connection
# Activité Pratique N° 1 : Programmation Résaux

## 1-  Modèle Multi Threads Blocking IO (java.io) : 

### - Développement d'un serveur de Multi Thread Blocking IO de ChatServer :
![image](https://user-images.githubusercontent.com/82038554/227289397-fae55f10-75f8-410f-8b59-9af76f58e031.png)

### - Test du serveur avec un client Telnet :
    telnet localhost 2002
![image](https://user-images.githubusercontent.com/82038554/227297722-d2a77a2e-1102-4975-a7be-ebca913b1a79.png)

### - Création un client Java avec une interface graphique JavaFX :
![image](https://user-images.githubusercontent.com/82038554/227290658-783adb65-812e-4183-9643-0b7428749f6a.png)

### - Création un client Python :
![image](https://user-images.githubusercontent.com/82038554/227291581-5bdb98ab-8fa9-4caf-a84d-2b2a0faa1e69.png)

## 2- Modèle Single Thread avec Non Blocking IO (java.nio) : 

### - Développement d'un serveur de Single Thread  utilisant des entrées sorties non bloquantes :
![image](https://user-images.githubusercontent.com/82038554/227294297-5216e5b3-563b-486e-a2d9-7a04e9605e50.png)

### - Test du serveur avec un client Telnet, un client java et un client d'un autre langage :
#### Telnet :
    telnet localhost 4444
![image](https://user-images.githubusercontent.com/82038554/227296035-1486e42b-4150-44be-a435-967a6179e356.png)

#### Client Java :
![image](https://user-images.githubusercontent.com/82038554/227294859-018dec48-54fe-4c73-9fcc-d78f7126ec86.png)

#### Client Python :
![image](https://user-images.githubusercontent.com/82038554/227295223-a2c44f60-eb63-4c7a-a31d-6232898cc36d.png)

### 3- Utiliser un outil Comme JMeeter pour tester les performances des deux serveurs

### Multi-Thread server :
![image](https://user-images.githubusercontent.com/82038554/227378746-971d5a72-88bf-43d8-9759-af5e9c068237.png)

### Single-Thread server:
![image](https://user-images.githubusercontent.com/82038554/227378973-fa44b092-c5fb-46bd-9ddf-259ef3365a88.png)
