build:
	mvn clean package docker:build

start:
	docker-compose up -d