FROM tonny2v/step0

# application folder
ENV APP_DIR /app
ENV PYTHONPATH "${PYTONPATH}:/app"

RUN apk update && \
    apk upgrade && \
    apk add --no-cache supervisor

COPY requirements.txt /app/
RUN mkdir -p ${APP_DIR}/web && \
	mkdir -p ${APP_DIR}/conf && \
	mkdir -p ${APP_DIR}/logs && \
	pip3 install -U pip && \
    pip3 install -r /app/requirements.txt && \
	echo "files = ${APP_DIR}/conf/*.ini" >> /etc/supervisord.conf

VOLUME ["${APP_DIR}"]
EXPOSE 5000

CMD ["supervisord", "-c", "/etc/supervisord.conf"]