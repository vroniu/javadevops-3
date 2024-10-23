# Running the hello world container
Docker provides a simple hello world container, so I used that:
```sh
docker run hello-world
```

# Running the HTML page
I found this image of a HTTP echo server from Hashicorp that seemed to be approperiate for this task as it was lightweight, easy to configure.
```sh
docker run -p 80:80 hashicorp/http-echo -listen=:80 -text="Grzegorz 2024"
```