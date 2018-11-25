FROM tonny2v/nodejs

# Enables customized options using environment variables
ENV OSRM_BACKEND='http://localhost:7002'
ENV OSRM_CENTER='22, 114'
ENV OSRM_ZOOM='13'
ENV OSRM_LANGUAGE='zh-Hans'
ENV OSRM_LABEL='Car (fastest)'

WORKDIR /src

RUN yarn install

# Run App
EXPOSE 9966
VOLUME [ "/src" ]

CMD ["npm", "start"]
