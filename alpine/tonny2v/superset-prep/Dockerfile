FROM tonny2v/superset-python-nodejs

COPY ./requirements.txt .
COPY ./requirements-dev.txt .
COPY ./requirements-extra.txt .

RUN rm -rf /root/.cache/pip
RUN pip3 install -U setuptools pip
RUN pip3 install -r requirements.txt -r requirements-dev.txt -r requirements-extra.txt \
    && rm -rf /root/.cache/pip

COPY ./pydruid /root/pydruid
RUN cd /root/pydruid; python3 ./setup.py install \
    && rm -rf /root/pydruid
