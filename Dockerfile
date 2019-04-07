FROM mhart/alpine-node:latest

MAINTAINER Your Name <you@example.com>

# Create app directory
RUN mkdir -p /spankins-lite
WORKDIR /spankins-lite

# Install app dependencies
COPY package.json /spankins-lite
RUN npm install pm2 -g
RUN npm install

# Bundle app source
COPY target/release/spankins-lite.js /spankins-lite/spankins-lite.js
COPY public /spankins-lite/public

ENV HOST 0.0.0.0

EXPOSE 3000
CMD [ "pm2-docker", "/spankins-lite/spankins-lite.js" ]
