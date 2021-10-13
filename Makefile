docker-start:
	sudo docker-compose -f stack.yml up

docker-stop:
	sudo docker-compose -f stack.yml down

build-image:
	pls docker build . -t bshapi

deploy:
	gcloud run deploy
