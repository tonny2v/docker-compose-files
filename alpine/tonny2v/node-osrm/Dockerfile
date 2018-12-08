FROM tonny2v/osrm-backend-nodejs
ENV NODE_PATH /usr/local/share/.config/yarn/global/node_modules
RUN yarn global add osrm 
RUN apk add libc6-compat python
RUN yarn global add mapnik
