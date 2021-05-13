FROM python:3-alpine

RUN sed -i 's/dl-cdn.alpinelinux.org/mirrors.aliyun.com/g' /etc/apk/repositories

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
    apk add --no-cache --virtual .build-deps g++ && \
    ln -s /usr/include/locale.h /usr/include/xlocale.h && \
    apk --update-cache --no-cache add tzdata gcc make freetype-dev gfortran musl-dev g++ libgcc musl gfortran lapack-dev &&\
    pip install numpy && \
    pip install pandas && \
    pip install scipy && \
    apk del .build-deps
