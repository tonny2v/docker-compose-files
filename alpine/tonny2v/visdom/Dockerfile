FROM tonny2v/superset-prep

ENV APP visdom

RUN pip3 install visdom

ENTRYPOINT \
    export VISDOM_USERNAME=udian \
    export VISDOM_PASSWORD=udian123 \
    export VISDOM_USE_ENV_CREDENTIALS=1 \
    python3 -m visdom.server -enable_login
