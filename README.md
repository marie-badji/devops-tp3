# Devops-tp3

Ce tp a été fait avec docker compose

Structure du projet 

todo-docker/
├── docker-compose.yml
├── README.md
├── server-back/
│   ├── Dockerfile
│   └── Todoapp-0.0.1-SNAPSHOT.jar
└── server-front/
    ├── Dockerfile
    └── build/
        ├── index.html
        └── static/


Lancer les containers
![Création de la VM](tp3/captures/docker_compose_up.png)

Vérifier que les conteneurs sont up
![Recherche de jdk](tp3/captures/les_conteneurs_up.png)

Test frontend: http://localhost:8081
![alt text](tp3/captures/test1.png)


Test backend : curl http://localhost:8080/api/taches
![alt text](tp3/captures/test2.png)


Test bd: docker exec -it server-dba mysql -u todouser -pTodo@2024! tododb -e "SELECT * FROM taches;"
![alt text](tp3/captures/test3.png)
