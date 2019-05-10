FROM node:10-alpine

RUN echo "http://mirrors.aliyun.com/alpine/v3.9/main/" > /etc/apk/repositories
RUN echo "https://mirrors.aliyun.com/alpine/v3.9/community/" >> /etc/apk/repositories

RUN yarn global add osrm

RUN mkdir ~/.pip
RUN echo $'[global] \n\
timeout = 6000 \n\
index-url = http://pypi.douban.com/simple/ \n\
[install] \n\
use-mirrors = true \n\
mirrors = http://pypi.douban.com/simple/ \n\
trusted-host = pypi.douban.com' > ~/.pip/pip.conf
