FROM python:3.7.1-alpine3.8

RUN echo "http://mirrors.aliyun.com/alpine/v3.8/main/" > /etc/apk/repositories
RUN echo "https://mirrors.aliyun.com/alpine/v3.8/community/" >> /etc/apk/repositories

RUN mkdir ~/.pip
RUN echo $'[global] \n\
timeout = 6000 \n\
index-url = http://pypi.douban.com/simple/ \n\
[install] \n\
use-mirrors = true \n\
mirrors = http://pypi.douban.com/simple/ \n\
trusted-host = pypi.douban.com' > ~/.pip/pip.conf

RUN apk update && \
    apk upgrade && \
    apk add --no-cache python3-dev libstdc++ net-tools curl htop && \
    apk --no-cache add --repository http://dl-cdn.alpinelinux.org/alpine/edge/testing dstat && \
    apk add --no-cache --virtual .build-deps g++ && \
    ln -s /usr/include/locale.h /usr/include/xlocale.h && \
    pip3 install numpy && \
    pip3 install pandas && \
    apk del .build-deps
