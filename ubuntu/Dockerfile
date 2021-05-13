FROM ubuntu:18.04
# 签名
MAINTAINER tonny "tonny.achilles@gmail.com"
ENV DEBIAN_FRONTEND noninteractive

# 更新源，安装ssh server
RUN echo 'deb-src http://archive.ubuntu.com/ubuntu bionic main restricted #Added by software-properties \n\
deb http://mirrors.aliyun.com/ubuntu/ bionic main restricted \n\
deb-src http://mirrors.aliyun.com/ubuntu/ bionic main restricted multiverse universe #Added by software-properties \n\
deb http://mirrors.aliyun.com/ubuntu/ bionic-updates main restricted \n\
deb-src http://mirrors.aliyun.com/ubuntu/ bionic-updates main restricted multiverse universe #Added by software-properties \n\
deb http://mirrors.aliyun.com/ubuntu/ bionic universe \n\
deb http://mirrors.aliyun.com/ubuntu/ bionic-updates universe \n\
deb http://mirrors.aliyun.com/ubuntu/ bionic multiverse \n\
deb http://mirrors.aliyun.com/ubuntu/ bionic-updates multiverse \n\
deb http://mirrors.aliyun.com/ubuntu/ bionic-backports main restricted universe multiverse \n\
deb-src http://mirrors.aliyun.com/ubuntu/ bionic-backports main restricted universe multiverse #Added by software-properties \n\
deb http://archive.canonical.com/ubuntu bionic partner \n\
deb-src http://archive.canonical.com/ubuntu bionic partner \n\
deb http://mirrors.aliyun.com/ubuntu/ bionic-security main restricted \n\
deb-src http://mirrors.aliyun.com/ubuntu/ bionic-security main restricted multiverse universe #Added by software-properties \n\
deb http://mirrors.aliyun.com/ubuntu/ bionic-security universe \n\
deb http://mirrors.aliyun.com/ubuntu/ bionic-security multiverse' > /etc/apt/sources.list

RUN mkdir /root/.pip
RUN echo '[global] \n\
timeout = 6000 \n\
index-url = http://pypi.douban.com/simple/ \n\
[install] \n\ \n\
use-mirrors = true \n\
mirrors = http://pypi.douban.com/simple/ \n\
trusted-host = pypi.douban.com'> /root/.pip/pip.conf

RUN apt update
RUN apt -y upgrade
RUN apt install -y python3-numpy python3-matplotlib python3-scipy python3-pandas
