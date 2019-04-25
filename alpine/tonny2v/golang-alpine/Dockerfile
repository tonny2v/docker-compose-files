FROM golang:1.12.4-alpine3.9

ENV http_proxy http://192.168.1.151:1087
ENV https_proxy http://192.168.1.151:1087
RUN apk add git
RUN go get github.com/gin-gonic/gin
RUN go get github.com/jinzhu/gorm
RUN go get github.com/jinzhu/gorm/dialects/postgres
RUN go get github.com/micro/go-micro
