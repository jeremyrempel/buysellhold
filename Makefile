docker-start:
	sudo docker-compose -f stack.yml up

docker-stop:
	sudo docker-compose -f stack.yml down

build-image:
	sudo ./gradlew clean bootBuildImage
